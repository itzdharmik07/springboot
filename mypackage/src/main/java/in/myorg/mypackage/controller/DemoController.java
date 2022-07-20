package in.myorg.mypackage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DemoController {
    @GetMapping("/")
    public String welcomePage(){
        return "Weclome To the SpringBoot";
    }
    @GetMapping("/getDate")
    public Date getdate(){
        return new Date();
    }
    @GetMapping("/hello")
    public String hello(){
        return "Hello User How r You?";
    }

}
