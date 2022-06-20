package pl.witek.springdata;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellWorldController {



    @GetMapping("/helloworld")
    public String helloWorld(){
        return "Hello World";
    }
}
