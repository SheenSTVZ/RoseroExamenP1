package ec.edu.arquitectura.examen.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "gdc_contenido")
public class Contenido implements Serializable {

    private static final long serialVersionUID = 67213L;

    @Id
    @Column(name = "cod_contenido", nullable = false)
    private Integer codContenido;

    @Column(name = "tipo_contenido")
    private BigDecimal tipoContenido;

    @Column(name = "nombre", length = 256)
    private String nombre;

    @Column(name = "nombre_archivo", length = 256)
    private String nombreArchivo;

    @Column(name = "version")
    private BigDecimal version;

    @Column(name = "estado")
    private Integer estado;

    @Column(name = "cod_contenido_padre", nullable = false)
    private Integer codContenidoPadre;

    @JoinColumn(name = "cod_espacio", referencedColumnName = "cod_espacio", nullable = false, insertable = false, updatable = false)
    @ManyToOne
    private Espacio espacio;

    @OneToMany(mappedBy = "codContenidoPadre")
    private List<Contenido> Contenidos;

    @JoinColumn(name = "cod_contenido_padre", referencedColumnName = "cod_contenido_padre", nullable = false, insertable = false, updatable = false)
    @ManyToOne
    private Contenido contenidoPadre;


}