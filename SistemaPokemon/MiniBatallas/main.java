package SistemaPokemon.MiniBatallas;

public class main {

    public static void main(String[] args) {

        //Creacion de un pokemon electrico Pikachu
        Pikachu pikachu = new Pikachu("Pikachu", "Amarillo",
         0, 30, 1, 1, 70, 22, true,
        0, "Raichu",
        5, 3, "Impact Trueno", null, 
        2, 0);

        //Creacion de un pokemon electrico magnemite
        magnemite magnemite = new magnemite("Magnemite", "Gris", 
        0, 25, 1, 1, 6.0, 22, true, 30.0, "Magneton",
        10, 4, "Rayo", "Supersónico",
        45, 0);
    

        // Llamada al metodo de inicializacion de parámetros
        System.out.println("--------------------------------------------------------------------------------");

        pikachu.sayInfo();
        pikachu.atacar();
        pikachu.moverse();
        
        //magnemite.sayInfo();
        magnemite.sayInfo();
        magnemite.atacar();
        magnemite.moverse();
        
       

    }
}