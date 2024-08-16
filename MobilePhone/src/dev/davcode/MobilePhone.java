package dev.davcode;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    // Constructor
    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    // Añadir un nuevo contacto
    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) < 0) {
            myContacts.add(contact);
            return true;
        }
        return false;
    }

    // Actualizar un contacto existente
    public boolean updateContact(Contact oldContact, Contact newContact) {
        int index = findContact(oldContact.getName());
        if (index >= 0) {
            myContacts.set(index, newContact);
            return true;
        }
        return false;
    }

    // Eliminar un contacto
    public boolean removeContact(Contact contact) {
        int index = findContact(contact.getName());
        if (index >= 0) {
            myContacts.remove(index);
            return true;
        }
        return false;
    }

    // Encontrar un contacto por objeto
    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    // Encontrar un contacto por nombre
    private int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    // Consultar un contacto por nombre
    public Contact queryContact(String name) {
        int index = findContact(name);
        if (index >= 0) {
            return myContacts.get(index);
        }
        return null;
    }

    // Imprimir todos los contactos
    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            System.out.println((i + 1) + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }
}