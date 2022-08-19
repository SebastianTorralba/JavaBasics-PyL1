package ar.edu.unlar.paradigmas1;

import java.time.LocalDate;

public class Persona {
    //Principios de Orientación a Objetos
    //Encapsulamiento
    //Herencia
    //Polimorfismo

    //Atributos (Estado)
    //Tipos de Datos Objetos
    private String nombre;
    private String apellido;
    private Integer edad;
    private String sexo;
    private String estadoCivil;
    private LocalDate fechaNacimiento;
    private Float sueldo;
    private Boolean tieneHijos;
    //Tipos de Datos Primitivos
    private int cantidadHijos;
    private boolean tieneCasa;
    private float montoAlquiler;
    

    //Metodos (Comportamiento)
    
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
    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getEstadoCivil() {
        return estadoCivil;
    }
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public Float getSueldo() {
        return sueldo;
    }
    public void setSueldo(Float sueldo) {
        this.sueldo = sueldo;
    }
    public Boolean getTieneHijos() {
        return tieneHijos;
    }
    public void setTieneHijos(Boolean tieneHijos) {
        this.tieneHijos = tieneHijos;
    }
    public int getCantidadHijos() {
        return cantidadHijos;
    }
    public void setCantidadHijos(int cantidadHijos) {
        this.cantidadHijos = cantidadHijos;
    }
    public boolean isTieneCasa() {
        return tieneCasa;
    }
    public void setTieneCasa(boolean tieneCasa) {
        this.tieneCasa = tieneCasa;
    }
    public float getMontoAlquiler() {
        return montoAlquiler;
    }
    public void setMontoAlquiler(float montoAlquiler) {
        this.montoAlquiler = montoAlquiler;
    }
    public void saludar() {
        System.out.println("Hola Soy " + nombre);
    }
    @Override
    public String toString() {
        return "Persona [apellido=" + apellido + ", edad=" + edad + ", estadoCivil=" + estadoCivil + ", nombre="
                + nombre + "]";
    }
    
}
