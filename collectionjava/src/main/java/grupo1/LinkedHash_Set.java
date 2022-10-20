package grupo1;

import java.util.*;

public class LinkedHash_Set {

    LinkedHashSet<Paises> conjuntoLinkedHash = new LinkedHashSet<> () ;    // lista de LinkedHash


    public boolean push(Paises PaisPruba ){              //Añade un objeto al LinkedHash
        return conjuntoLinkedHash.add(PaisPruba);
    }

    public boolean pop(Paises PaisPruba) {                      // Remueve un objeto pedido de la lista LinkedHash
        
        return conjuntoLinkedHash.remove(PaisPruba);
    }

    public int conteo(){                    //Para obtener la cantidad de items en la cola
        return conjuntoLinkedHash.size();
    }

    public Paises primero(){            // Retorna el objeto almacenado en el primer espacio
        ArrayList<Paises> ListaLinkedHash = new ArrayList<>(conjuntoLinkedHash);    //  de lista LinkedHash a arreglo
        return ListaLinkedHash.get(0);    
    }                          

    //---------------------------------------------------------------------------------------------------------------

    @Override 
    public String toString() 
    {
        return conjuntoLinkedHash.toString();
    }
    
}
