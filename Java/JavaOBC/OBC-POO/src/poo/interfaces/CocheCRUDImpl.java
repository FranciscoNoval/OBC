package poo.interfaces;


import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD {

    private List<Coche> coches = new ArrayList<>();
    @Override
    public void save(Coche coche) {
        coches.add(coche);
    }

    @Override
    public List<Coche> FindAll() {
        return coches;
    }

    @Override
    public void delete(Coche coche) {
        coches.remove(coche);
    }
}
