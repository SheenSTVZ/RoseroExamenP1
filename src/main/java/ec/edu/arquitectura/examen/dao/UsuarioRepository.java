package ec.edu.arquitectura.examen.dao;

import ec.edu.arquitectura.examen.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
