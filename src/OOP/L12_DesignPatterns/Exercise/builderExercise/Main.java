package OOP.L12_DesignPatterns.Exercise.builderExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final String CREATE_COMMAND = "CREATE";
    private static final String CONTACT_INFO_COMMAND = "INFO";
    private static final String DELETE_CONTACT_COMMAND = "DELETE";
    private static final String PHONEBOOK_COMMAND = "PHONEBOOK";
    private static final String END_COMMAND = "END";

    public static void main(String[] args) {

       /* Contact yuli = new Contact("Yuli", "12345");
        Contact ivan = new Contact("Ivan", "234567","Softuni");
        Contact poly = new Contact("Poly", "999999","A1", "Agent");*/

       // Contact yuli = new Contact().withCompany("Softuni").withWebsite("www.softuni.bg");


       Contact contact = Contact.builder()
               .email("yuli@abv.bg")
               .name("Yuli")
               .website("www.yuli.bg")
               .build();





    }

    private static List<String> readContactInfo(Scanner input) {
        List<String> contactInfo = new ArrayList<>();

        System.out.print("Name: ");
        contactInfo.add(input.nextLine());

        System.out.print("Number: ");
        contactInfo.add(input.nextLine());

        System.out.print("Company: ");
        contactInfo.add(input.nextLine());

        System.out.print("Title: ");
        contactInfo.add(input.nextLine());

        System.out.print("Email: ");
        contactInfo.add(input.nextLine());

        System.out.print("Website: ");
        contactInfo.add(input.nextLine());

        System.out.print("Birthday: ");
        contactInfo.add(input.nextLine());

        return contactInfo;
    }
}
