/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*package com.GL.SMS.Controller;

import com.GL.SMS.Repository.ParentRepository;
import com.GL.SMS.models.Parent;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;*/

/**
 *
 * @author skndr
 */
/*@RestController
@RequestMapping("/parents")
public class ParentRestController {
    @Autowired
    ParentRepository repo ;
    
    
     @GetMapping("/{id}")
    public Parent getParent(@PathVariable int id){
       return repo.findById(id);
    }
    @PostMapping
    public Parent saveParent(@RequestBody Parent p){
        return repo.save(p);
    }
    @GetMapping
    public List<Parent> getAllParents(){
        return repo.findAll();
    }
    @DeleteMapping("/{id}")
    public List<Parent> deleteParent(@PathVariable int id){
         repo.deleteById(id);
         return repo.findAll();
    }

    @PutMapping("/{id}")
    public List<Parent> updateParent(@RequestBody Parent p , @PathVariable int id){
        Parent existantParent= repo.findById(id);
        existantParent.setCin(p.getCin());
        existantParent.setNom(p.getNom());
        existantParent.setPrenom(p.getPrenom());
        existantParent.setNumTel(p.getNumTel());
        existantParent.setEmail(p.getEmail());
        existantParent.setAdresseParent(p.getAdresseParent());
        existantParent.setPassword(p.getPassword());
        repo.saveAndFlush(existantParent);
        return repo.findAll();
    }
    
    
}*/
