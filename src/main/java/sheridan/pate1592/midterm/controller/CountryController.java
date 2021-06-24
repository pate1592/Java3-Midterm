package sheridan.pate1592.midterm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import sheridan.pate1592.midterm.model.Country;
import sheridan.pate1592.midterm.service.CountryService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class CountryController {

	private final CountryService countryService;

	public CountryController(CountryService countryService) {
		this.countryService = countryService;
	}

	@GetMapping(value = {"/", "/index" })
	public String index(Model model) {

		model.addAttribute("countries", countryService.findAllCountry());
		model.addAttribute("count",countryService.count());
		return "CountryList";
	}

	@GetMapping("/countryDetails/{id}")
	public String String(@PathVariable int id, Model model) {
		Optional<Country> country = countryService.findById(id);
		List<Optional<Country>> countries = new ArrayList<>();
		countries.add(country);
		model.addAttribute("countries", countries);
		return "CountryDetails";
	}

}
