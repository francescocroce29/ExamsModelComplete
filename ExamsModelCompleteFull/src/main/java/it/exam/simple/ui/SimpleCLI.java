package it.exam.simple.ui;

import it.exam.simple.model.RangeChecker;
import it.exam.simple.model.WordFinder;
import java.util.Scanner;

/**
 * Semplice interfaccia a console per testare RangeChecker e WordFinder.
 */
public class SimpleCLI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Test RangeChecker ===");
        System.out.print("Inserisci x, min, max: ");
        int x = sc.nextInt(), min = sc.nextInt(), max = sc.nextInt();
        try {
            boolean inRange = RangeChecker.isInRange(x, min, max);
            System.out.printf("Il numero %d è %sin range [%d, %d]\n", x, inRange ? "" : "non ", min, max);
        } catch (IllegalArgumentException e) {
            System.err.println("Errore: " + e.getMessage());
        }
        sc.nextLine(); // consume newline

        System.out.println("\n=== Test WordFinder ===");
        System.out.print("Inserisci frase: ");
        String sentence = sc.nextLine();
        System.out.print("Inserisci parola da cercare: ");
        String word = sc.nextLine();
        try {
            boolean found = WordFinder.containsWord(sentence, word);
            System.out.printf("La parola '%s' %s nella frase.\n", word, found ? "è presente" : "non è presente");
        } catch (IllegalArgumentException e) {
            System.err.println("Errore: " + e.getMessage());
        }
        sc.close();
    }
}
