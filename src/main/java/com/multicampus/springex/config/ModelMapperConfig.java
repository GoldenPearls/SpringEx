package com.multicampus.springex.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //ModelMapperConfig가 스프링의 설정 빈으로 등록함을 명시
public class ModelMapperConfig {
    @Bean //bean 등록
    public ModelMapper getMapper(){
        //VO를 받아오는 코드
        // ModelMapper 라이브러리를 이용해서 객체 간의 매핑을 수행하는 설정 변경
        // ModelMapper는 객체 간의 속성값을 자동으로 매핑해주는 라이브러리로 객체 간의 변환 작업 편리
        ModelMapper modelMapper = new ModelMapper();
        // setFieldMatchingEnabled(true) : 필드 기반 설정, 객체의 필드들 간의 이름이 같은 경우 자동 매칭
        // setFieldAccessLevel : 매핑할 필드의 접근 레벨 지정하며, PRIVATE 레벨로 설정되어 있는 경우 private 접근 제어자로
        // 선언된 필드도 매핑 대상에 포함
        // setMatchingStrategy은 매칭 전략을 지정하면 STRICT 전략시, 매핑되지 않는 속성이 있는 경우 예외 발생하며 매핑 작업 실패
        modelMapper.getConfiguration().setFieldMatchingEnabled(true)
                .setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE) //setFieldAccessLevel : 레벨을 정함
                .setMatchingStrategy(MatchingStrategies.STRICT);
        return modelMapper;
    }
}
