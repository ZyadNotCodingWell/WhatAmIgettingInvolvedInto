package whyDoIAgreeToThisShit;

public abstract class Produit implements Product{
	
	public String name;
	public String originCity;
	public float unitPrice;
	public int quantity;
	
	public Produit(String name, String originCity, float unitPrice, int quantity) {
		this.name = name;
		this.originCity = originCity;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}
	
	public float calculerPrix() {
		return this.unitPrice * this.quantity;
	}
	
}
