package ec.edu.arquitectura.examen.dao;

import ec.edu.arquitectura.examen.model.Espacio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EspacioRepository extends JpaRepository<Espacio, Integer> {
}
