package one.digital.Parking.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello")
public class HelloController {


    @GetMapping
    public String HelloController() {

    return  "First acess";


    }
}
