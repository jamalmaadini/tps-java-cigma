package exercices;

import java.util.Scanner;

public class Algo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" entrer un nombre");
        int n= scanner.nextInt();
        int fact =1;
        for (int i = n;i>=1;i--){
             fact = fact * i;

        }
        System.out.println("la factorielle de " +n+" est : " + fact);

    }
}
