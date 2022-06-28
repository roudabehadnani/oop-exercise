package org.example;

import java.util.Arrays;

public class Author {

    //Fields
    private String firsName;
    private String lastName;
    private String[] nameOfBooks;

    public Author(String firsName, String lastName, String[] nameOfBooks) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.nameOfBooks = nameOfBooks;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String[] getNameOfBooks() {
        return nameOfBooks;
    }

    public void setNameOfBooks(String[] nameOfBooks) {
        this.nameOfBooks = nameOfBooks;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firsName='" + firsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nameOfBooks=" + Arrays.toString(nameOfBooks) +
                '}';
    }
}
