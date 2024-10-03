package com.jbk;
import java.util.Scanner;

public class StatementMain {

	
		public static void main(String[] args) throws Exception {
			StatmentDemo s =new StatmentDemo();
			int option;
			do {
				
				Scanner sc =new Scanner(System.in);
				System.out.println("Choose Your Option:");
				System.out.println("1)INSERT DATA.\n2)UPDATE DATA.\n3)DELETE DATA\n4)DISPLAY DATA.\n5)EXIT.");
				
				option=sc.nextInt();
				
				
				switch(option) {
				
				case 1 :s.insertData();
				break;
				
				case 2 :s.Update();
				break;
				
				case 3:s.Delete(); 
				break;
				
				case 4:s.Display();
				break;
				
				case 5:sc.close();
				System.out.println("Exit Program.");
				break;
				
				}		
				
			}while(option!=5);
			
			
		

	}

}





	