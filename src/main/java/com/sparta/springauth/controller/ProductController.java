package com.sparta.springauth.controller;

import com.sparta.springauth.entity.User;
import com.sparta.springauth.security.UserDetailsImpl;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class ProductController {

    /*@GetMapping("/products")
    public String getProducts(HttpServletRequest req) {
        System.out.println("ProductController.getProducts : 인증 완료");
        User user = (User) req.getAttribute("user");
        System.out.println("user.getUsername() = " + user.getUsername());

        return "redirect:/";
    }*/
    @GetMapping("/products")
   public String getProducts(@AuthenticationPrincipal UserDetailsImpl userDetails) {
        User user = userDetails.getUser();
        System.out.println("user.getUsername() = " + user.getUsername());
        System.out.println("user.getEmail() = " + user.getEmail());
        return "redirect:/";
    }
}