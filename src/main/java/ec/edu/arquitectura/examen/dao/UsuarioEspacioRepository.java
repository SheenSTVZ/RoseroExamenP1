package ec.edu.arquitectura.examen.dao;

import ec.edu.arquitectura.examen.model.UsuarioEspacio;
import ec.edu.arquitectura.examen.model.UsuarioEspacioPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioEspacioRepository extends JpaRepository<UsuarioEspacio, UsuarioEspacioPK> {
    List<UsuarioEspacio> findUsuarioEspacioByPkCodUsuario(String codUsuario);
}
