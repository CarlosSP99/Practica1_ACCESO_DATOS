package org.example;

public class Alumnos {
    private String nombre;
    private String apellido;
    private String curso;
    private String DNI;

    public Alumnos(String nombre, String apellido, String curso, String DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.DNI = DNI;
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

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
}
