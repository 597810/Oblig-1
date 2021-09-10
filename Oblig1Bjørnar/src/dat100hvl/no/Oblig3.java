package dat100hvl.no;

import static  javax.swing.JOptionPane.*;

public class Oblig3 {

	public static void main(String[] args) {
		String tal = showInputDialog( "skriv inn ett heltal");
		int temp   = 1;
		
		int heltal = Integer.parseInt(tal);
		while(heltal >1) {
	     temp *=heltal;
	     heltal--;
	     
		}
		
		System.out.println(tal +"! = " +temp);
		
		
		
		

	}

}
