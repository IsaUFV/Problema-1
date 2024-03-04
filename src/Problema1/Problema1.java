/*Programa que pide cargar una fecha cualquiera, y verifica si corresponde a Navidad.
 */
package Problema1;

import java.util.Scanner;

/**
 *
 * @author misab
 */
public class Problema1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double día,mes,año;
        System.out.print("Ingrese valor para día:");
        día = teclado.nextDouble();
        System.out.print("Ingrese valor para mes:");
        mes = teclado.nextDouble ();
        System.out.print("Ingrese valor para año:");
        año = teclado.nextDouble();
        if (día == 25 && mes == 12){
            System.out.print("La fecha ingresada es Navidad");
           }
    }
}
