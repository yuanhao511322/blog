package com.yuanhao.blog.controller;
import com.yuanhao.blog.dto.QuestionDTO;
import com.yuanhao.blog.mapper.QuestionMapper;
import com.yuanhao.blog.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class IssueController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/issue/{id}")
    public String issue(@PathVariable(name = "id") Integer id,
                        Model model){
        QuestionDTO questionDTO = questionService.getById(id);
        model.addAttribute("question",questionDTO);
        return "issue";
    }
}
