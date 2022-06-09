package ec.edu.arquitectura.examen.dao;

import ec.edu.arquitectura.examen.model.Contenido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContenidoRepository extends JpaRepository<Contenido, Integer> {
}
