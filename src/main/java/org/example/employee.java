package org.example;
import java.util.Scanner;
public class Employee() {
    private String name;
    private String pps;
    private String gender;
    private String employment;
    private int age;

    public void getUserInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name:");
        this.name = scanner.nextLine();
        int userName = integer.parseInt(name);

        System.out.print("Enter pps:");
        this.pps = scanner.nextLine();

        System.out.print("Enter gender:");
        this.gender = scanner.nextLine();

        System.out.print("Enter employment:");
        this.employment = scanner.nextLine();

        System.out.print("Enter age:");
        this.age = scanner.nextInt();
    }
    public void displayInfo(){
        if (userName >= 3 && userName <= 25) {
            System.out.println("Name: " + name);
        }
        else {
            System.out.print("Invalid Entry. Please choose a name between 3 and 25 characters long.");
        }
        System.out.println("PPS: " + pps);
        if (gender == "Male" | gender == "Female" | gender == "Non-Binary") {
            System.out.println("Gender: " + gender);
        }
        else {
            System.out.print("Invalid Entry. Please choose between Male, Female, or Non-Binary.");
        }
        if (employment == "Full-Time" | employment == "Part-Time" | employment == "Contract") {
            System.out.println("Employment: " + employment);
        }
        else{
            System.out.print("Invalid Entry. Please choose between Full-Time, Part-Time, or Contract");
        }
        if (age > 16 && age < 66) {
            System.out.println("Age: " + age);
        }
        else {
            System.out.print("Error, invalid age.");
        }
    }
}
