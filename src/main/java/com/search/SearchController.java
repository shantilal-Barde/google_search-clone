package com.search;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchController {

    @RequestMapping("/home")
    public String home() {
        return "home";
    }

    @RequestMapping(value = "/search")
    public String search(@RequestParam("querybox") String query) {
        if (query.isBlank()) return "redirect:/home";

        return "redirect:https://www.google.com/search?q=" + query;
    }
}
