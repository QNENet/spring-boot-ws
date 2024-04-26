package com.qnenet.ws;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableScheduling
public class HomeController {
    
@GetMapping("/")
@Scheduled(fixedRate = 2000)
    public String home() {
        return "Hello QNENET!";
    }

}
