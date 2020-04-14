package fr.abp.cours;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int premiere;
        int deuxieme;
        int laPlusGrande;
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("Entrer une première valeur:");
        premiere = lectureClavier.nextInt();
        System.out.println("Entrer une deuxième valeur:");
        deuxieme = lectureClavier.nextInt();

        if (premiere > deuxieme) {
            System.out.println(premiere + " " + deuxieme);
            laPlusGrande = premiere;
        } else {
            System.out.println(premiere + " " + deuxieme);
            laPlusGrande = deuxieme;
        }
        System.out.println("la plus grande valeur est :" + laPlusGrande);

    }
}

