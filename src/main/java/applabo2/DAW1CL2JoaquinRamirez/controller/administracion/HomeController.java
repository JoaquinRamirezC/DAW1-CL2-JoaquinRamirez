package applabo2.DAW1CL2JoaquinRamirez.controller.administracion;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home(){return "home";}
}
