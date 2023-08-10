package com.multicampus.springex.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
// 어떤 형태를 담을지 지정한해둠 E => 아무거나 담을 수 있는 확장성
public class PageResponseDTO<E> {

    private int page;
    private int size;
    private int total;

    //시작 페이지 번호
    private int start;
    //끝 페이지 번호
    private int end;

    //이전 페이지의 존재 여부
    private boolean prev;
    //다음 페이지의 존재 여부
    private boolean next;

    private List<E> dtoList;

    // 메소드 이름 지정
    // 모든 데이터를 받아와서 초기화 세팅 하겠다.
    @Builder(builderMethodName = "withAll")
    public PageResponseDTO(PageRequestDTO pageRequestDTO, List<E> dtoList, int total){

        this.page = pageRequestDTO.getPage();
        this.size = pageRequestDTO.getSize();

        this.total = total;
        this.dtoList = dtoList;

        this.end =   (int)(Math.ceil(this.page / 10.0 )) *  10;

        this.start = this.end - 9;

        int last =  (int)(Math.ceil((total/(double)size)));

        this.end =  end > last ? last: end;

        this.prev = this.start > 1;

        this.next =  total > this.end * this.size;

    }

    // 페이지 번호의 계산
    // 현재 페이지 번호 (page)
    // 화면에 10개씩 페이지 번호를 출력 page 1 => 시작 1, 마지막 10
    // if. page 10인 경우 : 시작 1, 마지막 10
    // if page 11인 경우 : 시작 11, 마지막 20

    // 올림하기 1/10 => ceil(0.1) => 올림 1 * 10 => 10
    // 1. 마지막 페이지 구하기
    /*this.end = (int)(Math.ceil(this.page / 10.0)) * 10;
    2. 시작 페이지
    this.start = this.end - 9;
    3. 전체 개수 123/10.0 => 12.3 => 올림 페이지 개수 13개 만들면 됨
    this.last = int(Math.ceil(total/(double)size))
    */

}
