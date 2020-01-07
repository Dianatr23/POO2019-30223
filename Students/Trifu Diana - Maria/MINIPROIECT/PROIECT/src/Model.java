
/**
 * @author Diana Aceasta clasa reprezinta modelul proiectului
 */
public class Model {

	/**
	 * Un string de string-uri care contine cele 10 intrebari ale quiz-ului
	 */
	private String[] question = { "1. Care este complexitatea algoritmului Bubble-Sort?",
			"2. Metoda bottom-up e o metoda de construire a structurii de date:",
			"3. Care este complexitatea algoritmului Heap-Sort?",
			"4. '1, 2, 3, 6, 7, 9' e o parcurgere inordine. Care este radacina?",
			"5. Care este complexitatea algoritmului lui Tarjan?",
			"6. '5, 1, 4, 2, 8' - un vector. Cum va arata dupa doua parcurgeri ale lui Bubble-Sort?",
			"7. '7, 4, 3, 5, 8, 9' e o parcurgere preordine. Care este radacina?",
			"8. '7, 6, 2, 3, 1' - un vector. Cum va arata dupa doi pasi ai lui Selection-Sort?",
			"9. Cate parcurgeri va face Bubble-Sort pentru ca vectorul '5, 1, 4, 2, 8' sa fie sortat?",
			"10. '5, 6, 7, 10, 9, 8' e o parcurgere postordine. Care este radacina?" };

	/**
	 * Un string de string-uri care contine variantele de raspuns pentru cele 10
	 * intrebari ale quiz-ului
	 */
	private String[] answers = { "O(n)", "O(nlogn)", "O(n^2)", "O(logn)", "heap", "lista", "arbore", "stiva", "O(n)",
			"O(n^2)", "O(logn)", "O(nlogn)", "2", "3", "9", "7", "O(V)", "O(V+E)", " O(V/E)", " O(E)", "8 5 1 4 2",
			"5 4 8 1 2", "1 2 4 5 8", "5 8 4 2 1", "4", "3", "9", "7", "1 2 6 3 7", "1 6 2 3 7", "7 2 6 3 1",
			"1 7 6 2 3", "1", "3", "5", "0", "8", "5", "10", "6" };

	/**
	 * @param a reprezinta numarul intrebarii
	 * @return intrebarea dorita
	 */
	public String getStringQuestion(int a) {
		return this.question[a];
	}

	/**
	 * @param b reprezinta numarul raspunsului
	 * @return raspunsul dorit
	 */
	public String getStringAnswer(int b) {
		return this.answers[b];
	}
}
