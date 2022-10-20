package Inmuebles;

public class LocalComercial extends Local {
    protected static double valorArea = 3000000;
    /* Atributo que identifica el centro comercial donde está ubicado el 
    local comercial */
    protected String centroComercial;
    public LocalComercial(int identificadorInmobiliario, int área, String dirección, tipo tipoLocal, String centroComercial) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, área, dirección, tipoLocal);
        this.centroComercial = centroComercial;
    }
    /**
     * Método que muestra en pantalla los datos de un local comercial
     */
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Centro comercial = " + centroComercial);
        System.out.println();
    }
}
