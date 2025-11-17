package SistemaPokemon.MiniBatallas;

public class Pokemon {

    // Atributos del Padre ATRIBUTOS BASICOS

    protected String nombre;
    protected String tipo;
    protected String color;
    protected int nivel;
    protected int vida;
    protected int generacion;
    protected int edad;
    protected double altura;
    protected double peso;

    // Atributos del Padre ATRIBUTOS EVOLUTIVOS
    protected boolean puedeEvolucionar;
    protected double nivelEvolucion;
    protected String nombreEvolucion;

    // Atributos del Padre ATRIBUTOS COMBATE

    protected int ataque;
    protected int defensa;
    protected String ataqueEspecial;
    protected String defensaEspecial;
    protected int velocidad;
    protected int experiencia;

    // Constructor VACIO Pokemon desconocido
    
    Pokemon() {
        this.nombre = null;
        this.tipo = null;
        this.color = null;
        this.nivel = 0;
        this.vida = 0;
        this.generacion = 0;
        this.edad = 0;
        this.altura = 0;
        this.peso = 0;

        this.puedeEvolucionar = false;
        this.nivelEvolucion = 0;
        this.nombreEvolucion = null;

        this.ataque = 0;
        this.defensa = 0;
        this.ataqueEspecial = null;
        this.defensaEspecial = null;
        this.velocidad = 0;
        this.experiencia = 0;

    }

    // Constructor cualquier pokemon con caracteristicas completas
    Pokemon(String nombre, String tipo, String color, int nivel, int vida,
            int generacion, int edad, double altura, double peso,
            boolean puedeEvolucionar, double nivelEvolucion, String nombreEvolucion,
            int ataque, int defensa, String ataqueEspecial, String defensaEspecial,
            int velocidad, int experiencia) {

        this.nombre = nombre;
        this.tipo = tipo;
        this.color = color;
        this.nivel = nivel;
        this.vida = vida;
        this.generacion = generacion;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;

        this.puedeEvolucionar = puedeEvolucionar;
        this.nivelEvolucion = nivelEvolucion;
        this.nombreEvolucion = nombreEvolucion;

        this.ataque = ataque;
        this.defensa = defensa;
        this.ataqueEspecial = ataqueEspecial;
        this.defensaEspecial = defensaEspecial;
        this.velocidad = velocidad;
        this.experiencia = experiencia;
    }
    
    // Método sayInfo general para cualquier pokemon

    void sayInfo() {
        System.out.println("Hola, mis características...");
        System.out.println("Mi nombre es: " + nombre);
        System.out.println("Soy tipo: " + tipo);
        System.out.println("Color: " + color);
        System.out.println("Nivel: " + nivel);
        System.out.println("Vida: " + vida + " HP");
        System.out.println("Generación: " + generacion);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Altura: " + altura + " m");
        System.out.println("Peso: " + peso + " kg");

        System.out.println("¿Puedo Evolucionar?");
        if (puedeEvolucionar) {
            System.out.println("Evoluciono a: " + nombreEvolucion);
        } else
            System.out.println("No puedo evolucionar :)");

        System.out.println("--- Estadísticas de Combate ---");
        System.out.println("Ataque: " + ataque);
        System.out.println("Defensa: " + defensa);
        System.out.println("Ataque Especial: " + ataqueEspecial);
        System.out.println("Defensa Especial: " + defensaEspecial);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Experiencia: " + experiencia);
    }


}