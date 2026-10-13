import modelo.*;
import modelo.ServicioReserva;


public class App {
    public static void main(String[] args) throws Exception {
        //Creamos la pelicula y sus funciones (composicion)

        Pelicula pelicula = new Pelicula("Avatar", 200);
        Funcion funcionNoche = pelicula.agregarFuncion("22:00", 1500.0, 100);

        //Creamos el cliente y el servicio
        Cliente cliente = new Cliente("Cli-101", "Vicente Cersosimo");
        ServicioReserva servicio = new ServicioReserva();

        //Crear Reserva con entrada VIP (agrewgacion + herencia)

        Reserva reserva = servicio.crearReservaVIP(cliente, funcionNoche, 2, 500);

        if(reserva != null){
            System.out.println("reserva creada para: " + reserva.getCliente().getNombre() + " para las: " + funcionNoche.getHorario() + " hs");
            System.out.println("Pelicula: " + funcionNoche.getPelicula().getTitulo());
            System.out.println("Duracion: " + pelicula.getDuracionMinutos() + " minutos");
            System.out.println("Total a pagar: $" + reserva.calcularTotal());


        }
    }
}
