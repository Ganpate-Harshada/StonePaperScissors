package project;

import java.util.Random;
import java.util.Scanner;



public class Stone_paper_game {

	public static void main(String[] args) {
		
		
		System.out.println("             =======##########======= STONE , PAPER , SCISSORS GAME=======###########=======");
		
		
		int count , usercount = 0 , comcount = 0, taidcount = 0 ;
	    String prompt;
	    Scanner input = new Scanner (System.in);
		
		for(count = 0; count < 5 ; count ++)  ;
		System.out.println(" Enter Your Choice :      \n1.Stone \n2.Paper \n3.scissors" );
		Scanner sc =new Scanner(System.in);
		int user= sc.nextInt();
		
		if(   user == 1) 
			System.out.println("User Choose : Stone") ;
			
			
			else if (user == 2) 
				System.out.println("User Choose : Paper");
		
			else if (user == 3)
				System.out.println("User Choose : Scissors");
		
			else
				System.out.println("Wrong Input");
		
		
		Random rand = new Random();
	
		int bound = 3;
		int computer = rand.nextInt(bound);
		
		
		if (computer == 0)
			System.out.println(" Computer Choose : Stone");
		
		else if (user == 1) 
			System.out.println("Computer Choose : Paper");
	
		else 
			System.out.println("Computer Choose : Scissors");
	
		if(user == 1 && computer == 0 || user == 2 && computer == 1 || user == 3 && computer == 2) {
			System.out.println("Match is Taid\n");
			taidcount ++ ;
		}
		
		

		else if(user == 1 && computer == 2|| user == 2 && computer == 0 || user == 3 && computer == 1) {
			System.out.println("You win..!\n ");
			usercount ++ ;
		}
		
		else {
			System.out.println("Computer Win..!\n");
		
			comcount ++ ;
			
		}
		
		
	
	
	   System.out.println("You Win...! "+ usercount+" time");
	   System.out.println("Computer Win..!"+ comcount +" time");
	   System.out.println("Taid..!"+ taidcount +" time");
	   
	   System.out.println(" ");
	   
	   
	   System.out.println("Play Again.....");
         
 
	   
	   int count1 , usercount1 = 0 , comcount1 = 0, taidcount1 = 0 ;
		
		for(count = 0; count < 5 ; count ++)  ;
		System.out.println("Enter Your Choice : \n1.Stone \n2.Paper \n3.scissors" );
		Scanner sc1 =new Scanner(System.in);
		int user1= sc.nextInt();
	   
	   

		if(user == 2) 
			System.out.println("User Choose : Stone") ;
			
			
			else if (user == 3) 
				System.out.println("User Choose : Paper");
		
			else if (user == 1
					)
				System.out.println("User Choose : Scissors");
		
			else
				System.out.println("Wrong Input");
		
		
		Random rand1 = new Random();
	
		int bound1 = 3;
		int computer1 = rand.nextInt(bound1);
		
		
		if (computer == 0)
			System.out.println(" Computer Choose : Stone");
		
		else if (user == 1) 
			System.out.println("Computer Choose : Paper");
	
		else 
			System.out.println("Computer Choose : Scissors");
	
		if(user == 2 && computer == 1 || user == 1 && computer == 0 || user == 3 && computer == 2) {
			System.out.println("Match is Taid\n");
			taidcount ++ ;
		}
		
		

		else if(user == 2&& computer == 1|| user == 1 && computer == 3|| user == 3 && computer == 2) {
			System.out.println("You win..!\n ");
			usercount ++ ;
		}
		
		else {
			System.out.println("Computer Win..!\n");
		
			comcount ++ ;
			
		}
		
		
	
	
	   System.out.println("You Win...! "+ usercount+" time");
	   System.out.println("Computer Win..!"+ comcount +" time");
	   System.out.println("Taid..!"+ taidcount +" time");
	   
	   System.out.println(" ");
	   
	   
	  
       System.out.println("Play Again...");
       
 
	   
	   
	   
	   int count2 , usercount2 = 0 , comcount2 = 0, taidcount2 = 0 ;
		
		for(count = 0; count < 5 ; count ++)  ;
		System.out.println("Enter Your Choice : \n1.Stone \n2.Paper \n3.scissors" );
		Scanner sc2 =new Scanner(System.in);
		int user2= sc.nextInt();
		
		if(user == 1) 
			System.out.println("User Choose : Stone") ;
			
			
			else if (user == 2) 
				System.out.println("User Choose : Paper");
		
			else if (user == 3)
				System.out.println("User Choose : Scissors");
		
			else
				System.out.println("Wrong Input");
		
		
		Random rand2 = new Random();
	
		int bound2 = 3;
		int computer2 = rand.nextInt(bound2);
		
		
		if (computer == 0)
			System.out.println(" Computer Choose : Stone");
		
		else if (user == 1) 
			System.out.println("Computer Choose : Paper");
	
		else 
			System.out.println("Computer Choose : Scissors");
	
		if(user == 1 && computer == 0 || user == 2 && computer == 1 || user == 3 && computer == 2) {
			System.out.println("Match is Taid\n");
			taidcount ++ ;
		}
		
		

		else if(user == 1 && computer == 2|| user == 2 && computer == 0 || user == 3 && computer == 1) {
			System.out.println("You win..!\n ");
			usercount ++ ;
		}
		
		else {
			System.out.println("Computer Win..!\n");
		
			comcount ++ ;
			
		}
		
		
	
	
	   System.out.println("You Win...! "+ usercount+" time");
	   System.out.println("Computer Win..!"+ comcount +" time");
	   System.out.println("Taid..!"+ taidcount +" time");
	   
	   System.out.println(" ");
	   
	   
	    System.out.println("Would you like to continue?(yes/no)");
        prompt = input.next();
    while(prompt.equalsIgnoreCase("yes")) ;
    
  
	}
	   
	   
	   
}

		
		
		
		
		
		
		
		
	
		


