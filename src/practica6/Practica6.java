/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6;

import java.util.Scanner;

/**
 *
 * @author dam08
 */
public class Practica6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        menu();
    }
    
    public static void menu () {
    
        Scanner scan = new Scanner(System.in);
        int opcion = 0;
        
        System.out.println("Bienvenido al Sistema de Gestión de tu cuenta LA KAIXA\n¿Qué deseas hacer?\n");
        System.out.println("1. Crear cliente\n2. Crear cuenta\n3. Ingresar dinero\n4. Retirar dinero\n");
        System.out.print("---> OPCIÓN:_");
        opcion = scan.nextInt();
        
        switch (opcion){
        
            case 1:
                crearCliente();
                break;
            case 2:
                crearCuenta();
                break;
            case 3:
                ingresarDinero();
                break;
            case 4:
                retirarDinero();
                break;
        }
    }
}
