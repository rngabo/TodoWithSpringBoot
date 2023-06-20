package com.TodoSpring.TodoSpring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TaskController {
    @RequestMapping("/tasks")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("hometasks");
        return modelAndView;
    }
}
