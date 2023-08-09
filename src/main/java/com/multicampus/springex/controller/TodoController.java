package com.multicampus.springex.controller;

import com.multicampus.springex.dto.TodoDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller //스프링 MVC에서 컨트롤러 역할, 스프링의 빈(Bean)으로 등록
@RequestMapping("/todo")
@Log4j2
public class TodoController {
    @RequestMapping("/list") //localhost:8090/todo/list
    public void list(Model model){
        log.info("todo_list");
    }

    //@RequestMapping(value="/register", method = RequestMethod.GET) //localhost:8090/todo/register
    @GetMapping("/register")
    /*제대로 불러오는지 확인하는 작업, 제대로 불러오면 콘솔에 뜬다. */
    public void registerGET(){
        log.info("GET todo_register.....");
    }

    // register은 post와 get방식 따로 따로, 객체를 알아서 넣어줌
    @PostMapping("/register")
    public String registerPost(TodoDTO todoDTO, RedirectAttributes redirectAttributes){
        log.info("Post todo register");
        log.info(todoDTO);

       return "redirect:/todo/list";
    }
}
