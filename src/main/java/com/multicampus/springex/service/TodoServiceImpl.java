package com.multicampus.springex.service;

import com.multicampus.springex.domain.TodoVO;
import com.multicampus.springex.dto.TodoDTO;
import com.multicampus.springex.mapper.TodoMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service //서비스 빈으로 등록
@Log4j2
@RequiredArgsConstructor //싱글톤으로 지정한 빈을 생성자 주입에 의해 injection
public class TodoServiceImpl implements TodoService{
    //의존성 주입이 필요한 객체타입을 final로 고정하고 생성자를 생성하여 주입
    // 해당 클래스의 의존성이며, final로 선언되어 변경되지 않음을 보장
    private final TodoMapper todoMapper;
    private final ModelMapper modelMapper;

    // todo 항목등록하는 메서드
    @Override
    public void register(TodoDTO todoDTO) {
        log.info(modelMapper);
        // modelMapper을 사용하여 TodoDTO 객체를 TodoVO객체로 변환하고
        // 이를 TodoMapper를 통해 데이터베이스 등록
        TodoVO todoVO = modelMapper.map(todoDTO, TodoVO.class);
        log.info(todoVO);
        //TodoMapper가 받음 => TodoMapper.xml이 들어가서 동작
        todoMapper.insert(todoVO);
    }

    // 구현 객체이기 때문에 TodoService가 바뀌면 바뀜
    // 모든 할 일 항목 조회
    @Override
    public List<TodoDTO> getAll() {

        // 데이터베이스에서 조회한 할일 항목을 VO에서 DTO로 변환하여 리스트로 반환하는 작업을 수행
        // todoMapper를 통해 데이터 베이스에서 모든 할일 조회 => stream 변환 => TodoDTO 변환
        // VO객체를 DTO 객체로 변환하여 매핑 => 리스트 수집후 생성
        List<TodoDTO> dtoList = todoMapper.selectAll().stream()
                .map(vo-> modelMapper.map(vo, TodoDTO.class))
                .collect(Collectors.toList());
        return dtoList;
    }

    @Override
    public TodoDTO getOne(Long tno) {
        // TodoService의 실제 동작
        //todoVO ==> todoDTO 변환
        TodoVO todoVO = todoMapper.selectOne(tno);
        TodoDTO todoDTO = modelMapper.map(todoVO, TodoDTO.class);
        return todoDTO;
    }

    @Override
    public void remove(Long tno) {
        todoMapper.delete(tno);
    }

    @Override
    public void modify(TodoDTO todoDTO) {
        TodoVO todoVO = modelMapper.map(todoDTO, TodoVO.class);
        todoMapper.update(todoVO);
    }


}
