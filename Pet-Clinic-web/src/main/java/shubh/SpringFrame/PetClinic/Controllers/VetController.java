package shubh.SpringFrame.PetClinic.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import shubh.SpringFrame.PetClinic.model.Vet;
import shubh.SpringFrame.PetClinic.services.VetService;

import java.util.Set;

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets","/vets/index","/vets/index.html","/vets.html"})
    public String listVets(Model model) {
        model.addAttribute("vets",vetService.findAll());

        return "vets/index";
    }


    @RequestMapping("/api/vets")
    public @ResponseBody Set<Vet> getVetsJson () {
        return vetService.findAll();
    }
}
