package les.ifoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import les.ifoot.model.ReservaIndividual;

@Repository
public interface ReservaIndividualRepository extends JpaRepository<ReservaIndividual, Integer> {

}
