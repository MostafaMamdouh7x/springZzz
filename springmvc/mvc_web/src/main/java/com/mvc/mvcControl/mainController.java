package com.mvc.mvcControl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class mainController {
    @RequestMapping("/")
    public String requestHome() {
        System.out.println("mainController---> requestHome()");
        return "home";
    }
    
    
}
