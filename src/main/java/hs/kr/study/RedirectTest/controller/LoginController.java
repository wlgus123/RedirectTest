package hs.kr.study.RedirectTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @PostMapping("/signup")
    public String signup(@RequestParam("name") String name,
                        @RequestParam("email") String email,
                        @RequestParam("addr") String addr) {
        System.out.println("name: " + name);
        System.out.println("email: " + email);
        System.out.println("addr: " + addr);

        return "redirect:/login";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
