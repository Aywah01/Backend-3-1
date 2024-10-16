package rujhan.firstproject.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import rujhan.firstproject.dto.ArticleForm;
import rujhan.firstproject.entity.Article;
import rujhan.firstproject.repository.ArticleRepository;

import java.util.List;
import java.util.Optional;

@Controller
public class ArticleController {
    @Autowired
    ArticleRepository articleRepository;

    @PostMapping("/articles/create")
    public String newArticleForm(ArticleForm form){
        System.out.println(form.toString());
        Article saved = form.toEntity();
        Article savePrint = articleRepository.save(saved);
        System.out.println("저장후: " + savePrint.toString());
        return "redirect:/articles/" + saved.getId();
        //return "forward:";
    }

    @GetMapping("/forwardTest")
    public String forwardTestMethod(){
        return "forward:/hi";
    }

    @GetMapping("/article/new")
    public String newArticleForm1(){
        return "articles/new";
    }

    @GetMapping("/articles/{id}")
    public String show(@PathVariable("id")Long id, Model model){
        Article result = articleRepository.findById(id).orElse(null);
        model.addAttribute("article", result);
        return "articles/show";
    }

    @GetMapping("/articles")
    public String index(Model model){
        List<Article> resultList =(List<Article>) articleRepository.findAll(); //DownCasting
        model.addAttribute("articleList", resultList);
        return "articles/index";
    }
}
