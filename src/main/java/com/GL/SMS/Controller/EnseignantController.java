package com.GL.SMS.Controller;

import com.GL.SMS.Repository.EnseignantRepository;
import com.GL.SMS.models.Enseignant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EnseignantController {

    @Autowired
    private EnseignantRepository ensRepo;

    @GetMapping("/index")
    public String index(Model model, @RequestParam(name="page", defaultValue = "0") int page, @RequestParam(name="size", defaultValue = "4")int size
            , @RequestParam(name="keyword", defaultValue = "") String kw) {
       // Page<Enseignant> pageEnseignants= ensRepo.findByNomContains(kw,PageRequest.of(page, size));// went to repo and findAll

        model.addAttribute("ListEnseignants",ensRepo.findAll()); // stock el list fi model sous le nom de ListPatients
        model.addAttribute("currentPage",page);
        model.addAttribute("keyword",kw);
        return "Enseignants";
    }
    @GetMapping("/admin/delete")

    public String delete(int id, String keyword, int page) {
        ensRepo.deleteById(id);
        return "redirect:/index?page="+page+"&keyword="+keyword;
    }
    @GetMapping("/formEnseignant")
    public String formEnseignants(Model model) {
        model.addAttribute("enseignant",new Enseignant());

        return "formEnseignants";
    }
    @PostMapping ("/saveEnseignant")
    public String savePatient(@Validated Enseignant enseignant, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {return "formEnseignants";}
        ensRepo.save(enseignant);
        return "redirect:/index?keyword="+enseignant.getNom();
    }


}
