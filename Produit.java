package whyDoIAgreeToThisShit;

// JE ne vais pas mettre les attributs en public dans l'implémentatioon pour bloquer l'accès en écriture des
// attributs d'instances.

public abstract class Produit implements Product{
	
	private String name;
	private String originCity;
	private float unitPrice;
	private int quantity;
	
	public Produit(String name, String originCity, float unitPrice, int quantity) {
		this.name = name;
		this.originCity = originCity;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOriginCity() {
		return originCity;
	}

	public void setOriginCity(String originCity) {
		this.originCity = originCity;
	}

	public float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public float calculerPrix() {
		return this.unitPrice * this.quantity;
	}
	
}
