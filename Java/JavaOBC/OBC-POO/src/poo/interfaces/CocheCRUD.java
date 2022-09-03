package poo.interfaces;


import java.util.List;

/**
 * Se declaran los metodos, no se implementan.
 * Actua como un contrato, dice lo que hay que hacer pero no lo hace.
 * Cada quien cree implementaciones distintas, tendra que respetar los metodos definidos aquí
 */
public interface CocheCRUD {

    void save(Coche empleado);

    List<Coche> FindAll();

    void delete(Coche empleado);
}
