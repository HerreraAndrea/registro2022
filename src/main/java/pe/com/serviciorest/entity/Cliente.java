package pe.com.serviciorest.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor //metodo constructor con datos
@NoArgsConstructor // metodo constructor vacio
@Data // datos get and setter
@Entity(name="Cliente")
@Table(name="t_cliente")
public class Cliente implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id // para identificar la clave primaria
    @Column(name="codcli") // identificar el nombre de la columna
    @GeneratedValue(strategy= GenerationType.IDENTITY) // auto_increment
    private long codigo;
    @Column(name="nomcli") 
    private String nombre;
    @Column(name="apepcli") 
    private String apep;
    @Column(name="apemcli") 
    private String apem;
    @Column(name="dnicli") 
    private String dni;
    @Column(name="dircli") 
    private String direccion;
    @Column(name="telcli") 
    private String telefono;
    @Column(name="celcli") 
    private String celular;
    @Column(name="corcli") 
    private String correo;
    @Column(name="sexcli") 
    private String sexo;
    @Column(name="estcli") 
    private boolean estado;
    @ManyToOne
    @JoinColumn(name="coddis",nullable = false)
    private Distrito distrito;

}
