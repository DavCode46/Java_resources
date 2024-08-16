package dev.davcode;

public class Contact {
    private String name;
    private String phoneNumber;

    // Constructor
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // Getter para el nombre
    public String getName() {
        return name;
    }

    // Getter para el número de teléfono
    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Método estático para crear un Contacto
    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Contact contact = (Contact) obj;
        return name.equals(contact.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}

