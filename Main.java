package codigoecalculodeitens;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      Locale.setDefault(Locale.US);
	      
	      Scanner sc = new Scanner(System.in);
	      
	     int cod;
	     int qtd;
	     double total;
	      cod = sc.nextInt();
	      qtd = sc.nextInt();
	      
	      if (cod ==1) {
	    	  total = qtd * 4.0;
	      }else if(cod == 2) {
	    	  total = qtd * 4.5;
	      }else if(cod == 3) {
	    	  total = qtd * 5.0;
	      }else if(cod == 4) {
	    	  total = qtd * 2.0;
	      }else {
	    	  total = qtd * 1.5;
	      }
	      
	     System.out.printf("Total de R$ %.2f%n", total);
	      sc.close();

	}
}
