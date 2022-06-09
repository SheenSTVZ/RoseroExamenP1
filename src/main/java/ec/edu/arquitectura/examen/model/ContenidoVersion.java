package ec.edu.arquitectura.examen.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "gdc_contenido_version")
public class ContenidoVersion implements Serializable {

    private static final long serialVersionUID = 1234L;

    @Id
    @Column(name = "cod_contenido_version", nullable = false)
    private Integer codContenidoVersion;

    @Column(name = "hash_archivo", length = 64)
    private String hashArchivo;

    @Column(name = "nombre_archivo", length = 256)
    private String nombreArchivo;

    @Column(name = "tamanio")
    private BigDecimal tamanio;

    @Column(name = "version")
    private BigDecimal version;

    @Column(name = "comentario", length = 500)
    private String comentario;

    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;

    @Column(name = "cod_usuario_creacion")
    private Integer codUsuarioCreacion;

    @JoinColumn(name = "cod_contenido", referencedColumnName = "cod_contenido", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Contenido contenido;

    public ContenidoVersion() {
    }

    public ContenidoVersion(Integer codContenidoVersion) {
        this.codContenidoVersion = codContenidoVersion;
    }

    public Integer getCodContenidoVersion() {
        return codContenidoVersion;
    }

    public void setCodContenidoVersion(Integer codContenidoVersion) {
        this.codContenidoVersion = codContenidoVersion;
    }

    public String getHashArchivo() {
        return hashArchivo;
    }

    public void setHashArchivo(String hashArchivo) {
        this.hashArchivo = hashArchivo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public BigDecimal getTamanio() {
        return tamanio;
    }

    public void setTamanio(BigDecimal tamanio) {
        this.tamanio = tamanio;
    }

    public BigDecimal getVersion() {
        return version;
    }

    public void setVersion(BigDecimal version) {
        this.version = version;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getCodUsuarioCreacion() {
        return codUsuarioCreacion;
    }

    public void setCodUsuarioCreacion(Integer codUsuarioCreacion) {
        this.codUsuarioCreacion = codUsuarioCreacion;
    }

    public Contenido getContenido() {
        return contenido;
    }

    public void setContenido(Contenido contenido) {
        this.contenido = contenido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContenidoVersion)) return false;
        ContenidoVersion that = (ContenidoVersion) o;
        return codContenidoVersion.equals(that.codContenidoVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codContenidoVersion);
    }

    @Override
    public String toString() {
        return "ContenidoVersion{" +
                "codContenidoVersion=" + codContenidoVersion +
                '}';
    }
}