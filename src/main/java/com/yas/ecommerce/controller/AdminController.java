package com.yas.ecommerce.controller;

import com.yas.ecommerce.model.Category;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AdminController {
    @GetMapping("/admin")
    public String adminHome(){
        return "adminHome";
    }

    @GetMapping("/admin/categories")
    public String categories(){
        return "categories";
    }

    @GetMapping("/admin/categories/add")
    public String categoriesAdd(Model model){
        model.addAttribute("category", new Category());
        return "categoriesAdd";
    }


}
