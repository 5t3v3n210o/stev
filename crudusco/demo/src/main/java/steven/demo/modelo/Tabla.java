package steven.demo.modelo;
import jakarta.persistence.*;

@Entity
@Table(name = "tabla")
public class Tabla {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String dia;
    private String lote;
    private String empaque;
    private String cantidad;

    public Tabla(String dia, String lote, String empaque, String cantidad,int id) {
        this.dia = dia;
        this.lote = lote;
        this.empaque = empaque;
        this.cantidad = cantidad;
        this.id=id;
    }

    public Tabla() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getEmpaque() {
        return empaque;
    }

    public void setEmpaque(String empaque) {
        this.empaque = empaque;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}
