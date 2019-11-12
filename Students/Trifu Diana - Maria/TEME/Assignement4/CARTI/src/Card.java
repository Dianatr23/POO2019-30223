
public class Card implements Comparable {
	private String rank;
	private String suit;
	
	public Card(String a, String b) {
		this.rank = a;
		this.suit = b;
	}

	public String getSuit() {
		return suit;
	}
	
    public int getRank() {
    	if(this.rank == "A")
    		return 14;
    	else if(this.rank == "K")
    		return 13;
    	else if(this.rank == "Q")
    		return 12;
    	else if(this.rank == "J")
    		return 11;
    	else 
    		return 0;
    	
    }
	
   
	public int compareTo(Comparable objectToCompareTo) {
		if(objectToCompareTo instanceof Card) {
			int result = rank.compareTo(((Card)objectToCompareTo).getRank() + "");
			if(result == 0) {
				return suit.compareTo(((Card)objectToCompareTo).getSuit());
			}
			return result;
		}
		return 0;
	}

	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
