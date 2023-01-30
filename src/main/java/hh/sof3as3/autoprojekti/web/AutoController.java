package hh.sof3as3.autoprojekti.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import hh.sof3as3.autoprojekti.domain.Auto;

@Controller
public class AutoController {

	// metodi lähettää selaimeen autolistan sisältävän html-dokumentin
	// @RequestMapping... Mutta on toinenkin tapa! Jos halutaan saada niin @GetMapping
	// http://localhost:8080/autolista
	@GetMapping("/autolista")
	public String getCarList(Model model) {
		// Ei ole vielä tietokantaa, luon autolistan
		List<Auto> autot = new ArrayList<Auto>(); // luodaan tyhjä lista
		// Lisätään listaan kaksi autoa
		autot.add(new Auto("Toyota", 2008));
		autot.add(new Auto("Tesla", 2022));
		
		// Lisätään Model model mappiin! "autot" on keyword hashmappiin joka lähetetään html!
		model.addAttribute("autot", autot);
				
		return "auto-lista"; //TÄMÄ EI OLE ENDPOINT!!!! VAAN auto-lista.html TEMPLATES KANSIOSSA!!
	}
}
