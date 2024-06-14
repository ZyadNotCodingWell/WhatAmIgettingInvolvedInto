package whyDoIAgreeToThisShit;

public class ProduitB extends Produit {
	
	private float discountRate;
	

	public ProduitB(String name, String originCity, float unitPrice, int quantity, float discountRate) {
		super(name, originCity, unitPrice, quantity);
		this.discountRate = discountRate;
	}


	public float getDiscountRate() {
		return discountRate;
	}


	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	
	public float calculPrixReduit() {
		return this.calculerPrix() * this.discountRate;
	}
}
