package ProyectosBasicos.MiniBatallas;

public class Llamada {

    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu", "Electrico", "Amarillo",
                1, 20, 1, 1, 55.23, 2.00, true, 0.0, "Raichu",
                5, 3, "ElectroBola",
                "Cola de hierro", 2, 0);


        // Llamada al metodo de inicializacion de parámetros
        System.out.println("--------------------------------------------------------------------------------");
        pikachu.sayInfo();



    }
}