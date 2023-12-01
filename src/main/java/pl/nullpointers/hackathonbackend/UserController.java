package pl.nullpointers.hackathonbackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping
    public String hello(){
        return "Dorsia, yea, Dorsia sound great. Hey Paul! Try Getting A Reservation At Dorsia Now!";
    }

}
