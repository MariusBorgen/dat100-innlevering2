package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
	    System.out.println("a) Skriver ut matrisen:");
	    for (int i = 0; i < matrise.length; i++) {
	        for (int j = 0; j < matrise[i].length; j++) {
	            System.out.print(matrise[i][j] + " ");
	        }
	        System.out.println(); 
	    }
	}


	// b)
	public static String tilStreng(int[][] matrise) {
	    System.out.println("b) Konverterer matrise til streng:");
	    StringBuilder sb = new StringBuilder();

	    for (int i = 0; i < matrise.length; i++) {
	        for (int j = 0; j < matrise[i].length; j++) {
	            sb.append(matrise[i][j]).append(" ");
	        }
	        sb.append("\n");
	    }

	    return sb.toString();
	}


	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
	    System.out.println("c) Skalerer matrisen med: " + tall);
	    int[][] nyMatrise = new int[matrise.length][matrise[0].length];

	    for (int i = 0; i < matrise.length; i++) {
	        for (int j = 0; j < matrise[i].length; j++) {
	            nyMatrise[i][j] = matrise[i][j] * tall;
	        }
	    }

	    System.out.println("c) Resultatet av skaleringen:");
	    for (int i = 0; i < nyMatrise.length; i++) {
	        for (int j = 0; j < nyMatrise[i].length; j++) {
	            System.out.print(nyMatrise[i][j] + " ");
	        }
	        System.out.println();
	    }

	    return nyMatrise;
	}


	// d)
	public static boolean erLik(int[][] a, int[][] b) {
	    System.out.println("d) Sammenligner matriser:");
	    if (a.length != b.length) {
	        System.out.println("d) Matrisene har ulikt antall rader.");
	        return false;
	    }

	    for (int i = 0; i < a.length; i++) {
	        if (a[i].length != b[i].length) {
	            System.out.println("d) Matrisene har ulikt antall kolonner.");
	            return false;
	        }

	        for (int j = 0; j < a[i].length; j++) {
	            if (a[i][j] != b[i][j]) {
	                System.out.println("d) Ulikt element funnet ved posisjon [" + i + "][" + j + "]");
	                return false;
	            }
	        }
	    }

	    System.out.println("d) Matrisene er like.");
	    return true;
	}

}
