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
                
                System.out.print("---> Introduce el nombre del cliente:_ ");
                String nombreCliente = scan.nextLine();
                System.out.print("---> Introduce los apellidos del cliente:_ ");
                String apellidosCliente = scan.nextLine();
                System.out.print("---> Introduce la edad del cliente:_ ");
                int edadCliente = scan.nextInt();
                System.out.print("---> Introduce la dirección del cliente:_ ");
                String direccionCliente = scan.nextLine();
                System.out.print("---> Introduce el teléfono del cliente:_ ");
                String telefonoCliente = scan.nextLine();
                System.out.print("---> Introduce el código del cliente:_ ");
                int codigoCliente = scan.nextInt();
                
                cliente.crearCliente(nombreCliente, apellidosCliente, edadCliente, direccionCliente, telefonoCliente, codigoCliente);
                break;
                
            case 2:
                
                System.out.print("---> Introduce el nombre de la cuenta:_ ");
                String nombreCuenta = scan.nextLine();
                System.out.print("---> Introduce el saldo de la cuenta:_ ");
                int saldoCuenta = scan.nextInt();
                System.out.print("---> Introduce el código de la cuenta:_ ");
                String codigoCuenta = scan.nextLine();
                System.out.print("---> Introduce el cliente propietario:_ ");
                String clienteCuenta = scan.nextLine();
                
                cuentaBancaria.crearCuenta(nombreCuenta, saldoCuenta, codigoCuenta, clienteCuenta);
                break;
                
            case 3:
                
                int cantidadIngreso = 0;
                
                do {
                    
                    System.out.print("---> Introduce el nombre de la cuenta:_ ");
                    nombreCuenta = scan.nextLine();
                    System.out.print("---> Introduce la cantidad a ingresar:_ ");
                    cantidadIngreso = scan.nextInt();

                    cuentaBancaria.ingresarDinero(nombreCuenta, cantidadIngreso);

                } while (cuentaBancaria.ingresarDinero(nombreCuenta, cantidadIngreso) == false);
                
                break;
                
            case 4:
                
                int cantidadRetirada = 0;
                
                do {
                  
                    System.out.print("---> Introduce el nombre de la cuenta:_ ");
                    nombreCuenta = scan.nextLine();
                    System.out.print("---> Introduce la cantidad a retirar:_ ");
                    cantidadRetirada = scan.nextInt();

                    cuentaBancaria.retirarDinero(nombreCuenta, cantidadRetirada); 
                
                } while (cuentaBancaria.retirarDinero(nombreCuenta, cantidadRetirada) == false);
                
                break;
        }
    }
}
