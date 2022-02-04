/*
Crear una superclase llamada Electrodoméstico con los siguientes atributos:
precio, color, consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra
es correcta, sino es correcta usara la letra F por defecto. Este método se debe
invocar al crear el objeto y no será visible.
 */
package Clase_Padre;

import java.util.Scanner;

public class Electrodomestico {

    protected int precio;
    protected String color;
    protected String consumo;
    protected int peso;

//    String[] listaDeConsumos = {"A", "B", "C", "D", "E", "F"};
//    int i = 0;
//
//    String[] listaDeColores = {"blanco", "negro", "rojo", "azul", "gris"};

    public Electrodomestico(int precio, String color, String consumo, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public Electrodomestico() {
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }


    /*
Método comprobarConsumoEnergetico(char letra): comprueba que la letra
es correcta, sino es correcta usara la letra F por defecto. Este método se debe
invocar al crear el objeto y no será visible.
     */
    public void comprobarConsumoEnergetico(String letra) {

//        for (String aux : listaDeConsumos) {
//
//            if (letra.equals(aux)) {
//                System.out.println("Consumo " + letra + " seleccionado\n");
//                this.consumo = letra;
//
//            } else {
//                i++;
//            }
//        }
//
//        //cosa.length()<--- esto devuelve el tamaño(en numeros) de una frase o cadena de caracteres
//        //cosa.length<--- esto devuelve el numero de elementos que contiene un array o una lista
//        if (i == listaDeConsumos.length) {
//            System.out.println("Consumo F como PRETERMINADO");
//            this.consumo = "F";
//            i = 0;
//        }
//        i = 0;

        //OTRA FORMA DE RESOLVER ESTO
        switch (letra) {

            case "A":
                System.out.println("Consumo " + letra + " seleccionado\n");
                
                break;
                
            case "B":
                System.out.println("Consumo " + letra + " seleccionado\n");
                
                break;
                
            case "C":
                System.out.println("Consumo " + letra + " seleccionado\n");
                
                break;
                
            case "D":
                System.out.println("Consumo " + letra + " seleccionado\n");
                break;
                
            case "E":
                System.out.println("Consumo " + letra + " seleccionado\n");
                break;
                
            case "F":
                System.out.println("Consumo " + letra + " seleccionado\n");
                break;

            default:
                System.out.println("Consumo F como PRETERMINADO");
                this.consumo = "F";

        }
        
        
    }

    /*
    Método comprobarColor(String color): comprueba que el color es correcto, y
si no lo es, usa el color blanco por defecto. Los colores disponibles para los
electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
está en mayúsculas o en minúsculas. Este método se invocará al crear el
objeto y no será visible.
     */
    public void comprobarColor(String color) {
        
//        for (String aux : listaDeColores) {
//
//            if (color.equals(aux)) {
//                System.out.println(color + " seleccionado\n");
//                this.color = color;
//
//            } else {
//                i++;
//            }
//        }
//
//        if (i == listaDeColores.length) {
//            System.out.println("Se agrego el color blanco como PRETERMINADO");
//            this.color = "blanco";
//            i = 0;
//        }
//        i = 0;

        //OTRA FORMA DE RESOLVER ESTO
        switch (color) {

            case "blanco":
                System.out.println(color + " seleccionado\n");
                break;
                
            case "rojo":
                System.out.println(color + " seleccionado\n");
                break;
            case "negro":
                System.out.println(color + " seleccionado\n");
                break;
            case "azul":
                System.out.println(color + " seleccionado\n");
                break;
            case "gris":
                System.out.println(color + " seleccionado\n");
                break;

            default:
                System.out.println("Se agrego el color blanco como PRETERMINADO");
                this.color = "blanco";

        }

    }

    /*
    Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el
consumo. Al precio se le da un valor base de $1000.
     */
    public void crearElectrodomestico() {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el consumo energetico entre A y F");
        this.consumo = leer.next();
        this.consumo = this.consumo.toUpperCase();

        comprobarConsumoEnergetico(consumo);

        System.out.println("Ingrese un color registrado (blanco, negro, rojo, azul y gris)");
        this.color = leer.next();
        this.color = this.color.toLowerCase();

        comprobarColor(color);

        System.out.println("Ingrese el peso de su electrodomestico");
        this.peso = leer.nextInt();

        this.precio = 1000;

    }

    /*
    Método precioFinal(): según el consumo energético y su tamaño, aumentará
el valor del precio. Esta es la lista de precios:
    
LETRA PRECIO
A $1000
B $800
C $600
D $500
E $300
F $100

PESO PRECIO
Entre 1 y 19 kg $100
Entre 20 y 49 kg $500
Entre 50 y 79 kg $800
Mayor que 80 kg $1000
    
     */
    public void precioFinal() {

        switch (consumo) {
            case "A":

                this.precio = this.precio + 1000;

                break;
            case "B":

                this.precio = this.precio + 800;

                break;
            case "C":

                this.precio = this.precio + 600;

                break;
            case "D":

                this.precio = this.precio + 500;

                break;
            case "E":

                this.precio = this.precio + 300;

                break;
            case "F":

                this.precio = this.precio + 100;

                break;
        }

        if (peso >= 1 && peso <= 19) {

            this.precio = this.precio + 100;

        } else if (peso >= 20 && peso <= 49) {

            this.precio = this.precio + 500;

        } else if (peso >= 50 && peso <= 79) {

            this.precio = this.precio + 800;

        } else {

            this.precio = this.precio + 1000;

        }

    }

}