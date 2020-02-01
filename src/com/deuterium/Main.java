package com.deuterium;

public class Main {
    public static void main(String[] args) {
        Pile p1 = new Pile(3);
        System.out.println("------------------------------------------------------------------");
        System.out.println("Pile vide : " + (p1.pileVide() ? "OUI" : "NON"));
        System.out.println("------------------------------------------------------------------");
        System.out.println("Empilement : ");
        p1.emplier(5);
        System.out.println("Etat de la pile après empilement : ");
        System.out.println("Sommet : " + p1.getSommet());
        p1.listerPile();
        System.out.println("Pile vide : " + (p1.pileVide() ? "OUI" : "NON"));
        System.out.println("------------------------------------------------------------------");
        System.out.println("Empilement : ");
        p1.emplier(10);
        System.out.println("Etat de la pile après empilement : ");
        System.out.println("Sommet : " + p1.getSommet());
        p1.listerPile();
        System.out.println("Pile vide : " + (p1.pileVide() ? "OUI" : "NON"));
        System.out.println("------------------------------------------------------------------");
        System.out.println("Empilement : ");
        p1.emplier(100);
        System.out.println("Etat de la pile après empilement : ");
        System.out.println("Sommet : " + p1.getSommet());
        p1.listerPile();
        System.out.println("Pile vide : " + (p1.pileVide() ? "OUI" : "NON"));
        System.out.println("------------------------------------------------------------------");
        System.out.println("Dépilement : ");
        System.out.println(p1.depiler());
        System.out.print("Etat de la pile après dépilement : ");
        p1.listerPile();
        System.out.println("------------------------------------------------------------------");
        System.out.println("Dépilement : ");
        System.out.println(p1.depiler());
        System.out.print("Etat de la pile après dépilement : ");
        p1.listerPile();
        System.out.println("------------------------------------------------------------------");
        System.out.println("Dépilement : ");
        System.out.println(p1.depiler());
        System.out.print("Etat de la pile après dépilement : ");
        p1.listerPile();
        System.out.println("------------------------------------------------------------------");
        System.out.println("Pile vide : " + (p1.pileVide() ? "OUI" : "NON"));
        System.out.println("------------------------------------------------------------------");
    }
}
