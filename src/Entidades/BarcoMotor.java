package Entidades;

public class BarcoMotor extends Barco {

    protected int potencia;

    public BarcoMotor() {
    }

    public BarcoMotor(int potencia, int matricula, int eslora, int añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

//    @Override
//    public int CalcularModulo() {
//        return super.CalcularModulo()+potencia; 
//    }

    @Override
    public void crearBarco() {
        super.crearBarco() ; 
        System.out.println("Ingrese la potencia CV");
        potencia = read.nextInt();
    }

    @Override
    public String toString() {
        return super.toString()+potencia; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    

}
