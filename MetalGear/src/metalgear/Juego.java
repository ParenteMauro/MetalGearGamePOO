package metalgear;

import java.util.Scanner;

public class Juego {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        Menu();
        
    }

    public static void Menu() {
        Integer opcion;
        Boolean ejecutar = true;
        System.out.println("----------------------");
        System.out.println("--- Menu Principal ---");
        System.out.println("----------------------");

        do {
            
            System.out.println("-- 1. Iniciar Mision");
            System.out.println("-- 2. Guardar Estado");
            System.out.println("-- 3. Cargar Estado");
            System.out.println("-- 4. Salir del juego");
            
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    ejecutar = false;
                    System.out.println("*Salio del juego*");
                    break;
            }
        } while (ejecutar);

    }

}
