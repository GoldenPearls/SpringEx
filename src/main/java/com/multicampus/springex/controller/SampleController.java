package com.multicampus.springex.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //스프링 MVC에서 컨트롤러 역할, 스프링의 빈(Bean)으로 등록
@Log4j2 //Lombok 라이브러리에서 제공하는 어노테이션으로, 로깅(loggin) 기능을 자동으로 구현해주는 기능을 제공
public class SampleController {
    @GetMapping("/hello") //Get방식으로 들어오는 요청(request)을 처리하기 위한 에너테이션
    public void hello(){
        log.info("hello~"); //이것을 사용하기 위해 @Log4j2 선언
    }
}
