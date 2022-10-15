package grupo1;

import java.util.*;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AppTest 
{
 
    @Test
    public void deberiaAgregarJugadorHashMap() {

        HashMap<Integer, JugadorSeleccion> jugadores = new HashMap<>();
        for (int i = 0; i < 23; i++) {
            jugadores.put(i, new JugadorSeleccion(i, "Jugador " + i, "Delantero"));
        }

        assertTrue(jugadores.size() == 23);

    }
    
    @Test
    public void deberiaBuscarDuplicadoHashMap() {

        HashMap<Integer, JugadorSeleccion> jugadores = new HashMap<>();
        for (int i = 0; i < 23; i++) {
            jugadores.put(i, new JugadorSeleccion(i, "Jugador " + i, "Delantero"));
        }

        jugadores.put(1, new JugadorSeleccion(1, "Messi", "Delantero"));

        //imprimir jugadores
        for (Map.Entry<Integer, JugadorSeleccion> jugador : jugadores.entrySet()) {
            System.out.println(jugador.getValue());
        }

        assertTrue(jugadores.size() == 23);
    }
    
    @Test
    public void debeRemoverJugadorHashMap() {

        HashMap<Integer, JugadorSeleccion> jugadores = new HashMap<>();
        for (int i = 0; i < 23; i++) {
            jugadores.put(i, new JugadorSeleccion(i, "Jugador " + i, "Delantero"));
        }

        jugadores.remove(1);

        //imprimir jugadores
        for (Map.Entry<Integer, JugadorSeleccion> jugador : jugadores.entrySet()) {
            System.out.println(jugador.getValue());
        }

        assertTrue(jugadores.size() == 22);
    }

    @Test
    public void deberiaReemplazarJugadorHashMap() {

        HashMap<Integer, JugadorSeleccion> jugadores = new HashMap<>();
        for (int i = 0; i < 23; i++) {
            jugadores.put(i, new JugadorSeleccion(i, "Jugador " + i, "Delantero"));
        }

        jugadores.replace(1, new JugadorSeleccion(1, "Messi", "Delantero"));

        //imprimir jugadores
        for (Map.Entry<Integer, JugadorSeleccion> jugador : jugadores.entrySet()) {
            System.out.println(jugador.getValue());
        }

        assertTrue(jugadores.size() == 23);
    }



   
}
