package mms.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("mms")
public class AdminMainController {

    @GetMapping("")
    public String dashboardPage() {
        return "dashboard";
    }

    @GetMapping("reviewer")
    public String reviewerPage() {
        return "reviewer/index";
    }
}
