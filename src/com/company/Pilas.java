package com.company;
public class Pilas {
    //Declaramos la variable top, será el inicio de la pila.
    private Nodo top;
    private int size;

    public Pilas(){
        top = null;
        size = 0;
    }

    //Método que devuelve nulo == la vista esta vacía.
    public boolean vacia(){
        return (top == null);
    }

<<<<<<< HEAD

=======
    //Método para agregar un nuevo elemento a la lista
>>>>>>> comment
    public void push(int value){
       Nodo nuevoNodo;

       if (vacia()){//Si la lista esta vacía, agregamos el valor a la cima
           top = new Nodo(value);
       }else{
<<<<<<< HEAD
           nuevoNodo = new Nodo(value);
           nuevoNodo.setProx(top);//El nuevo valor pasa a ser la cima
=======
           nuevoNodo = new Nodo(value);//El nuevo valor pasa a ser la cima
           nuevoNodo.setProx(top);
>>>>>>> comment
           top = nuevoNodo;
       }
	size++;
    }
<<<<<<< HEAD

=======
>>>>>>> comment
    public int Size(){//Devolvemos el tamaño de la lista
            return size;
    }

    //Método para buscar un valor
    public void peek(){
        int contador=0;//Variable para determinar la posición
<<<<<<< HEAD
=======

>>>>>>> comment
        Nodo temp = top;
        if (temp !=null){//Si no esta vacía
            while (temp!=null){//Recorremos
                System.out.println("Valor: " + temp.getValor() + " Posición:" + contador);
                temp = temp.getProx();
                contador++;

            }
        }else {
            System.out.println("Pila vacía");
        }
    }

    public void cima(){//Buscar
        if (!vacia()){
            System.out.println("Cima: " + top.getValor());
        }else {
            System.out.println("La pila esta vacía");
        }
    }

    //Método buscar por valor
    public void searchValue(int valor) {
        int contador=0;
        Nodo temp = top;

        if (!vacia()) {
            while (temp.getValor() != valor) {
                temp = temp.getProx();
                contador++;
            }

            System.out.println("El valor fue encontrado " + valor + " ubicabo en la posición " + contador);

            System.out.println("El valor " + valor + " fue encontrado y está ubicabo en la posición " + contador);

        } else {
            System.out.println("Pila vacía");
        }
    }

    //Método buscar por índice
    public void searchIndex(int index) {
        int contador = 0;
        Nodo temp = top;
        if (!vacia()) {
            while (contador < index) {
                temp = temp.getProx();
                contador++;
            }
            System.out.println("En la posición  " + contador + " se encuentra el valor  " + temp.getValor() + "\n");
        }
        else{
            System.out.println("La pila esta vacia");
        }
    }

    //Método para eliminar el primmer valor
    public void pop(){
        if (!vacia()){
            System.out.println("Datos extraido: " + top.getValor());
            top = top.getProx();
        }else{
            System.out.println("La pila esta vacía");
        }
	size--;
    }

    //Método para determinarl el menor de la pila
    public int menor(){
        int pila[]=new int[Size()];
        Nodo temp=top;
        while (temp!=null){
            for (int i=0; i<Size(); i++){
                pila[i]=temp.getValor();
                temp=temp.getProx();
            }
        }
        int [] ordenado= BurbujaMejorada(pila);
        return ordenado[0];
    }

    //Método para determinarl el mayor de la pila
    public int mayor(){
        int pila[]=new int[Size()];
        Nodo temp=top;
        while (temp!=null){
            for (int i=0; i<Size(); i++){
                pila[i]=temp.getValor();
                temp=temp.getProx();
            }

            //System.out.println(Arrays.toString(pila));
        }
        int[]ordenado=BurbujaMejorada(pila);
        return ordenado[Size()-1];
    }

    public static int[] BurbujaMejorada(int[] pila) {
        int buffer;
        int i,j;
        for(i = 0; i < pila.length; i++)
        {
            for(j = 0; j < i; j++)
            {
                if(pila[i] < pila[j])
                {
                    buffer = pila[j];
                    pila[j] = pila[i];
                    pila[i] = buffer;
                }
            }
        }
        return pila;

    }


}
