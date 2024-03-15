/*
 * 
 */
package javaejercicio14;

import java.util.Scanner;

public class JavaEjercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        double VD1;
        double VD2;
        double VD3;
        double SALAR;
        double TOTVEN;
        double PORVEN;
        double SALAR1;
        double SALAR2;
        double SALAR3;

        // Entrada de datos
        System.out.println("Ingrese las ventas del departamento 1:");
        VD1 = scanner.nextDouble();

        System.out.println("Ingrese las ventas del departamento 2:");
        VD2 = scanner.nextDouble();

        System.out.println("Ingrese las ventas del departamento 3:");
        VD3 = scanner.nextDouble();

        System.out.println("Ingrese el salario de los vendedores:");
        SALAR = scanner.nextDouble();

        // Cálculo de ventas totales y porcentaje de ventas
        TOTVEN = VD1 + VD2 + VD3;
        PORVEN = 0.33 * TOTVEN;

        // Cálculo del salario de cada departamento
        if (VD1 >  PORVEN){
            SALAR1 = SALAR + 0.2 * SALAR;
        }else{
            SALAR1 = SALAR;
        }
        if (VD2 > PORVEN){
            SALAR2 = SALAR + 0.2 * SALAR;
            
        }else{
            SALAR2 = SALAR;
        }
        if (VD3 > PORVEN){
            SALAR3 = SALAR + 0.2 * SALAR;
        }else{
            SALAR3 = SALAR;
        }
        // Mostrar resultados
        System.out.println("\nSALARIO VENDEDORES DEPTO. 1: $" + SALAR1);
        System.out.println("SALARIO VENDEDORES DEPTO. 2: $" + SALAR2);
        System.out.println("SALARIO VENDEDORES DEPTO. 3: $" + SALAR3);
    }
    
}
