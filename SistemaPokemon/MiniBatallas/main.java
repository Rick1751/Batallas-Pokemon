package SistemaPokemon.MiniBatallas;

public class main {

    public static void main(String[] args) {

        //Creacion de un pokemon electrico Pikachu
        PokemonElectrico pikachu = new PokemonElectrico(0, 20, 1, 
        70, 3.5, 0, 0, "Impac Trueno", "Esquivar", 
        2, 0);

        // Llamada al metodo de inicializacion de parámetros
        System.out.println("--------------------------------------------------------------------------------");
        pikachu.sayInfo();
        

    }
}