package lotteryGame;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Random random = new Random();
		
		int randomNumber = random.nextInt(100,999);
		
		System.out.println("Enter Three Digit Number :-");
		
		int userInput = in.nextInt();
		
		if(userInput<100||userInput>999) {
			System.out.println("Please Enter three digit number");
		}else {
			
			Set<String> userIn = new HashSet<>(Arrays.asList((userInput+"").split("")));
			Set<String> rdSet =  new HashSet<>(Arrays.asList((randomNumber+"").split(""))); 

			
			int count=0;
			
		    Iterator<String> itr = rdSet.iterator();
		    
		    while(itr.hasNext()) {
		    	if(userIn.contains(itr.next()))++count;
		    }
			
			if(userIn.equals(rdSet)) {
				System.out.println("You won $10,000");
			}else if(count==3) {
				System.out.println("You won $3,000");
			}else if(count==1) {
				System.out.println("You won $1000");
			}else {
				System.out.println("You lost the game");
			}
		}
		System.out.println(randomNumber);
	}
}
