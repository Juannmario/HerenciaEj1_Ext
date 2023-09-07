package Entidades;

import java.util.Scanner;

public class Barco {

    protected int matricula;
    protected int eslora;
    protected int añoFabricacion;
    
    public Barco() {
    }

    public Barco(int matricula, int eslora, int añoFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.añoFabricacion = añoFabricacion;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public int CalcularModulo() {
        return eslora * 10;
      
    }
    
     Scanner read = new Scanner(System.in);
//    protected int matricula;
//    protected int eslora;
//    protected int añoFabricacion;
    public void crearBarco() {
        
        System.out.println("Ingrese la matricula del barco (solo numeros)");
        matricula = read.nextInt();
        System.out.println("Ingrese los metros de eslora");
        eslora = read.nextInt();
        System.out.println("Ingrese el año de fabricacion");
        añoFabricacion = read.nextInt();
        
    }
    
    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", anio Fabricacion=" + añoFabricacion  + '}';
    }
    
}
