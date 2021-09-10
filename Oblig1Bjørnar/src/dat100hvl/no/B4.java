package dat100hvl.no;

import static javax.swing.JOptionPane.showInputDialog;



public class B4 {

	public static void main(String[] args) {
		// if statement
		
		 String brutt = showInputDialog(" skriv inn bruttoinntekt");
			
			int brutto = Integer.parseInt( brutt);
				
		if(brutto < 184800) {		
			System.out.println("ingen trinnskatt");
		}
		else if (brutto < 184800 && brutto > 260100) {
			System.out.println(brutto * 0.017);
		}
		else if (brutto > 260100 && brutto < 651250) {
			System.out.println(brutto * 0.04);
		}
		else if (brutto > 651250 && brutto < 1021550) {
			System.out.println(brutto * 0.132);
		}
		if(brutto > 1021550) {		
			System.out.println( brutto * 0.162);
	}

}
	
	
}