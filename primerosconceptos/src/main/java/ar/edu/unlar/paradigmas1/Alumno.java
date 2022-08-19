package ar.edu.unlar.paradigmas1;

public class Alumno extends Persona {
    private String carrera;
    private String matricula;
    private Integer cantidadMateriasAprobadas;
    private Float promedio;

    public String getCarrera() {
        return carrera;
    }  
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public Integer getCantidadMateriasAprobadas() {
        return cantidadMateriasAprobadas;
    }
    public void setCantidadMateriasAprobadas(Integer cantidadMateriasAprobadas) {
        this.cantidadMateriasAprobadas = cantidadMateriasAprobadas;
    }
    public Float getPromedio() {
        return promedio;
    }
    public void setPromedio(Float promedio) {
        this.promedio = promedio;
    }

}