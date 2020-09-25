package com.gatewayserver.apigateway;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckController {

    @GetMapping("/welcome")
    public String welcome(){
        return  "HEllo From Gateway";
    }
}
