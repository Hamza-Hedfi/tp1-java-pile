package com.deuterium;

import java.util.Arrays;

/**
 * __________HOMEWORK__________
 * <p>
 * This class is an implementation for the Stack data structure.
 * A Stack of Integer
 * <p>
 * It part of our in class course for OOP, At polytech Monastir
 * <p>
 * Teacher______MOHAMED AMINE Omrani
 *
 * @author Hamza Hadfi
 * @since 01-02-2020
 */
public class Pile {

    // public field representing the size of the array
    private final Integer SIZE;
    // private field to hold the head "top element" of the stack
    private Integer sommet;
    // Private field
    // It is the actual stack, as an array of integers
    private final Integer[] elements;

    public Integer getSIZE() {
        return SIZE;
    }

    public Integer getSommet() {
        return sommet;
    }

    // Private field, to help further for the implementation
    private int index;

    /**
     * Creates a Stack with the specified max size
     *
     * @param max The stack max size
     */
    public Pile(int max) {
        SIZE = max;
        elements = new Integer[SIZE];
        index = -1;
    }

    /**
     * Check if the stack emptiness
     *
     * @return a boolean value to describe if the stack is empty or not
     */
    public Boolean pileVide() {
        return index == -1;
    }


    private Boolean plein() {
        return (index == SIZE - 1);
    }

    /**
     * Pushes a Integer to the stack
     *
     * @param v The value to be pushed to the stack
     */
    public void emplier(Integer v) {
        if (!plein()) {
            elements[++index] = v;
            sommet = elements[index];
        } else {
            erreur("Débordement : Il n'ya plus d'espace dans la pile !!");
        }
    }

    /**
     * Pops an element from the stack
     *
     * @return The head of the stack
     */
    public Integer depiler() {
        if (!pileVide()) {
            sommet = elements[index--];
            elements[index + 1] = null;
            return sommet;
        } else {
            erreur("Pile vide!!");
            return null;
        }
    }

    /**
     * Empty the stack
     */
    public void viderPile() {
        if (!pileVide()) {
            index = -1;
            for (int i = 0; i < SIZE; i++) elements[i] = null;
            sommet = null;
        }
    }

    /**
     * Prints the stack to the standard output (console)
     */
    public void listerPile() {
        if (!pileVide()) {
            System.out.println(Arrays.toString(this.elements));
        } else {
            erreur("Erreur : La pile est vide!!");
        }
    }


    /**
     * Helper method to print message to the standard output (console)
     *
     * @param mes The message to be printed to the standard output (console)
     */
    private void erreur(String mes) {
        System.out.println(mes);
    }
}
