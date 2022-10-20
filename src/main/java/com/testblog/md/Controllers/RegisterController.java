package com.testblog.md.Controllers;
import com.testblog.md.Controllers.Users.Register;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

    private static final Logger log = LoggerFactory.getLogger(RegisterController.class);

    @GetMapping("register")
    public  String register(@ModelAttribute Register register, Model model){
        return "register";
    }

    @PostMapping("/register")
    public void save(Register register){

    }
}


