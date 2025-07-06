package it.exam.simple.model;

/**
 * Verifica se un intero è compreso tra due estremi inclusi.
 */
public class RangeChecker {
    /**
     * Restituisce true se x è compreso tra min e max inclusi.
     * @param x numero da verificare
     * @param min estremo inferiore
     * @param max estremo superiore
     * @return true se x è >= min e <= max
     * @throws IllegalArgumentException se min > max
     */
    public static boolean isInRange(int x, int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Estremo inferiore maggiore dell'estremo superiore");
        }
        return x >= min && x <= max;
    }
}
