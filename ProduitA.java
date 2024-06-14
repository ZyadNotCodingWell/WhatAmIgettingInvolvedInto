package whyDoIAgreeToThisShit;

public class ProduitA extends Produit {
	
	private Quality quality;
	
	public ProduitA(String name, String originCity, float unitPrice, int quantity, Quality quality) {
		super(name, originCity, unitPrice, quantity);
		this.quality = quality;
	}

	public Quality getQuality() {
		return quality;
	}

	public void setQuality(Quality quality) {
		this.quality = quality;
	}
	
	
}
