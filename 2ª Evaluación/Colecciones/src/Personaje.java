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
    public String GetNombre(){
        return nombre;
    }   
    public void SetNombre(String nombre){
        this.nombre = nombre;
    } 

    public int GetNivel(){
        return nivel;
    }
    public void SetNivel(int nivel){
        this.nivel = nivel;
    }

    public int GetVida(){
        return vida;
    }
    public void SetVida(int vida){
        this.vida = vida;
    }

    public int GetVelocidad(){
        return velocidad;
    }
    public void SetVelocidad(int velocidad){
        this.velocidad = velocidad;
    }


    //Función para atacar, pero implementada en las subclases

    public abstract boolean atacar(Personaje PersonajeAtacado){
        
    }

    //Recibir golpes(daño)
    public boolean recibegolpe(int daño){
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