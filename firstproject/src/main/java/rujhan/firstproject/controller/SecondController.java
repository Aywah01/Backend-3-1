package rujhan.firstproject.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondController {
    @GetMapping("/random-quote")
    public String randomQuote(Model model){
        String[] quotes = {
                "hello, how are you?" + "-rujhan-",
                "hello, how are we?" + "-han-",
                "hello, how are him?" + "-ruj-",
                "hello, how are her?" + "-nahjur-",
        };
        int randInt = (int) (Math.random() * quotes.length);
        model.addAttribute("randomQuote", quotes[randInt]);
        return "quote";
    }
}
