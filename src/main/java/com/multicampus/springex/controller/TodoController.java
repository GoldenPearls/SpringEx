package com.multicampus.springex.controller;

import com.multicampus.springex.dto.TodoDTO;
import com.multicampus.springex.service.TodoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller //스프링 MVC에서 컨트롤러 역할, 스프링의 빈(Bean)으로 등록
@RequestMapping("/todo")
@Log4j2
@RequiredArgsConstructor //final로 지정해서 지정된 것만 주입하겠다.
public class TodoController {
    // injection을 안해서 데이터 베이스에 값이 넣어지지 않은 것
    private final TodoService todoService;

    @RequestMapping("/list") //localhost:8090/todo/list
    public void list(Model model){
        log.info("todo_list");
        // TodoService에서 리턴한 List<TodoDTO> getAll();을 model에다가 담기
        model.addAttribute("dtoList", todoService.getAll());
        //model 'dtoList' 이름으로 목록 데이터가 담겨있다. => list.jsp가 처리해줘야 함
    }

    //@RequestMapping(value="/register", method = RequestMethod.GET) //localhost:8090/todo/register
    @GetMapping("/register")
    /*제대로 불러오는지 확인하는 작업, 제대로 불러오면 콘솔에 뜬다. */
    public void registerGET(){
        log.info("GET todo_register.....");
    }

    // register은 post와 get방식 따로 따로, 객체를 알아서 넣어줌
    @PostMapping("/register")
    //서버 사이드 검증 redirect에 바인딩
    public String registerPost(@Valid TodoDTO todoDTO, BindingResult bindingResult, RedirectAttributes redirectAttributes){
        log.info("Post todo register");
        if(bindingResult.hasErrors()){
            log.info("has error");
            // addFlashAttribute : 한 번만 일회성으로 사용자에게 에러를 보여줌 a
            redirectAttributes.addFlashAttribute("errors", bindingResult.getAllErrors());
            return "redirect:/todo/register";
        }
        // 추가해주기 => 데이터베이스에 드디어 추가 가능
        log.info(todoDTO);
        todoService.register(todoDTO);
       return "redirect:/todo/list";
    }
}
