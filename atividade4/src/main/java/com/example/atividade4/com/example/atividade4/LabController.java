package com.example.atividade4.com.example.atividade4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/lab4")
public class LabController {
	
	@GetMapping(path="/add")
	public @ResponseBody String addUserString (@RequestParam String name, @RequestParam String email) {
		User n = new User();
		n.setName(name);
		n.setEmail(email);
		return name.toString();
	}
	
	@GetMapping(path="/addDomainObject")
	public @ResponseBody String addDomainClass (@RequestParam String disciplina, @RequestParam String professor, @RequestParam int codDisciplina) {
		CDomainClass cdc = new CDomainClass();
		cdc.setCodDisciplina(codDisciplina);
		cdc.setDisciplina(disciplina);
		cdc.setProfessor(professor);
		return cdc.toString();
	}
}
