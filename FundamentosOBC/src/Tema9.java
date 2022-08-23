public class Tema9 {

    public static void main(String[] args){
        Cliente nuevoCliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        System.out.println("=======================Cliente========================");
        nuevoCliente.setNombre("Hernesto Soria");
        nuevoCliente.setEdad(56);
        nuevoCliente.setTelefono(11456563);
        nuevoCliente.setCredito(35000);

        System.out.println("El nombre del cliente es: "+nuevoCliente.getNombre());
        System.out.println("La edad del cliente es: "+nuevoCliente.getEdad());
        System.out.println("El teléfono del clente es: "+nuevoCliente.getTelefono());
        System.out.println("El cliente "+nuevoCliente.getNombre()+" tiene un credito de $"+nuevoCliente.getCredito());

        System.out.println("=======================Trabajador========================");
        trabajador.setNombre("Franco Gomez");
        trabajador.setEdad(36);
        trabajador.setTelefono(22456545);
        trabajador.setSalario(4500.89);

        System.out.println("El nombre del trabajador es: "+trabajador.getNombre());
        System.out.println("La edad del trabajador es: "+trabajador.getEdad());
        System.out.println("El teléfono del trabajador es: "+trabajador.getTelefono());
        System.out.println("El cliente "+trabajador.getNombre()+" tiene un credito de $"+trabajador.getSalario());
    }
}
class Persona1{
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

    }
    public int getTelefono(){

        return this.telefono;
    }
}
  class Cliente extends Persona {
  double credito;

  public void setCredito(double credito) {
      this.credito = credito;
  }
  public double getCredito(){
      return this.credito;
      }
  }
  class Trabajador extends Persona {
    double salario;

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario(){
        return this.salario;
    }
}


