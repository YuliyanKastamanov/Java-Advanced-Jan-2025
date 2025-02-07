package pr08_PetClinics;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Pet> pets = new LinkedHashMap<>();
        Map<String, Clinic> clinics = new LinkedHashMap<>();

        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lines; i++) {
            String line = scanner.nextLine();
            String[] parameters = line.split(" ");
            switch (parameters[0]) {
                case "Create":
                    if (parameters[1].equals("Pet")) {
                        Pet pet = new Pet(parameters[2], Integer.parseInt(parameters[3]), parameters[4]);
                        pets.put(pet.getName(),pet);
                    } else if (parameters[1].equals("Clinic")) {
                        try {
                            Clinic clinic = new Clinic(Integer.parseInt(parameters[3]));
                            clinics.put(parameters[2], clinic);
                        } catch (IllegalArgumentException ex) {
                            System.out.println("Invalid Operation!");
                        }
                    }
                    break;
                case "Add":{
                    Pet pet = pets.get(parameters[1]);
                    Clinic clinic = clinics.get(parameters[2]);
                    System.out.println(clinic.add(pet));
                    break;
                }
                case "Release":{
                    Clinic clinic = clinics.get(parameters[1]);
                    System.out.println(clinic.release());
                    break;
                }
                case "HasEmptyRooms":{
                    Clinic clinic = clinics.get(parameters[1]);
                    System.out.println(clinic.hasEmptyRooms());
                    break;
                }
                case "Print":{
                    Clinic clinic = clinics.get(parameters[1]);
                    if (parameters.length == 2) {
                        System.out.println(clinic.print());
                    } else if (parameters.length == 3) {
                        System.out.println(clinic.print(Integer.parseInt(parameters[2])));
                    }
                    break;
                }
            }
        }

    }
}
