package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name="Ips")
public class Ips {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String nitIPS;
    private String nombreIPS;
    private String direccion;
    private String telefono;
    private int idEps;

    @ManyToOne
    @JoinColumn(name = "idEps", insertable = false, updatable = false)
    private Eps eps;

    @OneToMany(mappedBy = "ips")
    private List<Disponibilidad> disponibilidades;

    @OneToMany(mappedBy = "ips")
    private List<Cita> citas;

    @OneToMany(mappedBy = "pk.ips")
    private List<MedicoIps> medicoIps;

    @OneToMany(mappedBy = "pk.ips")
    private List<IpsServicioDeSalud> ipsServicioDeSalud;

    public Ips() {}

    // Constructor
    public Ips(String nitIPS, String nombreIPS, String direccion, String telefono, int idEps) {
        this.nitIPS = nitIPS;
        this.nombreIPS = nombreIPS;
        this.direccion = direccion;
        this.telefono = telefono;
        this.idEps = idEps;
    }

    // Getters and Setters
    public String getNitIPS() {
        return nitIPS;
    }

    public void setNitIPS(String nitIPS) {
        this.nitIPS = nitIPS;
    }

    public String getNombreIPS() {
        return nombreIPS;
    }

    public void setNombreIPS(String nombreIPS) {
        this.nombreIPS = nombreIPS;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getIdEps() {
        return idEps;
    }

    public void setIdEps(int idEps) {
        this.idEps = idEps;
    }

    public Eps getEps() {
        return eps;
    }

    public void setEps(Eps eps) {
        this.eps = eps;
    }

    public List<Disponibilidad> getDisponibilidades() {
        return disponibilidades;
    }

    public void setDisponibilidades(List<Disponibilidad> disponibilidades) {
        this.disponibilidades = disponibilidades;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }

    public List<MedicoIps> getMedicoIps() {
        return medicoIps;
    }

    public void setMedicoIps(List<MedicoIps> medicoIps) {
        this.medicoIps = medicoIps;
    }

    public List<IpsServicioDeSalud> getIpsServicioDeSalud() {
        return ipsServicioDeSalud;
    }

    public void setIpsServicioDeSalud(List<IpsServicioDeSalud> ipsServicioDeSalud) {
        this.ipsServicioDeSalud = ipsServicioDeSalud;
    }
}