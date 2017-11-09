package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean stop = false;
        Pilas pila = new Pilas();

        Scanner sc=new Scanner(System.in);

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
