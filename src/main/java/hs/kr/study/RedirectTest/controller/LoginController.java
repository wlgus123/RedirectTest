package hs.kr.study.RedirectTest.controller;

import hs.kr.study.RedirectTest.dto.LoginDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class LoginController {
    @PostMapping("/signup")
    public String signup(LoginDTO dto) {
        System.out.println("name: " + dto.getName());
        System.out.println("email: " + dto.getEmail());
        System.out.println("addr: " + dto.getAddr());

        return "redirect:/login";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
