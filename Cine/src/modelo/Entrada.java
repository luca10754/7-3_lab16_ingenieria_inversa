package modelo;

public abstract class Entrada {
    private String codigo;
    private Funcion funcion;
    protected double precioBase;

    public Entrada(String codigo, Funcion funcion, double precioBase) {
        this.codigo = codigo;
        this.funcion = funcion;
        this.precioBase = precioBase;
    }

    //metodo abstracto para aplicar polimorfismo en el calculo del precio final
    public abstract double calcularPrecioFinal();

    public String getCodigo() {
        return codigo;
    }

    public Funcion getFuncion() {
        return funcion;
    }


}
