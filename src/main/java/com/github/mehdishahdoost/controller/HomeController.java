package com.github.mehdishahdoost.controller;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Mehdi Shahdoost
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String home(OAuth2AuthenticationToken token) {
        System.out.println(token.getPrincipal());
        return "index.html";
    }

}
