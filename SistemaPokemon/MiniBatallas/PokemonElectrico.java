package SistemaPokemon.MiniBatallas;

public class PokemonElectrico extends Pokemon {

    PokemonElectrico(int nivel, int vida,
             int edad, int altura, double peso, int ataque,
            int defensa, String ataqueEspecial,
            String defensaEspecial, int velocidad, int experiencia) {

        super("Pikachu", "Electrico", "Amarillo", nivel, vida,
                1, edad, altura, peso, true, nivel,
                "Raichu", ataque, defensa, ataqueEspecial,
                defensaEspecial, velocidad, experiencia);
    }

}
