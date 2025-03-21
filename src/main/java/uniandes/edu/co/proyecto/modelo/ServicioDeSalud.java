package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
@Table(name="ServicioDeSalud")
public class ServicioDeSalud {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String codigo;
    private String nombre;
    private String descripcion;

    @OneToMany(mappedBy = "servicioDeSalud")
    private List<Disponibilidad> disponibilidades;

    @OneToMany(mappedBy = "servicioDeSalud")
    private List<OrdenDeServicio> ordenesDeServicio;

    @OneToMany(mappedBy = "pk.servicioDeSalud")
    private List<IpsServicioDeSalud> ipsServicioDeSalud;

    public ServicioDeSalud(){;}

    // Constructor
    public ServicioDeSalud(String codigo, String nombre, String descripcion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    // Getters and Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}