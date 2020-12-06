package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerControler {

    @RequestMapping({"/owners","/owners/index","/owners/index.html"})
    public String allOwners(){
        return "owners/index";
    }
}
