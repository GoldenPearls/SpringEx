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
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setFieldMatchingEnabled(true)
                .setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE) //setFieldAccessLevel : 레벨을 정함
                .setMatchingStrategy(MatchingStrategies.STRICT);
        return modelMapper;
    }
}
