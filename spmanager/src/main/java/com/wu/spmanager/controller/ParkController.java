package com.wu.spmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/park")
public class ParkController {

    @RequestMapping("/add")
    public ModelAndView addPark(){
        ModelAndView mv = new ModelAndView("park/parkAdd");
        return mv;
    }

}
