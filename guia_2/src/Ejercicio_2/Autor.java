package Ejercicio_2;
/*
Es necesario modelar el objeto de tipo Libro con las siguientes
caracteristicas: titulo, precio, stock y Autor, este último posee las
características de: nombre, apellido, email y genero ( ‘M’ o ‘F’ ). Para este
ejercicio vamos a asumir que un libro tiene un único autor
 */

public class Autor {
    private String nombre;
    private String apellido;
    private String email;
    private char genero;

    public Autor(){

    }

    public Autor(String nombre, String apellido, String email, char genero){
        this.nombre=nombre;
        this.apellido=apellido;
        this.email=email;
        this.genero=genero;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public String getEmail(){
        return email;
    }

    public char getGenero(){
        return genero;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setApellido(String apellido){
        this.apellido=apellido;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public void setGenero(char genero){
        this.genero=genero;
    }

    @Override
    public String toString(){
        return "Nombre: "+nombre+"\nApellido "+apellido+"\nEmail: "+email+"\nGenero: "+genero;
    }

}
