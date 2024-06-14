package whyDoIAgreeToThisShit;

public class ProduitA extends Produit {
	
	public Quality quality;
	
	public ProduitA(String name, String originCity, float unitPrice, int quantity, Quality quality) {
		super(name, originCity, unitPrice, quantity);
		this.quality = quality;
	}

	@Override
	public String toString() {
		return "ProduitA [quality=" + quality + ", name=" + name + ", originCity=" + originCity + ", unitPrice="
				+ unitPrice + ", quantity=" + quantity + "]";
	}

	
}
