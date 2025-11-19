package SistemaPokemon.MiniBatallas;

public class magnemite extends PokemonElectrico {

    magnemite(String nombre, String color, int nivel, int vida, int generacion, int edad, double altura, double peso,
            boolean puedeEvolucionar, double nivelEvolucion, String nombreEvolucion, int ataque, int defensa,
            String ataqueEspecial, String defensaEspecial, int velocidad, int experiencia) {

        super(nombre, color, nivel, vida, generacion, edad, altura, peso, puedeEvolucionar, nivelEvolucion, nombreEvolucion,
                ataque, defensa, ataqueEspecial, defensaEspecial, velocidad, experiencia);
        
    }

     public void moverse(){
        setVelocidad(2);
        System.out.println("Estoy atacando a una velocidad de: "+ getVelocidad());
    }

    public void atacar(){
        setAtaque(11);
        setAtaqueEspecial("Electro rayo");
        System.out.println("Ataque: ");
        System.out.println("Fuerza: "+getAtaque());
        System.out.println("Ataque: "+getAtaqueEspecial());

    }
    
}
