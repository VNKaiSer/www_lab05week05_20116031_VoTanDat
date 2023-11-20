package vn.edu.iuh.fit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {
    @PostMapping("/web")
    public String redirectPage(@RequestParam(name = "role", defaultValue = "candidate") String role){
        String page = String.format("redirect:/%s",role);
        return page;
    }

    @GetMapping("/candidate")
    public  String getCandidatePage(){
        return "candidate/index";
    }

    @GetMapping("/company")
    public  String getCompanyPage(){
        return "company/index";
    }


}
