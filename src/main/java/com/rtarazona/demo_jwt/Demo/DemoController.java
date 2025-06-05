package com.rtarazona.demo_jwt.Demo;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class DemoController {

    //Metodos Protegidos
    @PostMapping(value = "demo")
    public String welcome()
    {
        return "Welcome form secure endpoint";
    }


}
