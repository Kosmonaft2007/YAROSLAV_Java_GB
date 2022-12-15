
public class Customer{


	public void moneyDeposit(Product prd, int cash){
		if (prd.getPrice() < cash) {
			System.out.println("Недостаточно средств");
			return;
		} else if (prd.getPrice() > cash) {
		
			System.out.println("Возьмите ваш напиток!\nСпасибо за покупку!");
			System.out.printf("\nВозьмите сдачу: %d\n", cash - prd.getPrice());
		} else {
			System.out.println("Возьмите ваш напиток!\nСпасибо за покупку!");
		}
	}
	
	public void choiceDrink(){
		
	}
}



