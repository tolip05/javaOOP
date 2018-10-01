package pet_clinics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        Map<String, Clinic<Room>> clinics = new HashMap<>();
        Map<String, Pet> pets = new HashMap<>();

        while (count-- > 0) {
            String[] tokens = br.readLine().split("\\s+");

            if ("Create".equalsIgnoreCase(tokens[0])) {

                switch (tokens[1]) {
                    case "Pet":
                        Pet pet = new PetImpl(tokens[2], Integer.parseInt(tokens[3]), tokens[4]);
                        pets.putIfAbsent(tokens[2], pet);
                        break;
                    case "Clinic":
                        try {
                            Clinic<Room> clinic = new ClinicImpl<>
                                    (tokens[2], Integer.parseInt(tokens[3]));
                            clinics.putIfAbsent(tokens[2], clinic);
                        } catch (IllegalArgumentException iae) {
                            System.out.println(iae.getMessage());
                        }
                        break;
                }
            } else {
                switch (tokens[0]) {
                    case "Add":
                        addPet(clinics, pets, tokens);
                        break;
                    case "HasEmptyRooms":
                        if (clinics.containsKey(tokens[1])) {
                            System.out.println(clinics.get(tokens[1]).hasEmptyRooms());
                        }
                        break;
                    case "Release":
                        if (clinics.containsKey(tokens[1])) {
                            System.out.println(clinics.get(tokens[1]).releasePet());
                        }
                        break;
                    case "Print":
                        if (clinics.containsKey(tokens[1])) {
                            if (tokens.length == 2) {
                                System.out.println(clinics.get(tokens[1]));
                            } else {
                                System.out.println(clinics.get(tokens[1])
                                        .getRoom(Integer.parseInt(tokens[2])));
                            }
                        }
                        break;

                }
            }
        }
    }

    private static void addPet(Map<String, Clinic<Room>> clinics, Map<String, Pet> pets, String[] tokens) {
        if (pets.containsKey(tokens[1])) {
            if (clinics.containsKey(tokens[2])) {
                Pet pet = pets.get(tokens[1]);
                Clinic<Room> clinic = clinics.get(tokens[2]);
                System.out.println(clinic.addPet(pet));
            }
        } else {
            System.out.println("Invalid operation!");
        }
    }
}
