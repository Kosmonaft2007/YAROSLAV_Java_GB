
public class HotDrinksVendingMachine impliments VendingMachine{
	
	public HotDrinksVendingMachine(){
	}
	
	public Product getProduct() {
		return new Product();
	}
	
	
	public void addProduct(Product prd) {
		listProduct.add(prd);
	}
	
	public void showInfo() {
		System.out.println("Могу приготовить следующие напитки:\n");
		for (Product prd : listProduct) {
			System.out.println(prd);
		}
	}
}



