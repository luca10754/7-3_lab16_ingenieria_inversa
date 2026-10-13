package modelo;
public class Cliente {
    
    //definimos los atributos de la clase
    private String id;
    private String nombre;

    //creamos un constructor que recibe id y nombre
    public Cliente(String id, String nombre){
        this.id=id;
        this.nombre=nombre;
    }

    //definimos los metodos get para obtener tanto id como el nombre
    public String getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }

}
