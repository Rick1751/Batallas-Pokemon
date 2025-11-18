package SistemaPokemon.MiniBatallas;

public class Pikachu extends PokemonElectrico {

    Pikachu(String nombre, String color, int nivel, int vida, int generacion, int edad, double altura, double peso,
            boolean puedeEvolucionar, double nivelEvolucion, String nombreEvolucion, int ataque, int defensa,
            String ataqueEspecial, String defensaEspecial, int velocidad, int experiencia) {
        super(nombre, color, nivel, vida, generacion, edad, altura, peso, puedeEvolucionar, nivelEvolucion, nombreEvolucion,
                ataque, defensa, ataqueEspecial, defensaEspecial, velocidad, experiencia);

    }

    //Métodos de Pikachu 

    public void moverse(){
        setVelocidad(5);
        System.out.println("Estoy atacando a una velocidad de: "+ getVelocidad());
    }

    public void atacar(){
        setAtaque(4);
        setAtaqueEspecial("Electrobola");
        System.out.println("Ataque: ");
        System.out.println("Fuerza: "+getAtaque());
        System.out.println("Ataque: "+getAtaqueEspecial());

    }


    

}
