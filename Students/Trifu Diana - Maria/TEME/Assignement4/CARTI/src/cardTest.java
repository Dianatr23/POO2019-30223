
public class cardTest {

	public static void main(String[] args) {
		Card[] pack = { new Card("2", "romb"), new Card("3", "romb"), new Card("4", "romb"), new Card("5", "romb"),
				new Card("6", "romb"), new Card("7", "romb"), new Card("8", "romb"), new Card("9", "romb"),
				new Card("10", "romb"), new Card("J", "romb"), new Card("Q", "romb"), new Card("K", "romb"), new Card("A", "romb") };
		
		String cardIteratorString = "";
		CardIterator cardIterator = new CardIterator(pack);
		
		while (cardIterator.hasNext()) {
			cardIteratorString = cardIteratorString + cardIterator.next().getRank();
		}
		
		
	}

}
