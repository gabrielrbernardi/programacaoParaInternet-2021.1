package com.example.atividade5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/lab5")
public class LabController {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private CDomainClassRepository cDomainClassRepository;
	
	@GetMapping(path="/add")
	public @ResponseBody String addUser (@RequestParam String name, @RequestParam String email) {
		User n = new User();
		n.setName(name);
		n.setEmail(email);
		userRepository.save(n);
		return "User Saved";
	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	@GetMapping(path="/addDomainObject")
	public @ResponseBody String addDomainObject (@RequestParam String pedido, @RequestParam String produto) {
		CDomainClass cdc = new CDomainClass();
		cdc.setPedido(pedido);
		cdc.setProduto(produto);
		cDomainClassRepository.save(cdc);
		return "Order Saved";
	}
	
	@GetMapping(path="/allCDomainClass")
	public @ResponseBody Iterable<CDomainClass> chamadogetAllCDomainClass(){
		return cDomainClassRepository.findAll();
	}	
}
