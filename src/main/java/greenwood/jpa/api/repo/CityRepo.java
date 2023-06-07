package greenwood.jpa.api.repo;

import greenwood.jpa.api.domain.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepo extends CrudRepository<City, Long> {
}
