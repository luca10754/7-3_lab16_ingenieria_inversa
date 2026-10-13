package modelo;

public class EntradaGeneral extends Entrada{

    public EntradaGeneral(String codigo, Funcion funcion, double precioBase) {
        super(codigo, funcion, precioBase);
    }
    @Override
    public double calcularPrecioFinal(){
        //la entrada general no tiene recargo
        return precioBase;
    }
}
