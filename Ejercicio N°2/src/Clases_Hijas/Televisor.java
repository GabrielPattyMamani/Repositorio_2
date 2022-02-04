/*
Se debe crear también una subclase llamada Televisor con los siguientes
atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además de los
atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
aumentará $500. Recuerda que las condiciones que hemos visto en la clase
Electrodomestico también deben afectar al precio.
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios
para mostrar el precio final de los dos electrodomésticos.
 */
package Clases_Hijas;

import Clase_Padre.Electrodomestico;
import java.util.Scanner;

public class Televisor extends Electrodomestico {

    private int pulgadas;
    private boolean TDT;

    public Televisor(int pulgadas, boolean TDT, int precio, String color, String consumo, int peso) {
        super(precio, color, consumo, peso);
        this.pulgadas = pulgadas;
        this.TDT = TDT;
    }

    public Televisor() {

    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    /*
    • Método crearTelevisor(): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos los atributos del televisor.
     */
    
    public void crearTelevisor(){
        
        System.out.println("--------CREADOR DE TELEVISOR--------\n");
        
        Scanner leer = new Scanner(System.in);
        super.crearElectrodomestico();
        
        System.out.println("Ingrese cuantas pulgadas tiene su televisor");
        this.pulgadas = leer.nextInt();
        System.out.println("¿Su televisor tiene sintonizador?, escriba si o no");
        String respuesta = leer.next();
        
        if(respuesta.equals("si")){
            this.TDT=true;
        }else if(respuesta.equals("no")){
            this.TDT=false;
        }
        
    }
    
 /*
    • Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
aumentará $500. Recuerda que las condiciones que hemos visto en la clase
Electrodomestico también deben afectar al precio.
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios
para mostrar el precio final de los dos electrodomésticos.
     */
    @Override
    public void precioFinal(){
        
        super.precioFinal();
        
        if(this.pulgadas>40){
            this.precio = ((30*this.precio)/100)+this.precio;
        }
        if(this.TDT==true){
            this.precio = this.precio + 500;
        }
        
        System.out.println("El precio final de su televisor "+this.color+" es: "+this.precio+"$ con un consumo de "+this.consumo);
        
    }
    
}
