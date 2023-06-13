package com.tuanhop.devops.springbootbuildapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MailController {
    @RequestMapping("/")
    String home(ModelMap modal) {
        modal.addAttribute("title", "SPRING BOOT - HELLO WORLD!");
        modal.addAttribute("message", "Welcome to SpringBoot");
        return "hello";
    }
}
