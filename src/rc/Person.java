/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rc;

/**
 *
 * @author RC_Student_lab
 */
public class Person {
   String name;
   String address;
   String phoneNumber;
   String emailAddress;

    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

   @Override
    public String toString() {
        return "Class: " + this.getClass().getSimpleName() + ", Name: " + this.name;
    }
   
}





