package modelo;

import java.util.ArrayList;
import java.util.List;


public class Reserva {

    private String idReserva;

    //ASOCIACION: conecta cliente y funcion
    private Cliente cliente;
    private Funcion funcion;

    //AGREGACION: Reserva agrega varias entradas (pueden ser entradas generales o VIP)
    private List<Entrada> entradas;

    public Reserva(String idReserva, Cliente cliente, Funcion funcion, List<Entrada> entradas) {
        this.idReserva = idReserva;
        this.cliente = cliente;
        this.funcion = funcion;
        this.entradas = new ArrayList<>();
    }

    //agregacion recibe objetos Entrada ya creados externamente

    public void agregarEntrada(Entrada entrada){
        this.entradas.add(entrada);
    }

    public double calcularTotal(){
        double total = 0;
        for(Entrada e : entradas){
            total += e.calcularPrecioFinal();
        }
        return total;
    }

    public String getIdReserva() {
        return idReserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Entrada> getEntradas() {
        return entradas;
    }

    

}
