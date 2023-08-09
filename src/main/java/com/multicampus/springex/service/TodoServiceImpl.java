package com.multicampus.springex.service;

import com.multicampus.springex.domain.TodoVO;
import com.multicampus.springex.dto.TodoDTO;
import com.multicampus.springex.mapper.TodoMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service //서비스 빈으로 등록
@Log4j2
@RequiredArgsConstructor //싱글톤으로 지정한 빈을 생성자 주입에 의해 injection
public class TodoServiceImpl implements TodoService{
    //의존성 주입이 필요한 객체타입을 final로 고정하고 생성자를 생성하여 주입
    private final TodoMapper todoMapper;
    private final ModelMapper modelMapper;

    @Override
    public void register(TodoDTO todoDTO) {
        log.info(modelMapper);
        TodoVO todoVO = modelMapper.map(todoDTO, TodoVO.class);
        log.info(todoVO);
        //TodoMapper가 받음 => TodoMapper.xml이 들어가서 동작
        todoMapper.insert(todoVO);
    }
}
