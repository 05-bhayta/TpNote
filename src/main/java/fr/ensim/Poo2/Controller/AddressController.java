package fr.ensim.Poo2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.ensim.Poo2.Model.AddressRepository;

@Controller
public class AddressController {
	
	
	@Autowired
	AddressRepository addressRepository ;
	@GetMapping ("/adresses")
	public String showAddresses ( Model model ) {
	model.addAttribute("allAdresses",addressRepository.findAll());
	return "addresses";
}
}