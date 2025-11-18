package SistemaPokemon.MiniBatallas;

public class PokemonElectrico extends Pokemon {

    PokemonElectrico(String nombre, String color, int nivel, int vida,
            int generacion, int edad, double altura, double peso,
            boolean puedeEvolucionar, double nivelEvolucion, String nombreEvolucion,
            int ataque, int defensa, String ataqueEspecial, String defensaEspecial,
            int velocidad, int experiencia) {

        super(nombre, "Electrico", color, nivel, vida, edad, experiencia, altura, peso, puedeEvolucionar, nivelEvolucion,
                nombreEvolucion, ataque, defensa, ataqueEspecial, defensaEspecial, velocidad, experiencia);

    }



    

}
