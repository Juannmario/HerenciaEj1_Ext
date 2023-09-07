package Entidades;

public class Velero extends Barco {

    protected int mastiles;

    public Velero() {
        
    }

    public Velero(int mastiles, int matricula, int eslora, int añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public int CalcularModulo() {
        return super.CalcularModulo() + mastiles; 
    }

    @Override
    public void crearBarco() {
        super.crearBarco(); 
        System.out.println("Ingrese la cantidad de mastiles");
        mastiles = read.nextInt();
    }

    @Override
    public String toString() {
        return super.toString()+ mastiles; 
    }
    
     
  
    
}
