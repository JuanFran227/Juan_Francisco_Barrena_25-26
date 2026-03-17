public class Guerrero extends Personaje{
    private int fuerza;

    public Guerrero(){

    }

    public Guerrero(String nombre, int nivel, int vida, int velocidad, int fuerza){
        super(nombre, nivel, vida, velocidad);
        this.fuerza = fuerza;
    }
    public int GetFuerza(){
        return fuerza;
    }
    public void SerFuerza(int fuerza){
        this.fuerza = fuerza;
    }

    
    //Sobreescribir atacar
    @Override
    public boolean atacar(Personaje personajeObjetivo){
        
    }


    //Sobreescribir el ToString
    @Override
    public String toString(){
        return "Guerrero: " + "Nombre- " + GetNombre() + "||Nivel- " + GetNivel() + "||Vida- " + GetVida() + "||Velocidad- " + GetVelocidad() + "||Fuerza- " + GetFuerza();
    }
}