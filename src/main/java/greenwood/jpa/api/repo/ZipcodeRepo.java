package greenwood.jpa.api.repo;

import greenwood.jpa.api.domain.Zipcode;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZipcodeRepo extends CrudRepository<Zipcode, Long> {
}
