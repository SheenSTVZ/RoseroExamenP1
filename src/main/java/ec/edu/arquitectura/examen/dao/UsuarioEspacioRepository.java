package ec.edu.arquitectura.examen.dao;

import ec.edu.arquitectura.examen.model.UsuarioEspacio;
import ec.edu.arquitectura.examen.model.UsuarioEspacioPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioEspacioRepository extends JpaRepository<UsuarioEspacio, UsuarioEspacioPK> {
}
