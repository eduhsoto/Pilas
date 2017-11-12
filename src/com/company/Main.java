package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean stop = true;//SE agrega la variable stop. iniciando en true.
        Pilas pila = new Pilas();
        int opcion;
        Scanner scanner = new Scanner(System.in);

        do{
            //Muestra el menú al usuario
            System.out.println("1) Insertar\n2) Mostrar\n3) Buscar\n4) Eliminar\n5)" +
                    " Tamaño\n6) Máximo\n7) Mínimo\n8) Terminar\nElije una opción");
            //captura la opción del usuario
            opcion=scanner.nextInt();
            switch (opcion){
                case 1:
                    //Solicita el número de elementos que ingresara
                    System.out.println("Teclee la cantidad de elementos de la pila: ");
                    //captura el número que ingreso
                    int num=scanner.nextInt();
                    //int obj; -- No es necesario declarar otra variable
                    //Realiza un ciclo que determine que elemento se ingresará
                    for (int i=1; i<=num; i++){
                        System.out.print("Teclee el elemento["+i+"]");
                        //captura el valor ingresado
                        int valor=scanner.nextInt();
                        /*
                        Dado que el método push requiere de un objeto se convierte el valor ingresado
                         y se llama al mismo método*/
                        //obj=valor; --- Angélica no es necesario hacer esto. No estas conviertiendo nada, solo estas asignando valor a la variable declarada
                        pila.push(valor);
                    }
                    break;
                case 2:
                    //Se invoca el método peek
                    pila.peek();
                    break;
                case 3:
                    //Opción que llama al método de búsqueda\n
                    if (!pila.vacia()) {//Se agrega el método de búsqueda
                        System.out.println("Elija el tipo de búsqueda\n1) Por valor\n2) Por índice");
                        int op = scanner.nextInt();
                        if (op == 1) {
                            System.out.println("Ingrese un valor");
                            int v = scanner.nextInt();
                            pila.searchValue(v);
                        } else if (op == 2) {
                            System.out.println("Ingrese una posición");
                            int p = scanner.nextInt();
                            pila.searchIndex(p);
                        } else {
                            System.out.println("Opción incorrecta");
                        }
                    }
                    else {
                        System.out.println("La lista esta vacía");
                    }
                    break;
                case 4:
                    /*
                    Opción que invoca al método que elimina un elemento
                     */
                    break;
                case 5:
                    //Esta opción devuelve el tamaño de la pila
                    System.out.println("El tamaño de la pila es " + pila.Size());
                    break;
                case 6:
                    //Por el contrario, esta opción devuelve el valor máximo de la pila
                    System.out.println("Valor máximo: " + pila.mayor());
                    break;
                case 7:
                    //Devuelve el valor mínimo de la pila
                    System.out.println("Valor mínimo: " + pila.menor());
                    break;
                case 8:
                    //Termina el ciclo del menú y por lo tanto finaliza el programa
                    stop = false;//Para detener el cilo
                    System.out.println("Vuelve pronto");
                    break;

                default:
                    System.out.println("Opción incorrecta"+ pila.mayor());
            }
        }while (stop!=false );

    }
}
