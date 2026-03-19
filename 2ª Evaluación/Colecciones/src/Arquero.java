public class Arquero extends Personaje{
    private int precision;

    public Arquero(){

    }

    public Arquero(String nombre, int nivel, int vida, int velocidad, int precision){
        super(nombre, nivel, vida, velocidad);
        this.precision = precision;
    }
    public int getPrecision(){
        return precision;
    }
    public void setPrecision(int precision){
        this.precision = precision;
    }


    //Sobreescribir atacar
    @Override
    public boolean atacar(Personaje personajeObjetivo){
        int daño = (nivel * (precision / 100));
        return personajeObjetivo.recibirgolpe(daño);
    }

    //Se sobreescribe el propio método recibir golpe porque a los arqueros se les hace el doble de daño
    @Override
    public boolean recibirgolpe(int daño){
        return super.recibirgolpe(daño * 2);
    }

    //Sobreescribir el ToString
    @Override
    public String toString(){
        return "Arquero: " + "Nombre- " +  getNombre()+ "||Nivel- " + getNivel() + "||Vida" + getVida() + "||Velocidad- " + getVelocidad() + "||Precisión- " + getPrecision();
    }
}