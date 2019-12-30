package fr.ensim.Poo2.Controller;

import java.net.InetSocketAddress;
import java.net.Proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import fr.ensim.Poo2.Model.AddressRepository;
import fr.ensim.Poo2.Model.DarkSky;
import fr.ensim.Poo2.Model.Resultat;




@Controller
public class HelloWorldController {
	
	
	///////////////////greeting////////////////////////////
	@GetMapping ("/greeting")
	public String greeting ( @RequestParam ( name ="nameGET",
	required =false , defaultValue ="World") String
	nameGET , Model model ) {
	model . addAttribute ("nomTemplate", nameGET );
	return "greeting";
	}
	
	/////////////////adresses////////////////////////
	@Autowired
	AddressRepository addressRepository ;
	@GetMapping ("/adresses")
	public String showAddresses ( Model model ) {
	model.addAttribute("allAdresses",addressRepository.findAll());
	return "adresses";}
	////////////////Adresse///////////////////
	
	
	@GetMapping("/adresse")
	public String showFormular(Model model) {
		return "adresse"; }
	
   ////////////////Meteo////////////////////

	   @PostMapping("/meteo")
	    public String recuperer (Model model,@RequestBody String adresse ) {
			SimpleClientHttpRequestFactory clientHttpReq = new SimpleClientHttpRequestFactory();
			Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("proxy.univ-lemans.fr", 3128));
			clientHttpReq.setProxy(proxy);
			RestTemplate restTemplate = new RestTemplate(clientHttpReq);
			Resultat c = restTemplate.getForObject("https://api-adresse.data.gouv.fr/search/?q="+adresse, Resultat.class);
			double lon = c.getFeatures().get(0).getGeometry().getCoordinates().get(0);
			double lat = c.getFeatures().get(0).getGeometry().getCoordinates().get(1);
			DarkSky s = restTemplate.getForObject("https://api.darksky.net/forecast/9015730e2ba0e4462a9c9487ba117ee1/"+lat+","+lon+"?lang=fr&exclude=hourly&exclude=daily&exclude=flags&units=si", DarkSky.class);
			model.addAttribute("meteo",s);
			model.addAttribute("adresse",c.getFeatures().get(0).getProperties().getContext());
			model.addAttribute("ville",c.getFeatures().get(0).getProperties().getCity());
			return "meteo";
			}


}











