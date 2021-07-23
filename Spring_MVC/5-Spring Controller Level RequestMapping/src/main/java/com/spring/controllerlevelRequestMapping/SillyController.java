package com.spring.controllerlevelRequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/silly")
public class SillyController {

    @RequestMapping("/showForm")
    public String display(){
        return  "silly";
    }

    @RequestMapping("/processForm")
    public String process(){
        return "helloworld";
    }
}
