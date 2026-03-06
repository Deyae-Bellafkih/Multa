package com.example.multa;

public class Lista {

    private Nodo head;
    private Nodo cursor;

    public Lista() {
        head = null;
        cursor = null;
    }

    public void aggiungi(Multa multa) {

        Nodo nuovo = new Nodo(multa);

        if (head == null) {
            head = nuovo;
            return;
        }

        Nodo temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = nuovo;
    }

    public boolean cerca(String numeroDocumento) {

        Nodo temp = head;

        while (temp != null) {

            if (temp.value.getNumeroDocumento().equals(numeroDocumento)) {
                return true;
            }

            temp = temp.next;
        }

        return false;
    }

    public boolean elimina(String numeroDocumento) {

        if (head == null)
            return false;

        if (head.value.getNumeroDocumento().equals(numeroDocumento)) {
            head = head.next;
            return true;
        }

        Nodo temp = head;

        while (temp.next != null) {

            if (temp.next.value.getNumeroDocumento().equals(numeroDocumento)) {
                temp.next = temp.next.next;
                return true;
            }

            temp = temp.next;
        }

        return false;
    }

    public void resetIteratore() {
        cursor = head;
    }

    public Multa visita() {

        if (cursor == null)
            return null;

        Multa valore = cursor.value;
        cursor = cursor.next;

        return valore;
    }
}