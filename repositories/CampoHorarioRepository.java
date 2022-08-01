package les.ifoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import les.ifoot.model.CampoHorario;

@Repository
public interface CampoHorarioRepository extends JpaRepository<CampoHorario, Integer> {

}
