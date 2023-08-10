package com.multicampus.springex.mapper;

import com.multicampus.springex.domain.TodoVO;

import java.util.List;

public interface TodoMapper {
    String getTime();

    /*TodoVO를 파라미터로 입력받는 insert() 정의*/
    void insert(TodoVO todoVO); //일은 TodoMapper.xml이 함

    // 가장 최근에 등록된 글 순서대로 tb1_todo 테이블의 모든 row들을 가져온다. todolist_selectall 작업
    List<TodoVO> selectAll();

    // 목록 1개씩 상세보기
    TodoVO selectOne(Long tno);

    //delete
    void delete(Long tno);

    // 수정
    void update(TodoVO todoVO);

}
