package Entidades;

public class Yate extends BarcoMotor {

    int camarotes;

    public Yate() {

    }

    public Yate(int camarotes, int potencia, int matricula, int eslora, int añoFabricacion) {
        super(potencia, matricula, eslora, añoFabricacion);
        this.camarotes = camarotes;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

//    @Override
//    public int CalcularModulo() {
//        return super.CalcularModulo() + camarotes; 
//    }

    @Override
    public String toString() {
        return super.toString() + camarotes; 
    }

    @Override
    public void crearBarco() {
        super.crearBarco(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Ingrese la cantidad de camarotessss");
        camarotes = read.nextInt();
    }
    
    
   
    
    

}
