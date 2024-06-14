package whyDoIAgreeToThisShit;

public class ProduitB extends Produit {
	
	public float discountRate;
	

	public ProduitB(String name, String originCity, float unitPrice, int quantity, float discountRate) {
		super(name, originCity, unitPrice, quantity);
		this.discountRate = discountRate;
	}

	
	public float calculPrixReduit() {
		return this.calculerPrix() * this.discountRate;
	}


	@Override
	public String toString() {
		return "ProduitB [discountRate=" + discountRate + ", name=" + name + ", originCity=" + originCity
				+ ", unitPrice=" + unitPrice + ", quantity=" + quantity + "]";
	}
	
	
}
