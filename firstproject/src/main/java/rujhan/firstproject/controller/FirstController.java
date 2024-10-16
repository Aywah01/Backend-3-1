package rujhan.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FirstController {

    @GetMapping("/")
    public String welcomePage(){
        return "home";
    }

    @GetMapping("/bye")
    public String goodBye(Model model) {
        return "goodbye";
    }

    @GetMapping("/hi")
    public String niceToMeet(Model model){
        model.addAttribute("userName","집");
        return "greetings";
    }

}
