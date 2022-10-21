package grupo1;

import java.util.*;
import java.util.PriorityQueue;
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

        for (int i = 0; i < 23; i++) {
            jugadores.add(new JugadorSeleccion(i, "Jugador " + i, "Delantero"));
        }

        assertTrue(jugadores.size() == 23);

    }

    @Test
    public void deberiaAgregarJugadoresConOffer(){

        Queue<JugadorSeleccion> jugadores = new PriorityQueue<>();

        for (int i = 0; i < 22; i++) {
            jugadores.add(new JugadorSeleccion(i, "Jugador " + i, "Delantero"));
        }

        jugadores.offer(new JugadorSeleccion(10, "messi ", "central"));

        assertTrue(jugadores.size() == 23);

    }

    @Test 
    public void deveriaRemoverJugador(){

        Queue<JugadorSeleccion> jugadores = new PriorityQueue<>();

        for (int i = 0; i < 23; i++) {
            jugadores.add(new JugadorSeleccion(i, "Jugador " + i, "Delantero"));
        }

        assertTrue(jugadores.size() == 23);

        jugadores.remove();

        assertTrue(jugadores.size() == 22);

    }

    @Test
    public void deveriaRemoverYlacabezadelacola(){

        Queue<JugadorSeleccion> jugadores = new PriorityQueue<>();

        jugadores.poll();

        assertTrue(jugadores.size() == 0);
        assertTrue(jugadores.poll() == null);

        for (int i = 0; i < 23; i++) {
            jugadores.add(new JugadorSeleccion(i, "Jugador " + i, "Delantero"));
        }

        jugadores.poll();

        assertTrue(jugadores.size() == 22);
        
    }

    @Test
    public void deberiabuscarsineliminarprimerelemento(){

        Queue<JugadorSeleccion> jugadores = new PriorityQueue<>();
        
        JugadorSeleccion j1 = new JugadorSeleccion(0, "Jose", "centro");

        jugadores.add(j1);

        for (int i = 0; i < 22; i++) {
            jugadores.add(new JugadorSeleccion(i, "Jugador " + i, "Delantero"));
        }

        jugadores.element();

        assertEquals(jugadores.element(),j1);
    }

    @Test
    public void deveriafuncionarusarpeek(){

        Queue<JugadorSeleccion> jugadores = new PriorityQueue<>();
        jugadores.peek();

        assertTrue(jugadores.size() == 0);
        assertTrue(jugadores.peek()== null);

        JugadorSeleccion j1 = new JugadorSeleccion(0, "Jose", "centro");

        jugadores.add(j1);

        assertTrue(jugadores.size() == 1);

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
        assertEquals(3, coleccionHash.conteo());
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

        assertEquals(pais1, coleccionHash.primero()); // El primero objeto en mi lista hash
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
        assertEquals(3, coleccionTree.conteo());
        coleccionTree.pop(pais1); //Remuevo objetos 
        coleccionTree.pop(pais3);
        assertEquals(1, coleccionTree.conteo());
        
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
