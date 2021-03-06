package ec.edu.arquitectura.examen.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "seg_usuario_espacio")
public class UsuarioEspacio implements Serializable {

    private static final long serialVersionUID = 56678L;
    @EmbeddedId
    private  UsuarioEspacioPK pk;

    @Column(name = "estado", length = 3)
    private String estado;

    @JoinColumn(name = "cod_espacio", referencedColumnName = "cod_espacio", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Espacio espacio;

    @JoinColumn(name = "cod_usuario", referencedColumnName = "cod_usuario", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Usuario usuario;

    public UsuarioEspacio() {
    }

    public UsuarioEspacio(UsuarioEspacioPK pk) {
        this.pk = pk;
    }

    public UsuarioEspacioPK getPk() {
        return pk;
    }

    public void setPk(UsuarioEspacioPK pk) {
        this.pk = pk;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Espacio getEspacio() {
        return espacio;
    }

    public void setEspacio(Espacio espacio) {
        this.espacio = espacio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UsuarioEspacio)) return false;
        UsuarioEspacio that = (UsuarioEspacio) o;
        return pk.equals(that.pk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pk);
    }

    @Override
    public String toString() {
        return "UsuarioEspacio{" +
                "pk=" + pk +
                '}';
    }
}