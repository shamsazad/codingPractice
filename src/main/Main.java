package main;

public class Main {
    public static void main(String args[]){
        System.out.println("test");
        Main main = new Main();
        main.uniqueCharacterFinder();
    }
    public String uniqueCharacterFinder() {
        ArrayUniqueFinder arrayUniqueFinder = new ArrayUniqueFinder();
        return arrayUniqueFinder.uniqueCharFinder("Shams");
    }
}
