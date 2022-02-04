/*
A continuación se debe crear una subclase llamada Lavadora, con el atributo
carga, además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de atributos heredados. Recuerda que
debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set del atributo carga.
• Método crearLavadora (): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos el atributo propio de la lavadora.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500,
si la carga es menor o igual, no se incrementará el precio. Este método debe
llamar al método padre y añadir el código necesario. Recuerda que las
condiciones que hemos visto en la clase Electrodoméstico también deben
afectar al precio.
 */
package Clases_Hijas;

import Clase_Padre.Electrodomestico;
import java.util.Scanner;

public class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora(int carga, int precio, String color, String consumo, int peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public Lavadora() {

    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    /*
    • Método crearLavadora (): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos el atributo propio de la lavadora.
     */
    
    public void crearLavadora(){
        
        System.out.println("--------CREADOR DE LAVARROPA--------\n");
        
        Scanner leer = new Scanner(System.in);
        super.crearElectrodomestico();
        System.out.println("Ingrese la carga");
        this.carga = leer.nextInt();
        
    }
    
    
 /*
    • Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500,
si la carga es menor o igual, no se incrementará el precio. Este método debe
llamar al método padre y añadir el código necesario. Recuerda que las
condiciones que hemos visto en la clase Electrodoméstico también deben
afectar al precio.
     */
    
    
    
    @Override
    public void precioFinal(){
        
        super.precioFinal();
        
        if(this.carga>30){
            this.precio = this.precio + 500;
        }
        
        System.out.println("El precio final de su lavarropas "+this.color+" es: "+this.precio+"$ con un consumo de "+this.consumo);
    }
    
}
