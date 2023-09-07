package Entidades;

import java.time.LocalDate;

import java.util.Scanner;

public class Alquiler {

    private String nombreCliente;
    private String documentoCliente;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private int duracionAlquiler;
    private int posAmarre;
    private int precio;
    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombreCliente, String documentoCliente, LocalDate fechaAlquiler, int posAmarre, LocalDate fechaDevolucion, int duracionAlquiler, int precio, Barco barco) {
        this.nombreCliente = nombreCliente;
        this.documentoCliente = documentoCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.duracionAlquiler = duracionAlquiler;
        this.posAmarre = posAmarre;
        this.precio = precio;
        this.barco = barco;
    }

    public int getPosAmarre() {
        return posAmarre;
    }

    public void setPosAmarre(int posAmarre) {
        this.posAmarre = posAmarre;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(String documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public int getDuracionAlquiler() {
        return duracionAlquiler;
    }

    public void setDuracionAlquiler(int duracionAlquiler) {
        this.duracionAlquiler = duracionAlquiler;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void crearAlquiler() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        fechaAlquiler = LocalDate.now();

        int dia, mes, año;
        System.out.println("Ingrese su nombre y apellido: ");
        nombreCliente = read.nextLine();

        System.out.println("Ingrese DNI ");
        documentoCliente = read.next();
        System.out.println("Ingrese la posicion del amarre: ");
        posAmarre = read.nextInt();
        System.out.println("Ingresar fecha de retiro");
        System.out.print("Dia : ");
        dia = read.nextInt();
        System.out.print("Mes : ");
        mes = read.nextInt();
        System.out.print("Año : ");
        año = read.nextInt();

        System.out.println("Que tipo de barco desea? 1=yate 2=barcomotor 3=velero");
        int opc = read.nextInt();
        switch (opc) {
            case 1:
                barco = new Yate();
                break;
            case 2:
                barco = new BarcoMotor();
                break;
            case 3:
                barco = new Velero();
                break;
        }
        barco.crearBarco();
        crearPrecio(barco);
        fechaDevolucion = LocalDate.of(año, mes, dia);
        duracionAlquiler = fechaAlquiler.until(fechaDevolucion).getDays();

    }

    public void crearPrecio(Barco barco) {
      
         precio = duracionAlquiler * barco.CalcularModulo();
      
   }

    @Override
    public String toString() {
        return "Alquiler{" + "nombreCliente=" + nombreCliente + ", documentoCliente=" + documentoCliente + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", duracionAlquiler=" + duracionAlquiler + ", posAmarre=" + posAmarre + ", precio=" + precio + '}';
    }
    
}
