/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rc;

import java.util.Date;
/**
 *
 * @author RC_Student_lab
 */
public class Inheritence {

    
    public static void main(String[] args) {
        Person person = new Person("Kopano Leshope", "1248 Mashigo St", "0656549986", "dary@gmail.com");
        Student student = new Student("Keoagile Mafora", "4567 Sebenzisa Drive", "0689776565", "mafora@gmail.com", Student.FRESHMAN);
        Date date = new Date(2024, 8, 8);
        Employee employee = new Employee("Tumisang Phamodi", "8970 Themba St", "0827658899", "phamodi@gmail.com", "PC Lab 901", 40000, date);
        Faculty faculty = new Faculty("Mochidzi Murendeni", "2199 Masedi St", "0712345678", "murendeni@gmail.com", "L.Room 602", 50000, date, "9 AM - 5 PM", "Lecture");
        Staff staff = new Staff("David Letsogo", "6541 Mabalane St", "0824681012", "letsogo@gmail.com", "L.Room 303", 9000, date, "Administrator");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
    
}
