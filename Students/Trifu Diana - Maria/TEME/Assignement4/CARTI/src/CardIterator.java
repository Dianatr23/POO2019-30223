
public class CardIterator implements OrderedIterator{
		private Card[] pachet;
		private int n = 0;
		private int nxt = 0;
		private int r = 0;

		public CardIterator(Card[] a) {
			this.pachet = a;
		}
		
		public Card next(){
			r = 0;
			Card c = new Card("-", "romb");
			if(hasNext() == true) 
				return pachet[n++];
			else 
				return c;
		}
		
		public boolean hasNext() {
			if(n < pachet.length) {
				nxt++;
			    return true;
			}
			return false;
		}
		
		private Card[] sterge(int i) {
			Card[] pachetNou = new Card[pachet.length - 1];

			int pachetIndex = 0;
			for (int pachetNouIndex = 0; pachetNouIndex < pachetNou.length; pachetNouIndex++) {
				if (pachetIndex != i) {
					pachetNou[pachetNouIndex] = pachet[pachetIndex];
				} else {
					pachetNouIndex--;
				}
				 pachetIndex++;
			}
			return pachetNou;
		}
		
		public void remove() {
			r++;
			if(nxt != 0 &&  r <= 1)
				this.pachet = sterge(n - 1); 		
		}
		
		public Card[] adauga(Comparable objectToCompareTo) {
			Card[] pachetNou = new Card[pachet.length + 1];

			int pachetIndex = 0;
			boolean carte = false;
			for (int pachetNouIndex = 0; pachetNouIndex < pachetNou.length; pachetNouIndex++) {
				if ((pachetIndex == pachet.length || ((Card) objectToCompareTo).compareTo(pachet[pachetIndex]) < 0)&& !carte) {
					pachetNou[pachetNouIndex] = ((Card) objectToCompareTo);
					carte = true;
				} else {
					pachetNou[pachetNouIndex] = pachet[pachetIndex];
					pachetIndex++;
				}
			}

			return pachetNou;
		}
		
		@Override
		public void put(Comparable objectToCompareTo) {
			this.pachet = adauga(objectToCompareTo);
		}
	}

