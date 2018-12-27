package Automat;
import java.util.*;
	
public class AutomatSkica {
	public static Scanner input = new Scanner(System.in);
	private double balance;
	private double prizeOfCola = 1.2;
	private double prizeOfFanta = 1;
	private double prizeOfCockta = 0.8;
	private double prizeOfChips = 2.7;
	private double prizeOfSnickers = 1.8;
	private double prizeOfPeanuts = 2;
	public double change;
	public boolean enoughMoney;
	
	public AutomatSkica(){
		balance = 0;
		enoughMoney = false;
	}
	public AutomatSkica(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double addMoney(double amount){
		return balance = amount + balance;
	}
	public void chooseItem(int number){
		switch(number){
	
		case 1:
			while(enoughMoney == false){
			if(balance < prizeOfCola){
				System.out.println("You don't have enough money.");
				System.out.println("Insert more money: ");
				balance = input.nextDouble();
			}else if(balance == prizeOfCola){
				System.out.println("You just bought Coca Cola. Enjoy!");
				enoughMoney = true;
			}else{
				System.out.println("You just bought Coca Cola. Enjoy!");
				System.out.println("Your change is: " + (balance - prizeOfCola));
				enoughMoney = true;
			}
			}
		case 2:
			while(enoughMoney == false){
			if(balance < prizeOfFanta){
				System.out.println("You don't have enough money.");
				System.out.println("Insert more money: ");
				balance = input.nextDouble();
				
			}else if(balance == prizeOfFanta){
				System.out.println("You just bought Fanta. Enjoy!");
				enoughMoney = true;
			}else{
				System.out.println("You just bought Fanta. Enjoy!");
				change = balance - prizeOfFanta;
				System.out.println("Your change is: " + change);
				enoughMoney = true;
		}	
			}
		case 3:
			while(enoughMoney == false){
			if(balance < prizeOfCockta){
				System.out.println("You don't have enough money.");
				System.out.println("Insert more money: ");
				balance = input.nextDouble();
				
			}else if(balance == prizeOfCockta){
				System.out.println("You just bought Cockta. Enjoy!");
				enoughMoney = true;
			}else{
				System.out.println("You just bought Cockta. Enjoy!");
				change = balance - prizeOfCockta;
				System.out.println("Your change is: " + change);
				enoughMoney = true;
		}
	}
		case 4:
			while(enoughMoney == false){
			if(balance < prizeOfChips){
				System.out.println("You don't have enough money.");
				System.out.println("Insert more money: ");
				balance = input.nextDouble();
				
			}else if(balance == prizeOfFanta){
				System.out.println("You just bought Chips. Enjoy!");
				enoughMoney = true;
			}else{
				System.out.println("You just bought Chips. Enjoy!");
				change = balance - prizeOfChips;
				System.out.println("Your change is: " + change);
				enoughMoney = true;
		}
		
		
	}
		case 5:
			while(enoughMoney == false){
			if(balance < prizeOfSnickers){
				System.out.println("You don't have enough money.");
				System.out.println("Insert more money: ");
				balance = input.nextDouble();
				
			}else if(balance == prizeOfSnickers){
				System.out.println("You just bought Snickers. Enjoy!");
				enoughMoney = true;
			}else{
				System.out.println("You just bought Snickers. Enjoy!");
				change = balance - prizeOfSnickers;
				System.out.println("Your change is: " + change);
				enoughMoney = true;
		}
	}
		case 6:
			while(enoughMoney == false){
			if(balance < prizeOfPeanuts){
				System.out.println("You don't have enough money.");
				System.out.println("Insert more money: ");
				balance = input.nextDouble();
				
			}else if(balance == prizeOfPeanuts){
				System.out.println("You just bought Peanuts. Enjoy!");
				enoughMoney = true;
				break;
			}else{
				System.out.println("You just bought Peanuts. Enjoy!");
				change = balance - prizeOfPeanuts;
				System.out.println("Your change is: " + change);
				enoughMoney = true;
		}
	}
			break;
		}	
			
		}

	public double getPrizeOfCola() {
		return prizeOfCola;
	}
	public void setPrizeOfCola(double prizeOfCola) {
		this.prizeOfCola = prizeOfCola;
	}
	public double getPrizeOfFanta() {
		return prizeOfFanta;
	}
	public void setPrizeOfFanta(double prizeOfFanta) {
		this.prizeOfFanta = prizeOfFanta;
	}
	public double getPrizeOfCockta() {
		return prizeOfCockta;
	}
	public void setPrizeOfCockta(double prizeOfCockta) {
		this.prizeOfCockta = prizeOfCockta;
	}
	public double getPrizeOfChips() {
		return prizeOfChips;
	}
	public void setPrizeOfChips(double prizeOfChips) {
		this.prizeOfChips = prizeOfChips;
	}
	public double getPrizeOfSnickers() {
		return prizeOfSnickers;
	}
	public void setPrizeOfSnickers(double prizeOfSnickers) {
		this.prizeOfSnickers = prizeOfSnickers;
	}
	public double getPrizeOfPeanuts() {
		return prizeOfPeanuts;
	}
	public void setPrizeOfPeanuts(double prizeOfPeanuts) {
		this.prizeOfPeanuts = prizeOfPeanuts;
	}
}
