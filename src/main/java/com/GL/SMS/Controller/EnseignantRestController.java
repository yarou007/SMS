package com.GL.SMS.Controller;

import com.GL.SMS.Exceptions.EnseignantExceptions;
import com.GL.SMS.Repository.EnseignantRepository;
import com.GL.SMS.models.Enseignant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/enseignant")
public class EnseignantRestController {

    @Autowired
    EnseignantRepository ensRepo;

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

    // put static
//    @PutMapping
//    public List<Enseignant> updateEnseignant(@RequestBody Enseignant e){
//        ensRepo.save(e);
//        return ensRepo.findAll();
//    }
//    build update vehicle REST API
        @PutMapping("{id}")
    public List<Enseignant> updateEnseignant(@PathVariable int id,@RequestBody Enseignant EnseignantDetails) {

        Enseignant targetEns = ensRepo.findById(id)
                .orElseThrow(() -> new EnseignantExceptions("Enseignant not exist with id: " + id ));
        targetEns.setNom(EnseignantDetails.getNom());
        targetEns.setPrenom(EnseignantDetails.getPrenom());
        targetEns.setNumTel(EnseignantDetails.getNumTel());
        targetEns.setEmail(EnseignantDetails.getEmail());
        targetEns.setDateNaissence(EnseignantDetails.getDateNaissence());
        targetEns.setPassword(EnseignantDetails.getPassword());
        ensRepo.save(targetEns);
        return ensRepo.findAll();
    }

}
