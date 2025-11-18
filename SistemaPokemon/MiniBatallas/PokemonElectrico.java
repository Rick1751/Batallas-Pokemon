package SistemaPokemon.MiniBatallas;

public class PokemonElectrico extends Pokemon {

    PokemonElectrico(int Id, int nivel, int vida,
             int edad, int altura, double peso, int ataque,
            int defensa, String ataqueEspecial,
            String defensaEspecial, int velocidad, int experiencia) {

        super(1,"Pikachu", "Electrico", "Amarillo", nivel, vida,
                1, edad, altura, peso, true, nivel,
                "Raichu", ataque, defensa, ataqueEspecial,
                defensaEspecial, velocidad, experiencia);
    }

    
    PokemonElectrico(int Id_,int nivel, int vida,
             int edad, int altura, double peso, int ataque,
            int defensa, String ataqueEspecial,
            String defensaEspecial, int velocidad, int experiencia) {

        super(2,"Pikachu", "Electrico", "Amarillo", nivel, vida,
                1, edad, altura, peso, true, nivel,
                "Raichu", ataque, defensa, ataqueEspecial,
                defensaEspecial, velocidad, experiencia);
    }

}
