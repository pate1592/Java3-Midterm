package sheridan.pate1592.midterm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sheridan.pate1592.midterm.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
	Country findByid(int id);
}
