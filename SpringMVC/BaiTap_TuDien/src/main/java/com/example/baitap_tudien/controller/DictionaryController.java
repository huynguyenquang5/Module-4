package com.example.baitap_tudien.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    @GetMapping ("/dictionary")
    public String dictionary() {
        return "dictionary";
    }

    @PostMapping("/translate")
    public ModelAndView translate (HttpServletRequest request) {
        Map<String, String> dic = new HashMap<>();
        dic.put("hello", "Xin chào");
        dic.put("how", "Thế nào");
        dic.put("book", "Quyển vở");
        dic.put("computer", "Máy tính");
        String word = request.getParameter("word");
        String result = dic.get(word);
        ModelAndView modelAndView;
        if (result != null) {
            modelAndView = new ModelAndView("dictionary", "result", result);
        } else {
            modelAndView = new ModelAndView("dictionary", "result", "Not Found");
        }
        return modelAndView;
    }
}
