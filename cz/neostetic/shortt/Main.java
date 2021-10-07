package cz.neostetic.shortt;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Zadejte vysku v cm: ");
        int size = sc.nextInt();

        System.out.print("Vase vyska: ");
        if (size < 150) {
            System.out.println("Trpaslik");
        } else if (size < 175) {
            System.out.println("Beznej typ");
        } else {
            System.out.println("Vysoky");
        }

    }

}
