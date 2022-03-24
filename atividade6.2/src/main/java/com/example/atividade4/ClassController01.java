package com.example.atividade4;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
@RequestMapping(path="/lab7")
public class ClassController01 {
    @GetMapping("/") 
    public String process(Model model, HttpSession session) {
        @SuppressWarnings("unchecked") 
        List < String > messages = (List < String > ) session.getAttribute("MY_SESSION_MESSAGES");
        if (messages == null) {
            messages = new ArrayList < > ();
        }
        model.addAttribute("sessionMessages", messages);
        model.addAttribute("sessionId", session.getId());
        User storedUser = (User) session.getAttribute("SESSION_USER_DATA");
        if (storedUser != null) {
            model.addAttribute("userData", storedUser);
        }
        return "domainCart";
    }
    
    @PostMapping("/persistMessage") 
    public String persistMessage(@RequestParam("produto") String produto, @RequestParam("descricao") String descricao, HttpSession session) {
        @SuppressWarnings("unchecked") 
        List < String > messages = (List < String > ) session.getAttribute("MY_SESSION_MESSAGES");
        if (messages == null) {
            messages = new ArrayList < > ();
            session.setAttribute("MY_SESSION_MESSAGES", messages);
        }
        messages.add(produto);
        messages.add(descricao);
        session.setAttribute("MY_SESSION_MESSAGES", messages);
        return "redirect:/lab7/";
    }
    
    @PostMapping("/login") 
    public String saveUserData(User user, Model model, HttpSession session) {
        @SuppressWarnings("unchecked") 
        User storedUser = (User) session.getAttribute("SESSION_USER_DATA");
        if (storedUser == null) {
            session.setAttribute("SESSION_USER_DATA", user);
            model.addAttribute("userData", user);
        } else {
            model.addAttribute("userData", storedUser);
        }
        return "redirect:/";
    }
    @PostMapping("/destroy") 
    public String destroySession(HttpServletRequest request) {
        request.getSession().invalidate();
        return "redirect:/";
    }
}