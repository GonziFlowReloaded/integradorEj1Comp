package grupo1;

import java.util.*; 

public class Tree_Set {

    TreeSet<String> conjuntoTree = new TreeSet<> () ;    // lista de Tree


    public void push(Paises PaisPruba ){              //Añade un objeto al Tree
        conjuntoTree.add(PaisPruba.getNombrePais() );
    }

    public boolean pop(Paises PaisPruba) {                      // Remueve el nombre del objeto pedido
        
        return conjuntoTree.remove(PaisPruba.getNombrePais() );
    }

    public int conteo(){                    //Para obtener la cantidad de items en el Tree
        return conjuntoTree.size();
    }

    public String primero(){            // Retorna el objeto almacenado en el primer espacio
        ArrayList<String> ListaTree = new ArrayList<>(conjuntoTree );    //  de Tree pasa a ser una lista
        return ListaTree.get(0);    
    }                          

    //---------------------------------------------------------------------------------------------------------------

    @Override 
    public String toString() 
    {
        return conjuntoTree.toString();
    }
    
    
}
