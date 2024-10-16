package rujhan.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchController {
    @GetMapping("/search")
    public String mainSearch(@RequestParam("nameSearchKeyword") String searchKeyword){
        System.out.println("검색어: " + searchKeyword);
        return "";
    }
}
