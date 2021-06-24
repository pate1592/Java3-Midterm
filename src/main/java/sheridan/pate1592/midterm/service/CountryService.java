package sheridan.pate1592.midterm.service;

import java.util.List;
import java.util.Optional;

import sheridan.pate1592.midterm.model.Country;

public interface CountryService {

	List<Country> findAllCountry();

	long count();

	Optional<Country> findById(int id);
}
