package tn.enstab.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String accueil() {
        return "Bonjour depuis le projet DevOps !";
    }

    @GetMapping("/bonjour")
    public String bonjour(@RequestParam(defaultValue = "monde") String nom) {
        return "Bonjour " + nom + " !";
    }
}
