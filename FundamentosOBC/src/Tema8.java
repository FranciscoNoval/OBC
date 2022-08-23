public class Tema8 {
    /*
    Para practicar la encapsulación:
    Crear clase Persona.
    Crear variables las privadas edad, nombre y telefono de la clase Persona.
    Crear gets y sets de cada propiedad.
    Crear un objeto persona en el main.
    Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
     */
    public static void main(String[] args){
        Persona muchacho = new Persona();

        muchacho.setNombre("Javier");
        muchacho.setEdad(16);
        muchacho.setTelefono(11456789);

        System.out.println("El nombre del muchacho es "+muchacho.getNombre());
        System.out.println("Su edad es "+muchacho.getEdad());
        System.out.println("Y su teléfono es "+muchacho.getTelefono());
    }
}
class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getNombre(){
        return this.nombre;
    }public int getTelefono(){
        return this.telefono;
    }
}