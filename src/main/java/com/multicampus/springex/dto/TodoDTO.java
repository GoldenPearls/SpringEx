package com.multicampus.springex.dto;

import lombok.*;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@ToString
@Data //setter, getter을 알아서 처리 해줌
@Builder
// 모든 속성에 대한 아규먼트 처리
@AllArgsConstructor //public Todo(Long tno, String title){}을 만들어줌
@NoArgsConstructor //Default 생성자를 만들어줌
public class TodoDTO {

    private Long tno;
    @NotEmpty //Null, 빈 문자열 불가
    private String title;

    @Future //현재 보다 미래인가?
    private LocalDate dueDate;
    private boolean finished;

    @NotEmpty
    private String writer;
}
