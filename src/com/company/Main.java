package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean stop = true;
        Pilas pila = new Pilas();
        int opcion;
        Scanner scanner = new Scanner(System.in);

        do{
            //Muestra el menú al usuario
            System.out.println("1) Insertar\n2) Mostrar\n3) Buscar\n4) Eliminar\n5)" +
                    " Tamaño\n6) Máximo\n7) Mínimo\n8) Terminar\n Elije una opción");
            //captura la opción del usuario
            opcion=scanner.nextInt();
            switch (opcion){
                case 1:
                    //Solicita el número de elementos que ingresara
                    System.out.println("Teclee la cantidad de elementos de la pila: ");
                    //captura el número que ingreso
                    int num=scanner.nextInt();
                    int obj;
                    //Realiza un ciclo que determine que elemento se ingresará
                    for (int i=1; i<=num; i++){
                        System.out.print("Teclee el elemento["+i+"]");
                        //captura el valor ingresado
                        int valor=scanner.nextInt();
                        /*
                        Dado que el método push requiere de un objeto se convierte el valor ingresado
                         y se llama al mismo método*/
                        obj=valor;
                        pila.push(obj);
                    }
                    break;
                case 2:
                    //Se invoca el método peek
                    pila.peek();
                    break;
                case 3:
                    //Opción que llama al método de búsqueda
                    break;
                case 4:
                    /*
                    Opción que invoca al método que elimina un elemento
                     */
                    break;
                case 5:
                    //Esta opción devuelve el tamaño de la pila
                    break;
                case 6:
                    //Por el contrario, esta opción devuelve el valor máximo de la pila
                    System.out.println("Valor máximo: ");
                    break;
                case 7:
                    //Devuelve el valor mínimo de la pila
                    System.out.println("Valor mínimo: ");
                    break;
                case 8:
                    //Termina el ciclo del menú y por lo tanto finaliza el programa
                    stop = false;
                    System.out.println("Vuelve pronto");
                    break;

                default:
                    System.out.println("Opción incorrecta");
            }
        }while (stop!=false );

    }
}
