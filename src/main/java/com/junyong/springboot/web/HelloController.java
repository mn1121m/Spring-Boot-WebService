package com.junyong.springboot.web;

import com.junyong.springboot.web.dto.HelloResponeDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // 1
public class HelloController {
    @GetMapping("/hello/dto") // 2
    public HelloResponeDto helloDto(@RequestParam("name") String
                                    name, // 1
                                    @RequestParam("amount") int amount) {
        return new HelloResponeDto(name, amount);
    }
}
