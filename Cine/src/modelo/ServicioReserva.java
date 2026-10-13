package modelo;

import modelo.*;
import java.util.UUID;

public class ServicioReserva {

    public Reserva crearReservaVIP(Cliente cliente, Funcion funcion, int cantidadEntradas, double recargoVIP){
        



        String idReserva = "RES-" + UUID.randomUUID().toString().substring(0, 4);
        Reserva reserva = new Reserva(idReserva, cliente, funcion, null);

        for(int i = 0; i < cantidadEntradas; i++){
            String codEntradas = "VIP-" + (i+i);
            Entrada entradaVIP = new EntradaVIP(codEntradas, funcion, funcion.getPrecioBase(), recargoVIP);
            reserva.agregarEntrada(entradaVIP);
        }
        return reserva;
    }
    
}
