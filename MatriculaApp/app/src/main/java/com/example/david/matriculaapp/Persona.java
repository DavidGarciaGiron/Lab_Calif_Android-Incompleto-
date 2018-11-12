package com.example.david.matriculaapp;

public class Persona {

    private Integer id;
    private String correo;
    private String tipo;
    private String detalle;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", correo='" + correo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", detalle='" + detalle + '\'' +
                '}';
    }
}

