package com.multcampus.springex.sample.SampleTests;

import com.multicampus.springex.sample.SampleDAOImpl;
import com.multicampus.springex.sample.SampleService;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.sql.Connection;

@Log4j2
@ExtendWith(SpringExtension.class) //spring-test를 이용하기 위한 설정 Junit5버전, Junit4는 @Runwith 사용
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml")
public class SampleTests {

    @Autowired // spring에서 사용하는 의존성 주입 어노테이션
    // 어노테이션을 필드, 생성자, 메서드에 적용하여 스프링 컨테이너가 해당 타입의 빈(Bean) 객체를 자동으로 주입
    // 해당 타입의 빈이 존재한다면 여기에 주입해주기를 바란다.
    // 스프링 컨테이너가 sampleService를 넣어줌?
    private SampleService sampleService;

    @Autowired
    private DataSource dataSource;

    @Test
    public void testService(){
        log.info(sampleService);
        Assertions.assertNotNull(sampleService);
    }

    @Test
    public void testConnection() throws Exception{
        // 표준인 자바 인터페이스을 injection 해줘야함
        Connection con = dataSource.getConnection();
        log.info(con);
        Assertions.assertNotNull(con);
        //리소스기 때문에 반드시 닫아줘야 한다.
        con.close();
    }

}
