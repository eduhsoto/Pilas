package com.company;

public class Nodo {
    //Variable para almacenar el valor
    private int valor;
    private Nodo prox;

    //Métoco contructor
    public Nodo(){
        this.valor = 0;
        this.prox = null;
    }
    
    public Nodo(int v){
        this.valor = v;
        this.prox = null;
    }

    //Enviamos el valor
    public void setValor(int v){
        valor = v;
    }

    //Enlazamos al próximo
    public void setProx(Nodo p){
        prox = p;
    }

    //Obtenemos el valor
    public int getValor(){
        return valor;
    }

    public Nodo getProx(){
        return prox;
    }
}
