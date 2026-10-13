package modelo;

import java.util.ArrayList;
import java.util.List;



public class Pelicula {
    private String titulo;
    private int duracionMinutos;
    private List<Funcion> funciones;// aca hay una relacin de composicion con la clase "Funcion"
    //crea una lista de funciones que vienen de la clase funcion

    //cfreamos el constructor
    public Pelicula(String titulo, int duracionMinutos){
        this.titulo = titulo;
        this.duracionMinutos = duracionMinutos;
        this.funciones = new ArrayList<>();
    }

    //Composicion: la pelicula crea e instacia sus propias funciones
    public Funcion agregarFuncion(String horario, double precioBase, int capacidad){
        Funcion nuevaFuncion = new Funcion(this, horario, precioBase, capacidad);
        this.funciones.add(nuevaFuncion);
        return nuevaFuncion;
    }

    public String getTitulo(){
        return titulo;
    }

    public int getDuracionMinutos1(){
        return duracionMinutos;
    }
    
    public List<Funcion> getFunciones(){
        return funciones;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }
}
