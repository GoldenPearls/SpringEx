package com.multicampus.springex.service;

import com.multicampus.springex.dto.TodoDTO;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations="file:src/main/webapp/WEB-INF/root-context.xml")
public class TodoServiceTests {
    @Autowired
    private TodoService todoService;

    @Test
    public void testRegister(){
        //todoDTO 생성
        TodoDTO todoDTO = TodoDTO.builder()
                .title("Test Todo 1")
                .dueDate(LocalDate.now())
                .writer("user2")
                .build();
        // 값을 넣어줌
        todoService.register(todoDTO);
    }
}