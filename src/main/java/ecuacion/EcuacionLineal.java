package ecuacion;

/**
 * Created by Carles Torrat on 11/02/2017.
 */
public class EcuacionLineal implements Ecuacion{
    private double a;
    private double b;
    private Solucion solucion;

    public EcuacionLineal(double coeficiente){
        this.a = coeficiente;
        solucion = new Solucion<Double>();
    }
    public EcuacionLineal(double coeficiente, double terminoIndependiente){
        this.a = coeficiente;
        this.b = terminoIndependiente;
        solucion = new Solucion<Double>();
    }

    @Override
    public Solucion getSolucion() {
        calcularSolucion();
        return solucion;
    }

    @Override
    public void calcularSolucion(){
        solucion.addSolucion((-b)/a);
    }
}
