package sheridan.pate1592.midterm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import sheridan.pate1592.midterm.service.CountryService;

@Controller
public class CountryController {

	private final CountryService countryService;

	public CountryController(CountryService countryService) {
		this.countryService = countryService;
	}

	@GetMapping(value = { "/index" })
	public String index(Model model) {

		model.addAttribute("countries", countryService.findAllCountry());
		model.addAttribute("count", countryService.count());
		return "CountryList";
	}

	@GetMapping("/countryDetails/{id}")
	public String String(@PathVariable int id, Model model) {
		model.addAttribute("country", countryService.findById(id));
		return "CountryDetails";
	}

}
