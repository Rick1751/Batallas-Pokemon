package SistemaPokemon.MiniBatallas;

public class Pokemon {

    // Atributos del Padre ATRIBUTOS BASICOS

    private String nombre;
    private String tipo;
    private String color;
    private int nivel;
    private int vida;
    private int generacion;
    private int edad;
    private double altura;
    private double peso;

    // Atributos del Padre ATRIBUTOS EVOLUTIVOS
    private boolean puedeEvolucionar;
    private double nivelEvolucion;
    private String nombreEvolucion;

    // Atributos del Padre ATRIBUTOS COMBATE

    private int ataque;
    private int defensa;
    private String ataqueEspecial;
    private String defensaEspecial;
    private int velocidad;
    private int experiencia;

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


//Getters and setters 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getGeneracion() {
        return generacion;
    }

    public void setGeneracion(int generacion) {
        this.generacion = generacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isPuedeEvolucionar() {
        return puedeEvolucionar;
    }

    public void setPuedeEvolucionar(boolean puedeEvolucionar) {
        this.puedeEvolucionar = puedeEvolucionar;
    }

    public double getNivelEvolucion() {
        return nivelEvolucion;
    }

    public void setNivelEvolucion(double nivelEvolucion) {
        this.nivelEvolucion = nivelEvolucion;
    }

    public String getNombreEvolucion() {
        return nombreEvolucion;
    }

    public void setNombreEvolucion(String nombreEvolucion) {
        this.nombreEvolucion = nombreEvolucion;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public String getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public void setAtaqueEspecial(String ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
    }

    public String getDefensaEspecial() {
        return defensaEspecial;
    }

    public void setDefensaEspecial(String defensaEspecial) {
        this.defensaEspecial = defensaEspecial;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

}

