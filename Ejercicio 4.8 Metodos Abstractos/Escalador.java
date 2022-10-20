package CarreraCiclistica;

public class Escalador extends Ciclista {
    // Atributo que define la acelaración promedio de un escalador
    private double aceleraciónPromedio;
    // Atributo que define el grado de rampa soportado por un escalador
    private double gradoRampa;
    public Escalador(int identificador, String nombre, double
            aceleraciónPromedio, double gradoRampa) {
        super(identificador, nombre);
        this.aceleraciónPromedio = aceleraciónPromedio;
        this.gradoRampa = gradoRampa;
    }
    protected double getAceleraciónPromedio() {
        return aceleraciónPromedio;
    }
    protected void setAceleraciónPromedio(double
                                                  aceleraciónPromedio) {
        this.aceleraciónPromedio = aceleraciónPromedio;
    }
    protected double getGradoRampa() {
        return gradoRampa;
    }
    protected void setGradoRampa(double gradoRampa) {
        this.gradoRampa = gradoRampa;
    }
    protected void imprimir() {
        super.imprimir(); // Invoca el método imprimir de la clase padre
        System.out.println("Aceleración promedio = " +
                aceleraciónPromedio);
        System.out.println("Grado de rampa = " + gradoRampa);
    }
    protected String imprimirTipo() {
        return "Es un escalador";
    }
}
    

