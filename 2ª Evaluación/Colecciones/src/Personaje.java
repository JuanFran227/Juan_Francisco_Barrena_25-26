public abstract class Personaje {
    protected String nombre;
    protected int nivel;
    protected int vida;
    protected int velocidad;


    //Sus respectivos constructores
    public Personaje(){

    }

    public Personaje(String nombre, int nivel, int vida, int velocidad){
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida;
        this.velocidad = velocidad;
    }

    //Métodos Getters Y Setters
    public String getNombre(){
        return nombre;
    }   
    public void setNombre(String nombre){
        this.nombre = nombre;
    } 

    public int getNivel(){
        return nivel;
    }
    public void setNivel(int nivel){
        this.nivel = nivel;
    }

    public int getVida(){
        return vida;
    }
    public void setVida(int vida){
        this.vida = vida;
    }

    public int getVelocidad(){
        return velocidad;
    }
    public void setVelocidad(int velocidad){
        this.velocidad = velocidad;
    }


    //Función ABSTRACTA para atacar, pero implementada en las subclases

    public abstract boolean atacar(Personaje personajeAtacado);

    //Recibir golpes(daño)
    public boolean recibirgolpe(int daño){
        vida -= daño;

        if (vida <= 0) {
            return true;
        }
        return false;
    }


    //Mostrar los datos del personaje
    @Override
    public String toString(){
        return "Nombre: " + nombre + "||Nivel: " + nivel + "||Vida: " + vida + "||Velocidad: " + velocidad;
    }
}