package modelo;

public class EntradaVIP extends Entrada{

    private double recargoServicio;

    public EntradaVIP(String codigo, Funcion funcion, double precioBase, double recargoServicio) {
        super(codigo, funcion, precioBase);
        this.recargoServicio = recargoServicio;
    }

    @Override
    public double calcularPrecioFinal(){
        //La entrada VIP suma recargo acceso preferencial o combo
        return precioBase + recargoServicio;
    }

}
