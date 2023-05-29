package chapterThree;

import java.util.Scanner;

public class Petrol {
    public static void main(String[] args) {
        PetrolPurchase petrol = new PetrolPurchase("Lekki","Regular",500,215,5);
        System.out.println(petrol.getPrice());

    }
}
