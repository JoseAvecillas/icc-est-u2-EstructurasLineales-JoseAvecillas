package controllers;

import java.util.EmptyStackException;
import models.NodeGeneric;

public class QueueG<T> {

    private NodeGeneric<T> primero;
    private NodeGeneric<T> ultimo;
    private int size;

    public QueueG() {
        this.primero = null;
        this.ultimo = null;
        this.size = 0;
    }

    public void add(T value) {
        NodeGeneric<T> newNode = new NodeGeneric<>(value);
        if (isEmpty()) {
            primero = newNode;
            ultimo = newNode;
        } else {
            ultimo.setNext(newNode);
            ultimo = newNode;
        }
        size++;
    }

    public T remove() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T aux = primero.getValue();
        primero = primero.getNext();
        size--;
        return aux;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return primero.getValue();
    }

    public boolean isEmpty() {
        return primero == null;
    }

    public int size() {
        return size;
    }

    public void printCola() {
        NodeGeneric<T> aux = primero;
        while (aux != null) {
            System.out.print(aux.getValue() + " | ");
            aux = aux.getNext();
        }
        System.out.println();
    }

    public T findByName(String name) {
        NodeGeneric<T> aux = primero;
        while (aux != null) {
            if (aux.getValue() instanceof models.Persona) {
                models.Persona p = (models.Persona) aux.getValue();
                if (p.getNombre().equalsIgnoreCase(name)) {
                    return aux.getValue();
                }
            }
            aux = aux.getNext();
        }
        return null;
    }

    public T deleteByName(String name) {
        NodeGeneric<T> aux = primero;
        NodeGeneric<T> prev = null;

        while (aux != null) {
            if (aux.getValue() instanceof models.Persona) {
                models.Persona p = (models.Persona) aux.getValue();
                if (p.getNombre().equalsIgnoreCase(name)) {
                    if (prev == null) {
                        primero = aux.getNext();
                    } else {
                        prev.setNext(aux.getNext());
                    }
                    if (aux == ultimo) {
                        ultimo = prev;
                    }
                    size--;
                    return aux.getValue();
                }
            }
            prev = aux;
            aux = aux.getNext();
        }
        return null;
    }
    
}