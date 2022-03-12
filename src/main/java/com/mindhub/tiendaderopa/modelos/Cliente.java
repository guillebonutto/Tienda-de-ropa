package com.mindhub.tiendaderopa.modelos;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    private String nombre;
    private String apellido;
    private String email;
    private String password;

    @OneToMany(mappedBy = "cliente", fetch = FetchType.EAGER)
    private Set<Pago> pagos = new HashSet<>();
//    @JoinColumn(name = "pagos_id", referencedColumnName = "id")
<<<<<<< HEAD
    @OneToOne(mappedBy = "cliente", cascade = CascadeType.ALL)
    private Compra pagos;
=======
/*    @OneToOne(mappedBy = "cliente", cascade = CascadeType.ALL)
    private Pago pagos;*/
>>>>>>> b72d4db413a9e9cfef09c3def2f588cd8fb4b58b

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String email, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

/*    public Set<Compra> getPagos() {
        return pagos;
    }

    public void setPagos(Set<Compra> pagos) {
        this.pagos = pagos;
    }*/
}
