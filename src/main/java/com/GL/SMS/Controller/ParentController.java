package com.GL.SMS.Controller;

import com.GL.SMS.Repository.ParentRepository;
import com.GL.SMS.models.Parent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller("api/parent")

public class ParentController {

    @Autowired
    ParentRepository ParentRepo ;

    /*@GetMapping("/{id}")
    public String getParent(@PathVariable int id, Model model) {
        Parent parent = repo.findById(id);
        model.addAttribute("parent", parent);
        return "parent";
    }*/


    @GetMapping("/index")
    public String home(Model model){
        model.addAttribute("parent",new Parent());
        return "index" ;

    }
    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("parent",new Parent());
        return "login" ;

    }
    @PostMapping("/saveParent")
    public String saveParent(Parent p, Model model) {
        ParentRepo.save(p);
        return "redirect:/index?success";
    }

}
