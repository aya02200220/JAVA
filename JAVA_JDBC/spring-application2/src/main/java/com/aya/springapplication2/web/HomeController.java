package com.aya.springapplication2.web;

import java.security.KeyStore.Entry.Attribute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.aya.springapplication2.domain.User;

@Controller
public class HomeController {

  @RequestMapping("/")
  public String home(Model model){
    model.addAttribute("formData",new User());

    // return "pages/index";
    return "index";
  }

  @RequestMapping(value = "/create",method = RequestMethod.GET)
  public String processFormData(User user,RedirectAttributes attr){
    attr.addFlashAttribute("user",user);
    return "redirect:display";
  }

  @RequestMapping(value ="/display")
  public String displayResult(){
    return "result";
  }
  
}

