/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.GL.SMS.Controller;

import com.GL.SMS.Repository.ParentRepository;
import com.GL.SMS.models.Parent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import org.springframework.validation.annotation.Validated;

/**
 *
 * @author skndr
 */
@Controller
public class ParentController {
    @Autowired
    ParentRepository repo ;

    /*@GetMapping("/{id}")
    public String getParent(@PathVariable int id, Model model) {
        Parent parent = repo.findById(id);
        model.addAttribute("parent", parent);
        return "parent";
    }*/

    @PostMapping("/saveParent")
    public String saveParent(Parent p, Model model) {
        repo.save(p);
        return "parent";
    }
  
    
    @GetMapping("/index")
    public String home(Model model){
        model.addAttribute("parent",new Parent());
        return "test" ;
        
    }
   
    

   /*@GetMapping
    public String getAllParents(Model model) {
        List<Parent> parents = repo.findAll();
        model.addAttribute("parents", parents);
        return "parents";
    }*/

    /*@DeleteMapping("/{id}")
    public String deleteParent(@PathVariable int id, Model model) {
        repo.deleteById(id);
        List<Parent> remainingParents = repo.findAll();
        model.addAttribute("parents", remainingParents);
        return "parents";
    }*/

 
}
