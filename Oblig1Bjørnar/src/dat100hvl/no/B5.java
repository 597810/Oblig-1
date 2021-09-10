package dat100hvl.no;

import static javax.swing.JOptionPane.showInputDialog;



public class B5 {

	public static void main(String[] args) {
		
		
		 String karakter = showInputDialog(" skriv inn poengsum");
			int k= Integer.parseInt(karakter);
					
				
				
				
		if( k <= 100 && k >=90  ) {		
			System.out.println("karakter A");
			}
			else	if( k <= 89  && k >= 80  ) {		
				System.out.println("karakter B");
			}		
			else if( k <=79  && k >=60  ) {		
				System.out.println("karakter C");
			}	
			else if( k <= 59 && k >=50  ) {		
				System.out.println("karakter D");
			}	
			else if( k <= 49 && k >=40  ) {		
				System.out.println("karakter E");
			}	
			else if( k <= 39 && k >=0  ) {		
				System.out.println("karakter E");
			}	
			else if ( k > 100 && k < 0) {
				System.out.println(" ikkje gyldig poengsum,");
		}
		}
}
