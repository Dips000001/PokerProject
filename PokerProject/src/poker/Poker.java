// Don’t Change the file name.
package poker;
public class Poker {
	
public void testFindBugs() {
	String a=null;
	if(a.equals("")) return;
}

/**
 * Checks if is full house.
 *
 * @param cards the card of the poker
 * @param n the size
 * @return true, if the input is full house
 */
// Precondition: A hand of n cards have been sorted by card number.
public boolean isFullHouse(String cards[], int n) {
return isThreeOfaKind(cards, n) && isTwoPairs(cards, n);
}
// Precondition: A hand of n cards have been sorted by card number.
public boolean isThreeOfaKind(String cards[], int n) {
	for (int i=0; i<n-2; i++) {
		if (cards[i].charAt(1) == cards[i+1].charAt(1) &&
				cards[i+1].charAt(1) == cards[i+2].charAt(1))
			return true;
	}
	return false;
}
// Precondition: A hand of n cards have been sorted by card number.
public boolean isTwoPairs(String cards[], int n) {
	int count = 0;
	for (int i=0; i<n-1; i++) {
		if (cards[i].charAt(1) == cards[i+1].charAt(1)) {
			count++;
		}
		else
		{
			if (count == 1)
				return true;
			count = 0;
		}
	}
	if (count == 1)
		return true;
	return false;
}

public static void main(String args[]) {
	System.out.println(new Poker().isFullHouse(
			new String[] {"C3", "D3", "S3", "HX", "SX"}, 5));
	}
}
// end of Poker.java
