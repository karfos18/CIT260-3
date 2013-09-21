package galtolittable;

/**
 *
 * @author Karalee Olsen
 */
/* 
 * Try this 1-2
 * This program converts gallons to litres.
 * Call this program GalToLitTable.java.
 */
public class GalToLitTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gallons, litres;
        int counter;
        
        counter = 0;
        for(gallons = 1; gallons <= 100; gallons++){
            litres = gallons * 3.7854; //convert to litres
            System.out.println( gallons + " gallons is " + litres + "litres. ");
            
            counter++;
            // every 10th line, print a blank line
            if (counter == 10){
                System.out.println();
                counter = 0; // reset the line counter
            }
        }        
    }
}
