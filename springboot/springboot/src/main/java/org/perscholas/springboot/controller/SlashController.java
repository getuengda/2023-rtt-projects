package org.perscholas.springboot.controller;

import org.perscholas.springboot.database.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SlashController {
//    public void index(){
//        User user = new User();
//
//        user.setId(1);
//        user.setEmail("eric@webworkbench.net");
//
//    }
    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView response = new ModelAndView("index");
        return response;
    }

    @GetMapping("/about")
    public ModelAndView about() {
        ModelAndView response = new ModelAndView("about");
        return response;
    }
}
