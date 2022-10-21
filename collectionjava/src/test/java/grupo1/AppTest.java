package grupo1;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class AppTest {

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

    @Test
    public void deberiaAgregarJugadorPriorityQueue() {

        Queue<JugadorSeleccion> jugadores = new PriorityQueue<>();
        JugadorSeleccion jugador = new JugadorSeleccion(1, "Messi", "Delantero");
        jugadores.add(jugador);
        

    }

    @Test // Hash-Set                                 --------------- Thiago Inicio
    public void Test_HashSet_AgregarPaises() {

        Hash_Set coleccionHash = new Hash_Set(); //Lista - Hash

        Paises pais1 = new Paises("Argentina", "BS.AS", 1000);
        Paises pais2 = new Paises("Uruguay", "Monte Video", 10);
        Paises pais3 = new Paises("Peru", "Lima", 15);
        Paises pais4 = new Paises("Alemania", "Berlin", 15);
        Paises pais5 = new Paises("Abjasia", "Sujumi ", 15);

        coleccionHash.push(pais1); //Agrego objetos al hash 
        coleccionHash.push(pais2);
        coleccionHash.push(pais3);
        coleccionHash.push(pais4);
        coleccionHash.push(pais5);
        coleccionHash.push(pais3);
        coleccionHash.push(pais1);

        assertEquals(5, coleccionHash.conteo()); // La cantidad de objetos en mi lista Hash
        System.out.println(coleccionHash);
        System.out.println(
                "\nComo se puede ver no se mostraran de la misma manera en que se se anadieron los datos, tampoco se mostrara 2 veces el mismo objeto \nEsta ordenado aleatoriamente.");
    }

    @Test
    public void Test_HashSet_RemoverPaises() {

        Hash_Set coleccionHash = new Hash_Set(); //Lista - Hash

        Paises pais1 = new Paises("Argentina", "BS.AS", 1000);
        Paises pais2 = new Paises("Uruguay", "Monte Video", 10);
        Paises pais3 = new Paises("Peru", "Lima", 15);

        coleccionHash.push(pais1); //Agrego objetos 
        coleccionHash.push(pais2);
        coleccionHash.push(pais3);

        coleccionHash.pop(pais1); //Remuevo objetos 
        coleccionHash.pop(pais3);
        assertEquals(1, coleccionHash.conteo());
        System.out.println("\nSe removieron 2 de los 3 objetos anadidos");
    }

    @Test
    public void Test_HashSet_PrimeraPosicion() {

        Hash_Set coleccionHash = new Hash_Set(); //Lista - Hash                            

        Paises pais1 = new Paises("Argentina", "BS.AS", 1000);
        Paises pais2 = new Paises("Uruguay", "Monte Video", 10);
        Paises pais3 = new Paises("Peru", "Lima", 15);

        coleccionHash.push(pais1); //Agrego objetos al hash
        coleccionHash.push(pais2);
        coleccionHash.push(pais3);

        assertEquals(pais2, coleccionHash.primero()); // El primero objeto en mi lista hash
    }

    @Test //Tree-Set 
    public void Test_TreeSet_AgregarPaises() {

        Tree_Set coleccionTree = new Tree_Set(); //Lista - Tree

        Paises pais1 = new Paises("Argentina", "BS.AS", 1000);
        Paises pais2 = new Paises("Uruguay", "Monte Video", 10);
        Paises pais3 = new Paises("Peru", "Lima", 15);
        Paises pais4 = new Paises("Alemania", "Berlin", 15);
        Paises pais5 = new Paises("Abjasia", "Sujumi ", 15);

        coleccionTree.push(pais1); //Agrego objetos al Tree 
        coleccionTree.push(pais2);
        coleccionTree.push(pais3);
        coleccionTree.push(pais4);
        coleccionTree.push(pais5);
        coleccionTree.push(pais3);
        coleccionTree.push(pais1);

        assertEquals(5, coleccionTree.conteo()); // La cantidad de objetos en mi Tree
        System.out.println(coleccionTree);
        System.out.println(
                "\nComo se puede ver no se mostraran de la misma manera en que se se anadieron los datos, tampoco se mostrara 2 veces el mismo objeto \nEsta ordenado alfabeticamente por el nombre del pais.");
    }

    @Test
    public void Test_TreeSet_RemoverPaises() {

        Tree_Set coleccionTree = new Tree_Set(); //Lista - Tree

        Paises pais1 = new Paises("Argentina", "BS.AS", 1000);
        Paises pais2 = new Paises("Uruguay", "Monte Video", 10);
        Paises pais3 = new Paises("Peru", "Lima", 15);

        coleccionTree.push(pais1); //Agrego objetos 
        coleccionTree.push(pais2);
        coleccionTree.push(pais3);

        coleccionTree.pop(pais1); //Remuevo objetos 
        coleccionTree.pop(pais3);
        assertEquals(1, coleccionTree.conteo());
        System.out.println("\nSe removieron 2 de los 3 objetos anadidos");
    }

    @Test
    public void Test_TreeSet_PrimeraPosicion() {

        Tree_Set coleccionTree = new Tree_Set(); //Lista - Tree

        Paises pais1 = new Paises("Argentina", "BS.AS", 1000);
        Paises pais2 = new Paises("Uruguay", "Monte Video", 10);
        Paises pais3 = new Paises("Peru", "Lima", 15);
        Paises pais4 = new Paises("Alemania", "Berlin", 15);
        Paises pais5 = new Paises("Abjasia", "Sujumi ", 15);

        coleccionTree.push(pais1); //Agrego objetos al Tree 
        coleccionTree.push(pais2);
        coleccionTree.push(pais3);
        coleccionTree.push(pais4);
        coleccionTree.push(pais5);

        assertEquals(pais5.getNombrePais(), coleccionTree.primero()); // El primero objeto en mi Tree
    }

    @Test //LinkedHash-Set 
    public void Test_LinkedHashSet_AgregarPaises() {

        LinkedHash_Set coleccionLinkedHash = new LinkedHash_Set(); //Lista - LinkedHash

        Paises pais1 = new Paises("Argentina", "BS.AS", 1000);
        Paises pais2 = new Paises("Uruguay", "Monte Video", 10);
        Paises pais3 = new Paises("Peru", "Lima", 15);

        coleccionLinkedHash.push(pais1);
        coleccionLinkedHash.push(pais2);
        coleccionLinkedHash.push(pais3);
        coleccionLinkedHash.push(pais3);
        coleccionLinkedHash.push(pais1);

        assertEquals(3, coleccionLinkedHash.conteo()); // La cantidad de objetos en mi lista LinkedHash
        System.out.println(coleccionLinkedHash);
        System.out.println(
                "\nComo se puede ver no se mostraran de la misma manera en que se se anadieron los datos, tampoco se mostrara 2 veces el mismo objeto \nEsta ordenado por orden de entrada.");
    }

    @Test
    public void Test_LinkedHashSet_RemoverPaises() {

        LinkedHash_Set coleccionLinkedHash = new LinkedHash_Set(); //Lista - LinkedHash

        Paises pais1 = new Paises("Argentina", "BS.AS", 1000);
        Paises pais2 = new Paises("Uruguay", "Monte Video", 10);
        Paises pais3 = new Paises("Peru", "Lima", 15);

        coleccionLinkedHash.push(pais1); //Agrego objetos 
        coleccionLinkedHash.push(pais2);
        coleccionLinkedHash.push(pais3);

        coleccionLinkedHash.pop(pais1); //Remuevo objetos 
        coleccionLinkedHash.pop(pais3);
        assertEquals(1, coleccionLinkedHash.conteo());
        System.out.println("\nSe removieron 2 de los 3 objetos anadidos.");
    }

    @Test //--------------- Thiago Final
    public void Test_LinkedHashSet_PrimeraPosicion() {

        LinkedHash_Set coleccionLinkedHash = new LinkedHash_Set(); //Lista - LinkedHash

        Paises pais1 = new Paises("Argentina", "BS.AS", 1000);
        Paises pais2 = new Paises("Uruguay", "Monte Video", 10);
        Paises pais3 = new Paises("Peru", "Lima", 15);

        coleccionLinkedHash.push(pais1); //Agrego objetos a mis lista LinkedHash 
        coleccionLinkedHash.push(pais2);
        coleccionLinkedHash.push(pais3);

        assertEquals(pais1, coleccionLinkedHash.primero()); // El primero objeto en mi lista LinkedHash
    }

}
