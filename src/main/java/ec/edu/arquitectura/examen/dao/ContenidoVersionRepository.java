package ec.edu.arquitectura.examen.dao;

import ec.edu.arquitectura.examen.model.ContenidoVersion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContenidoVersionRepository extends JpaRepository<ContenidoVersion, Integer> {
}
