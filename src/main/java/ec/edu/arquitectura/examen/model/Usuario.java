package ec.edu.arquitectura.examen.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "seg_usuario")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 34567L;
    @Id
    @Column(name = "cod_usuario", nullable = false)
    private Integer codModulo;

    @Column(name = "username", length = 32)
    private String username;

    @Column(name = "nombre", length = 128)
    private String nombre;

    @Column(name = "estado", length = 3)
    private String estado;

    @Column(name = "clave", length = 64)
    private String clave;

    @OneToMany(mappedBy = "usuario")
    private List<UsuarioEspacio> Usuarioespacios;

    public Usuario() {
    }

    public Usuario(Integer codModulo) {
        this.codModulo = codModulo;
    }

    public Integer getCodModulo() {
        return codModulo;
    }

    public void setCodModulo(Integer codModulo) {
        this.codModulo = codModulo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario usuario = (Usuario) o;
        return codModulo.equals(usuario.codModulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codModulo);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "codModulo=" + codModulo +
                '}';
    }
}