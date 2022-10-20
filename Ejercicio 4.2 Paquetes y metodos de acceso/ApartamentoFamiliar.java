package Inmuebles;

public class ApartamentoFamiliar extends Apartamento {
    // Atributo que identifica el valor por área de un apartamento familiar
    protected static double valorArea = 2000000;
    /* Atributo que identifica el valor de la administración de un 
    apartamento familiar */
    protected int valorAdministración;
    public ApartamentoFamiliar(int identificadorInmobiliario, int área, String dirección, int númeroHabitaciones, int númeroBaños, int valorAdministración) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, área, dirección,
                númeroHabitaciones, númeroBaños);
        this.valorAdministración = valorAdministración;
    }
    /**
     * Método que muestra en pantalla los datos de un apartamento familiar
     */
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Valor de la administración = $" + valorAdministración);
        System.out.println();
    }
}

