package it.exam.simple.model;

/**
 * Verifica se una parola è contenuta in una frase.
 */
public class WordFinder {
    /**
     * Restituisce true se word è sottostringa di sentence.
     * @param sentence frase di ricerca
     * @param word parola da cercare
     * @return true se sentence contiene word
     * @throws IllegalArgumentException se sentence o word è null o vuoto
     */
    public static boolean containsWord(String sentence, String word) {
        if (sentence == null || word == null || sentence.isBlank() || word.isBlank()) {
            throw new IllegalArgumentException("Frase e parola non possono essere null o vuote");
        }
        return sentence.contains(word);
    }
}
