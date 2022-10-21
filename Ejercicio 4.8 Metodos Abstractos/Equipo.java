package CarreraCiclistica;

import java.util.*;
public class Equipo {
    private String nombre; /* Atributo que define el nombre del equipo
de ciclismo */
    private static double totalTiempo; /* Atributo que define el tiempo
total obtenido por el equipo */
    private String país; /* Atributo que define el país al que pertenece el
equipo */
    Vector listaCiclistas;
    public Equipo(String nombre, String país) {
        this.nombre = nombre;
        this.país = país;
        totalTiempo = 0; // Se inicializa el tiempo del equipo en cero
        listaCiclistas = new Vector();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    private String getPaís() {
        return país;
    }
    private void setPaís(String país) {
        this.país = país;
    }
    void añadirCiclista(Ciclista ciclista) {
        listaCiclistas.add(ciclista); // Se agrega el ciclista al vector de ciclistas
    }
    void listarEquipo() {
        for (int i = 0; i < listaCiclistas.size(); i++) {
            Ciclista c = (Ciclista) listaCiclistas.elementAt(i); /* Se aplica casting para extraer el elemento */
            System.out.println(c.getNombre());
        }
    }
    void buscarCiclista() {
        Scanner sc = new Scanner(System.in); /* Se solicita texto
ingresado por teclado */
        String nombreCiclista = sc.next();
        for (int i = 0; i < listaCiclistas.size(); i++) { /* Se recorre el vector
de ciclistas */
            Ciclista c = (Ciclista) listaCiclistas.elementAt(i); /* Se obtiene
un elemento del vector */
            if (c.getNombre().equals(nombreCiclista)) { /* Si el nombre
ingresado se encuentra */
                System.out.println(c.getNombre());
            }
        }
    }
    void calcularTotalTiempo() {
        for (int i = 0; i < listaCiclistas.size(); i++) { // Se recorre el vector
            Ciclista c = (Ciclista) listaCiclistas.elementAt(i);
            totalTiempo = totalTiempo + c.getTiempoAcumulado();
        }
    }
    void imprimir() {
        System.out.println("Nombre del equipo = " + nombre);
        System.out.println("País = " + país);
        System.out.println("Total tiempo del equipo = " + totalTiempo);
    }
}


