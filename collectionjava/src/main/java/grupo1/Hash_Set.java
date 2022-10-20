package grupo1;

import java.util.*; 
import java.util.HashSet;       //Nota mental, no llamar a la clase de la misma manera q la importanción xddd

public class Hash_Set {

    HashSet<Paises> conjuntoHash = new HashSet<>();      // lista Hash 

    public boolean push(Paises PaisPruba){              //Añade un objeto a la Lista Hash
        return conjuntoHash.add(PaisPruba);
    }

    public boolean pop(Paises PaisPruba) {              //Remueve el objeto pedido
        
        return conjuntoHash.remove(PaisPruba);

    }

    public int conteo(){                    //Para obtener la cantidad de objetos en la cola
        return conjuntoHash.size();
    }

    public Paises primero(){            // Retorna el objeto almacenado en el primer espacio
        ArrayList<Paises> ListaHach = new ArrayList<>(conjuntoHash);    //  de Hash pasa a ser una lista
        return ListaHach.get(0);    
    }                          

    //---------------------------------------------------------------------------------------------------------------

    @Override 
    public String toString() 
    {
        return conjuntoHash.toString();
    }
    
}
