package com.multicampus.springex.dto;

import lombok.*;

import java.time.LocalDate;

@ToString
@Data //setter, getter을 알아서 처리 해줌
@Builder
// 모든 속성에 대한 아규먼트 처리
@AllArgsConstructor //public Todo(Long tno, String title){}을 만들어줌
@NoArgsConstructor //Default 생성자를 만들어줌
public class TodoDTO {

    private Long tno;

    private String title;

    private LocalDate dueDate;

    private boolean finished;

    private String writer;
}
