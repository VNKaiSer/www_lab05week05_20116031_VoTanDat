package vn.edu.iuh.fit.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.edu.iuh.fit.models.Candidate;
import vn.edu.iuh.fit.services.CandidateService;

import java.util.List;

@Controller
@ComponentScan(basePackages = "vn.edu.iuh.fit")
public class CandidateController {
//    @Autowired private CandidateService service;
    @RequestMapping("/")
    public String index(Model model) {
//        List<Candidate> candidates = service.getAll();
//
//        model.addAttribute("users", candidates);
//
//        return "index";
        return "index";
    }

}
