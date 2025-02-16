package com.unab.pubunab.modelos;

import java.sql.Timestamp;

public class Usuario {
    
    private int id;
    private String email;
    private String nombre;
    private String password;
    private Timestamp creado;

    public Usuario() {
    }

    public Usuario(int id, String email, String nombre, String password, Timestamp creado) {
        this.id = id;
        this.email = email;
        this.nombre = nombre;
        this.password = password;
        this.creado = creado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getCreado() {
        return creado;
    }

    public void setCreado(Timestamp creado) {
        this.creado = creado;
    }

    
}