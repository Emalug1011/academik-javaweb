package edu.academik.clase02.jsp001.modelo;

/**
 *
 * @author Mario Batres
 */
public class Producto {

    private Integer id;

    private String nombre;

    public Producto() {
    }

    public Producto(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
