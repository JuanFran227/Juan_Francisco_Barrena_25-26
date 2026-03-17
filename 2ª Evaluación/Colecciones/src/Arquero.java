public class Arquero extends Personaje{
    private int precision;

    public Arquero(){

    }

    public Arquero(String nombre, int nivel, int vida, int velocidad, int precision){
        super(nombre, nivel, vida, velocidad);
        this.precision = precision;
    }
    public int GetPrecision(){
        return precision;
    }
    public void SetPrecision(int precision){
        this.precision = precision;
    }


    //Sobreescribir atacar
    @Override
    public boolean atacar(Personaje personajeObjetivo){
        
    }


    //Sobreescribir el ToString
    @Override
    public String toString(){
        return "Arquero: " + "Nombre- " +  GetNombre()+ "||Nivel- " + GetNivel() + "||Vida" + GetVida() + "||Velocidad- " + GetVelocidad() + "||Precisión- " + GetPrecision();
    }
}