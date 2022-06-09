package ec.edu.arquitectura.examen.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UsuarioEspacioPK implements Serializable {

    @Column(name = "cod_espacio", nullable = false)
    private Integer codEspacio;

    @Column(name = "cod_usuario", nullable = false)
    private Integer codUsuario;

    public UsuarioEspacioPK() {
    }

    public UsuarioEspacioPK(Integer codEspacio, Integer codUsuario) {
        this.codEspacio = codEspacio;
        this.codUsuario = codUsuario;
    }

    public Integer getCodEspacio() {
        return codEspacio;
    }

    public void setCodEspacio(Integer codEspacio) {
        this.codEspacio = codEspacio;
    }

    public Integer getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UsuarioEspacioPK)) return false;
        UsuarioEspacioPK that = (UsuarioEspacioPK) o;
        return codEspacio.equals(that.codEspacio) && codUsuario.equals(that.codUsuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codEspacio, codUsuario);
    }

    @Override
    public String toString() {
        return "UsuarioEspacioPK{" +
                "codEspacio=" + codEspacio +
                ", codUsuario=" + codUsuario +
                '}';
    }
}