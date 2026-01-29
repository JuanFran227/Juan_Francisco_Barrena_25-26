enum raza{
    CAUCASICO,
    AMERINDIO,
    ETIOPE,
    MALAYO,
    MONGOLICO
}


public class Cliente {
    private String nombre;
    private String apellidos;
    private String DNI;
    private raza raza;


    
    public void cliente(){
        
    }


    public void clientecondatos(String nombre, String apellidos, String DNI, raza raza){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.raza = raza;
    }


    public void cambiarnombre(String nuevonombre){
        nombre = nuevonombre;
        System.out.println("Se ha cambiado el nombre del cliente. ");
    }    


    // Getter y Setter de nombre
    public String getnombre(){
        return nombre;
    }
    public void setnombre(String nombre){
        this.nombre = nombre;
    }


    //Getter y Setter de apellidos
    public String getapellidos(){
        return apellidos;
    }
    public void setapellidos(String apellidos){
        this.apellidos = apellidos;
    }


    //Getter y Setter de DNI
    public String getDNI(){
        return DNI;
    }
    public void setDNI(String DNI){
        this.DNI = DNI;
    }

    
    //Getter y Setter de raza
    public raza getraza(){
        return raza;
    }
    public void setraza(raza raza){
        this.raza = raza;
    }
}