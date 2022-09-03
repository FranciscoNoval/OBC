package poo.interfaces;

public class Main {
    /**
     * Aqui el objeto elige que clase implementar sin que sea modificado nada en el main.
     */
    static CocheCRUD cocheCRUD = new CocheCRUDImpl();

    public static void main(String[] args) {


        cocheCRUD.save(new Coche());
        cocheCRUD.FindAll();
        cocheCRUD.delete(new Coche());
    }
}
