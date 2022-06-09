package ec.edu.arquitectura.examen.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "gdc_espacio")
public class Espacio implements Serializable {
    private static final long serialVersionUID = 23456L;
    @Id
    @Column(name = "cod_espacio", nullable = false)
    private Integer codEspacio;

    @Column(name = "nombre", length = 128)
    private String nombre;

    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;

    public Espacio() {
    }

    public Espacio(Integer codEspacio) {
        this.codEspacio = codEspacio;
    }

    public Integer getCodEspacio() {
        return codEspacio;
    }

    public void setCodEspacio(Integer codEspacio) {
        this.codEspacio = codEspacio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Espacio)) return false;
        Espacio espacio = (Espacio) o;
        return codEspacio.equals(espacio.codEspacio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codEspacio);
    }

    @Override
    public String toString() {
        return "Espacio{" +
                "codEspacio=" + codEspacio +
                '}';
    }
}