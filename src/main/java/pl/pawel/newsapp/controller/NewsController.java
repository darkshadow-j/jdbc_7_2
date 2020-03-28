package pl.pawel.newsapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.pawel.newsapp.db.NewsDAO;
import pl.pawel.newsapp.model.Result;

@Controller
@RequestMapping("/")
public class NewsController {

    NewsDAO newsDAO;

    @Autowired
    public NewsController(NewsDAO newsDAO) {
        this.newsDAO = newsDAO;
    }

    @GetMapping
    public String homePage(Model model) {
        model.addAttribute("allNews", newsDAO.getAllNews());
        model.addAttribute("editNews", new Result());
        return "news";

    }

    @PostMapping("/edit-news")
    public String EditNews(@ModelAttribute Result result) {
        if (!result.getTitle().equals("")) {
            newsDAO.updateNews(result);
        }
        return "redirect:/";
    }

}
