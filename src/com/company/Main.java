package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean stop = false;
        Pilas pila = new Pilas();
        int opcion;
        Scanner scanner = new Scanner(System.in);

        do{
            //Muestra el menú al usuario
            System.out.println("1) Insertar\n2) Mostrar\n3) Buscar\n4) Eliminar\n5)" +
                    " Tamaño\n6) Máximo\n7) Mínimo\n8) Terminar\n ¿Cuál es tu opción?");
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

<<<<<<< HEAD
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
                    System.out.println("Vuelve pronto");
                    break;
            }
        }while (opcion!=8 );
=======
        Scanner sc=new Scanner(System.in);
>>>>>>> Susana

        boolean seguir=true;
        while(seguir) {
            pila.Menu();
            String op = sc.next();
            switch (op) {
                case "1":
                case "Insertar":
                case "insertar":
                    System.out.println("Usted eligio la opci�n Insertar" +
                            "�Cuantos valores desea insertar?");
                    int num = sc.nextInt();
                    for (int i=0; i<num; i++){
                        System.out.println("Valor "+(i+1)+": ");
                        int valor=sc.nextInt();
                        pila.push(valor);
                    }
                    break;
                case "2":
                case "Mostrar":
                case "mostrar":
                    System.out.println("Usted eligio la opci�n Mostrar\n");
                        pila.peek();
                    
                    break;
                case "3":
                case "Buscar":
                case "buscar":
                    
                    break;
                case "4":
                case "Eliminar":
                case "eliminar":
                   pila.pop();
                    break;
                case "5":
                case "Contar":
                case "contar":
                    System.out.println("La lista contiene "+pila.Size()+" elementos");
                    break;
                case "6":
                case "Terminar":
                case "terminar":
                    System.out.println("Usted eligio la opci�n Terminar\n\nAdios ...! vuelva pronto XD");
                      seguir=false;
            }
        }


    }
}
