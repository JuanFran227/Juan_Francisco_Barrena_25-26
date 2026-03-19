public class Guerrero extends Personaje{
    private int fuerza;

    public Guerrero(){

    }

    public Guerrero(String nombre, int nivel, int vida, int velocidad, int fuerza){
        super(nombre, nivel, vida, velocidad);
        this.fuerza = fuerza;
    }
    public int getFuerza(){
        return fuerza;
    }
    public void setFuerza(int fuerza){
        this.fuerza = fuerza;
    }

    
    //Sobreescribir atacar
    @Override
    public boolean atacar(Personaje personajeObjetivo){
        int daño = (nivel * fuerza) / vida;
        return personajeObjetivo.recibirgolpe(daño);
    }


    //Sobreescribir el ToString
    @Override
    public String toString(){
        return "Guerrero: " + "Nombre- " + getNombre() + "||Nivel- " + getNivel() + "||Vida- " + getVida() + "||Velocidad- " + getVelocidad() + "||Fuerza- " + getFuerza();
    }
}