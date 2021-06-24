package sheridan.pate1592.midterm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import sheridan.pate1592.midterm.model.Country;
import sheridan.pate1592.midterm.repository.CountryRepository;

@Service
public class CountryServiceImpl implements CountryService {

	private final CountryRepository countryRepository;

	public CountryServiceImpl(CountryRepository countryRepository) {
		super();
		this.countryRepository = countryRepository;
	}

	@Override
	public List<Country> findAllCountry() {
		List<Country> countries = countryRepository.findAll();
		return countries;
	}

	@Override
	public Optional<Country> findById(int id) {
		Optional<Country> country = countryRepository.findById(id);
		return country;
	}

	@Override
	public long count() {
		long count = countryRepository.count();
		return count;
	}

}
