package ecuacion;
import java.util.List;

/**
 * Created by Carles Torrat on 15/02/2017.
 */
public class EcuacionCuadratica implements Ecuacion{
    private double a;
    private double b;
    private double c;
    private Solucion solucion;

    public EcuacionCuadratica(double coeficienteAlCuadrado, double coeficiente, double terminoIndependiente) {
        this.a = coeficienteAlCuadrado;
        this.b = coeficiente;
        this.c = terminoIndependiente;
        if(tieneSolucionesComplejas()) solucion = new Solucion<Complejo>();
        else solucion = new Solucion<Double>();
    }

    @Override
    public Solucion getSolucion() {
        calcularSolucion();
        return solucion;
    }

    @Override
    public void calcularSolucion(){
        solucion.addAll(resultadoFormula());
    }

    private List resultadoFormula(){
        Solucion resultado;
        if (tieneSolucionesComplejas()){
            resultado = new Solucion<Complejo>();
            resultado.addSolucion(new Complejo(-b/(2*a), Math.sqrt(Math.abs(calculaRaiz()))/(2*a)));
            resultado.addSolucion(new Complejo(-b/(2*a), -Math.sqrt(Math.abs(calculaRaiz()))/(2*a)));
        }
        else{
            resultado= new Solucion<Double>();
            resultado.addSolucion((-b + Math.sqrt(calculaRaiz())) / (2 * a));
            resultado.addSolucion((-b - Math.sqrt(calculaRaiz())) / (2 * a));
        }
        return resultado.getListaSoluciones();
    }

    private boolean tieneSolucionesComplejas(){
        return calculaRaiz()<0;
    }

    private double calculaRaiz(){
        return Math.pow(b,2) - (4*a*c);
    }
}
