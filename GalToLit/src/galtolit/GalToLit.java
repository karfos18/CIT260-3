package galtolit;

/**
 *
 * @author Karalee Olsen
 */
/* Try this 1-1
	This program converts gallons to litres.
	Call this program GalToLit.java.
*/
public class GalToLit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double gallons; // holds the number of gallons
		double litres;  // holds the number of litres
		
		gallons = 10; // start with 10 gallons
		litres = gallons * 3.7854; //convert to litres
			System.out.println( gallons + " gallons is " + litres + " litres.");
    }
}
