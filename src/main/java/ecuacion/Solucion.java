package ecuacion;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Carles Torrat on 11/02/2017.
 */
public class Solucion<T>{
    private List<T> soluciones;

    public Solucion(){
        soluciones = new ArrayList<T>();
    }

    public void addSolucion(T solucion){
        soluciones.add(solucion);
    }

    public void addAll(List solucion){
        soluciones.addAll(solucion);
    }

    public List getListaSoluciones(){
        return soluciones;
    }

}
