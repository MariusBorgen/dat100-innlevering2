package no.hvl.dat100.tabeller;
import java.util.Arrays;
public class Tabeller {

    // a)

    public static void skrivUt (int[] tabell){
        System.out.print("[");

        for (int i=0; i<tabell.length; i++) {
            System.out.print(tabell[i]);
            }
        System.out.print("]");
    }

    // b)
    public static String tilStreng (int[] tabell1) {

        String liste = "";
        for (int i=0; i<tabell1.length; i++) {
            liste += tabell1[i];
        if (i<tabell1.length-1) {
            liste+=",";
        }
        }

        System.out.println("b)"+ "[" + liste + "]");
        return  "[" + liste + "]";
    }
 // c) 
    public static int summer(int[] tabell) {
        int sum = 0;
        for (int i=0; i<tabell.length; i++) {
            sum += tabell[i];
            }
        System.out.println("c) Summen til tabellene er: ["+sum+"]");
        return sum;
    }
    // d)
    public static boolean finnesTall(int[] tabell, int tall) {
        for (int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                System.out.println("d) true, tallet finnes ");
                return true;
        }
        }
        System.out.println("d) false, tallet finnes ikke ");
        return false;

    }


    // e)
    public static int posisjonTall(int[] tabell, int tall) {
        for (int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                System.out.println("e) Første forekomst av tallet er på index: " + i+" : "+tall);
                return i;
            }
        }
        System.out.println("e) Tallet finnes ikke i tabellene");
        return -1;
    }




    // f)
    public static int[] reverser(int[] tabell) {

    	int[] reversTabell = new int[tabell.length];  
        
    	for (int i = 0; i < tabell.length; i++) {
            reversTabell[i] = tabell[tabell.length - 1 - i];
        
            System.out.println("f) Reverserte tabellene er: "+reversTabell[i] + " ");
        }
        return reversTabell;
    }
   
    



    // g)
    public static boolean erSortert(int[] tabell) {

        for (int i=1; i<tabell.length; i++) {
            if (tabell[i] < tabell[i - 1]) {
                System.out.println("g) Arrayen er ikke i stigende rekkefølge, false");
                return false;
            }
        }
        System.out.println("g) Arrayen er i stigende rekkefølge, true");
        return true;
    }

	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] sammensattTabell = new int[tabell1.length+tabell2.length];
	    for (int i = 0; i < tabell1.length; i++) {
	        sammensattTabell[i] = tabell1[i];
	    }
	    for (int i = 0; i < tabell2.length; i++) {
	        sammensattTabell[tabell1.length + i] = tabell2[i];
	    	
	}
	    System.out.println("h)"+Arrays.toString(sammensattTabell));
		return sammensattTabell;
	}
	}