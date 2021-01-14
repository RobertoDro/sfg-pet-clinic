package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerControler {

    private final OwnerService ownerService;

    public OwnerControler(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/owners","/owners/index","/owners/index.html"})
    public String allOwners(Model model)
    {
        model.addAttribute("owners", ownerService.findAll());

        return "owners/index";
    }

    @RequestMapping("/owners/find")
    public String findOwners(){
        return "notimplemented";
    }


}
