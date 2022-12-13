package com.example.baitap_tiente.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MoneyConverter {
    @GetMapping("/converter")
    public String converter() {
        return "converter";
    }

    @PostMapping("/money")
    public ModelAndView money(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("converter");
        Float rate = Float.parseFloat(request.getParameter("rate"));
        Float usd = Float.parseFloat(request.getParameter("usd"));
        Float result = rate * usd;
        modelAndView.addObject("result", result);
        return modelAndView;
    }
}
