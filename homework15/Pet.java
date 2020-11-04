package javacore.homework15;

public class Pet {
    String genus;
    String name;

    Pet(String genus, String name){
        this.name = name;
        this.genus = genus;
    }

    @Override
    public String toString() {
        return "Pet(species: "+ genus + " ,name: " + name +  ")";
    }
}

