/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.n.pkg2;

import Clases_Hijas.Lavadora;
import Clases_Hijas.Televisor;
import java.util.Scanner;

public class EjercicioN2 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Televisor televisor = new Televisor();
        Lavadora lavadora = new Lavadora();
        
        lavadora.crearLavadora();
        lavadora.precioFinal();
        
        televisor.crearTelevisor();
        televisor.precioFinal();
        
        
    }
    
}
