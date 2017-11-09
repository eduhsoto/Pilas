package com.company;

public class Pilas {
    private Nodo top;

    public Pilas(){
        top = null;
    }

    public boolean vacia(){
        return (top == null);
    }

    public void push(int value){
       Nodo nuevoNodo;

       if (vacia()){
           top = new Nodo(value);
       }else{
           nuevoNodo = new Nodo(value);
           nuevoNodo.setProx(top);
           top = nuevoNodo;
       }
    }

    public void peek(){
        Nodo temp = top;
        if (temp !=null){
            System.out.println("La pila es:");
            while (temp!=null){
                System.out.println(temp.getValor());
                temp = temp.getProx();
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

    public void searchValue(int valor) {
        Nodo temp = top;

        if (!vacia()) {
            while (temp.getValor() != valor) {
                temp = temp.getProx();
            }
            System.out.println("El valor es " + valor);
        } else {
            System.out.println("Pila vacía");
        }
    }


    public void pop(){
        if (!vacia()){
            System.out.println("Datos extraido: " + top.getValor());
            top = top.getProx();
        }else{
            System.out.println("La pila esta vacía");
        }
    }


}
