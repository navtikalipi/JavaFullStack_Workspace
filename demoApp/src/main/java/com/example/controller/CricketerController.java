package com.example.controller;

import com.example.model.Cricket;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/cricket")

public class CricketerController {
    @RequestMapping("/show")
    public String home() {
        return "cricketers.html";
    }

    @RequestMapping("/showCric")
    public ModelAndView showCricketer(){

        ModelAndView mv= new ModelAndView("cricketers");
        String name="Nav";
        Date dt=new Date();

        Cricket cr1= new Cricket(111,11,"India");
        mv.addObject("myname",name);
        mv.addObject("mydate",dt);
        mv.addObject("mycricket",cr1);
        List<Cricket> list = List.of(
                new Cricket(101,11,"India"),
                new Cricket(102,11,"Australia"),
                new Cricket(103,11,"England")
        );

        mv.addObject("cricketers", list);

        return mv;

    }

}
