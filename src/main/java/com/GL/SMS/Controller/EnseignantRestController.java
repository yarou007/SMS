package com.GL.SMS.Controller;

import com.GL.SMS.Repository.EnseiganantRepository;
import com.GL.SMS.models.Enseignant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/enseignant")
public class EnseignantRestController {

    @Autowired
    EnseiganantRepository ensRepo;

    @GetMapping("/{id}")
    public Optional<Enseignant> getEnseignant(@PathVariable int id){
       return ensRepo.findById(id);
    }
    @PostMapping
    public Enseignant saveEnseingant(@RequestBody Enseignant e){
        return ensRepo.save(e);
    }
    @GetMapping
    public List<Enseignant> getAllEnseignant(){
        return ensRepo.findAll();
    }
    @DeleteMapping("/{id}")
    public List<Enseignant> deleteEnseignant(@PathVariable int id){
         ensRepo.deleteById(id);
         return ensRepo.findAll();
    }

    @PutMapping
    public List<Enseignant> updateEnseignant(@RequestBody Enseignant e){
        ensRepo.save(e);
        return ensRepo.findAll();
    }

}
