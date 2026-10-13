package modelo;

public class Funcion {
    private Pelicula pelicula;
    private String horario;
    private double precioBase;
    private int asientosDisponibles;

    public Funcion(){}

    public Funcion( Pelicula pelicula, String horario, double precioBase, int capacidad){
        this.pelicula = pelicula;
        this.horario = horario;
        this.precioBase = precioBase;
        this.asientosDisponibles = capacidad;
    }

    public boolean ocuparAsientos(int cantidad){
        if(cantidad <= asientosDisponibles){
            asientosDisponibles -= cantidad;
            return true;
        }
        return false;
    }

    public double getPrecioBase(){
        return precioBase;
    }

    public String getHorario(){
        return horario;
    }

    public Pelicula getPelicula(){
        return pelicula;
    }

}
