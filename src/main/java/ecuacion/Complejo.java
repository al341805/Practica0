package ecuacion;

/**
 * Created by Carles Torrat on 15/02/2017.
 */
public class Complejo {
    private double parteReal;
    private double parteImaginaria;

    public Complejo(double real, double imag) {
        parteReal = real;
        parteImaginaria = imag;
    }
    public String toString() {
        if (parteImaginaria == 0) return parteReal + "";
        if (parteReal == 0) return parteImaginaria + "i";
        if (parteImaginaria <  0) return parteReal + " - " + (-parteImaginaria) + "i";
        return parteReal + " + " + parteImaginaria + "i";
    }

    public double getParteReal() {
        return parteReal;
    }

    public double getParteImaginaria() {
        return parteImaginaria;
    }

    public boolean equals(Object objeto) {
        if (objeto == null) return false;
        if (this.getClass() != objeto.getClass()) return false;
        Complejo other = (Complejo) objeto;
        return (this.parteReal == other.parteReal) && (this.parteImaginaria == other.parteImaginaria);
    }
}
