package com.workshop.tij.holding;

import com.workshop.tij.typeinfo.pets.Cat;
import com.workshop.tij.typeinfo.pets.Dog;
import com.workshop.tij.typeinfo.pets.Hamster;
import com.workshop.tij.typeinfo.pets.Pet;

import java.util.HashMap;
import java.util.Map;

import static com.workshop.tij.util.Print.print;

public class PetMap {
    public static void main(String[] args) {
        Map<String, Pet> petMap = new HashMap<String, Pet>();
        petMap.put("My Cat", new Cat("Molly"));
        petMap.put("My Dog", new Dog("Ginger"));
        petMap.put("My Hamster", new Hamster("Bosco"));
        print(petMap);
        Pet dog = petMap.get("My Dog");
        print(dog);
        print(petMap.containsKey("My Dog"));
        print(petMap.containsValue(dog));
    }
}