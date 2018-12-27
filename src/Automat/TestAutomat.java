package Automat;
import java.util.*;
public class TestAutomat {

	public static void main(String[] args) throws InputMismatchException {
		boolean valid = true;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount: ");
		double amount =  input.nextDouble();
		while(amount < 0){
			System.out.println("You can't enter that amount, try again: ");
			amount = input.nextDouble();
		}
		AutomatSkica automat = new AutomatSkica(amount);
		String[][] automatItems = {{"Coca Cola", "Fanta", "Cockta"}, {"Chips", "Snickers", "Peanuts"}};
		double[][] automatPrizes = {{automat.getPrizeOfCola(), automat.getPrizeOfFanta(), automat.getPrizeOfCockta()}, {automat.getPrizeOfChips(), automat.getPrizeOfSnickers(), automat.getPrizeOfPeanuts()}};
		System.out.println("----------AUTOMAT----------");
		int brojac = 1;
		System.out.println("Enter ZERO " + "(0), if you want to add more money.");
		System.out.println("---------------------------");
		for(int i = 0; i < automatItems.length; i++){
			for(int j = 0; j <= automatItems.length; j++){
				System.out.print(brojac + ". " + "| " + automatItems[i][j] + "(" + automatPrizes[i][j] + "$)" + " ");
				System.out.println();
				brojac++;
			}
		
		}
		System.out.println("Pick the number of item that you want: ");
		while(valid){
			try{
		int number = input.nextInt();
		while(number == 0){
			System.out.println("Enter amount of money you want to add: ");
			double amountToAdd = input.nextDouble();
			automat.addMoney(amountToAdd);
			System.out.println("Now choose the number of item you want to buy: ");
			number = input.nextInt();
		}
		enterNumber(number);
		automat.chooseItem(number);
		valid = false;
			} catch(InputMismatchException ex){
				System.out.println("Wrong input, try again: ");
			}

			} 
		
		
	}
	public static int enterNumber(int number){
		if(number == 1 || number == 2 ||number == 3 ||number == 4 ||number == 5 ||number == 6 || number == 0 ){
			return number;
		}else{
		throw new InputMismatchException("Wrong input!");
		}
	}
}

