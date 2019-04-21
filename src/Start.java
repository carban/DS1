/*

Nombre del archivo: Start.java
Fecha de creación: 09/10/2018
Fecha de modificación: 23/04/2019
Autores: Carlos Esteban Murillo Sandoval 1526857-3743
         Juan Camilo Sánchez Barreiro    1527749-3743
         Bryan Steven Biojó Romero       1629366-3743
         Santiago Andrés Pineda Ramírez  1663634-2711

*/

// Imports:
import Vista.loading;
import Vista.login2;

// INICIO DE LA CLASE.
public class Start {
    // Método principal.
    public static void main(String[] args) {
        loading ll = new loading();
        ll.setLocationRelativeTo(null);
        ll.setVisible(true);
        try {
            for (int i = 0; i < 100; i++) {
                Thread.sleep(40);
                ll.setBar(i);
            }
            ll.dispose();
            login2 log = new login2();
            log.setLocationRelativeTo(null);
            log.setVisible(true);
        } catch (Exception e) {
        }
    } // Fin del método principal.
} // FIN DE LA CLASE.
