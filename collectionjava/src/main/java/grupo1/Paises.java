package grupo1; 

public class Paises{
    
    private String nombrePais;          // Atributos
    private String capital;
    private int poblacion;

    public Paises(String nombrePais, String capital, int poblacion) {   // Constructor
        this.nombrePais = nombrePais;
        this.capital = capital;
        this.poblacion = poblacion;
    }

    public String getNombrePais() {         // Getter y Setter
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    //--------------------------------------------------------------------------------------------------------

    @Override
    public String toString(){           // Imprimir Los atributos de mis paises
        return "\nNombre del pais: " + this.getNombrePais().toString() + " \nCapital " + this.getCapital() + " \nPoblacion: " + this.getPoblacion() + "\n";
    }

    

}
