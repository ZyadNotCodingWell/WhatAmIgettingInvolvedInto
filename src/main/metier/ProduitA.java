package main.metier;

public class ProduitA extends Produit{
	private String quality;
    
	public ProduitA(String name, String orignCity, double unitPrice, int quantity, String quality) {
		super(name, orignCity, unitPrice, quantity);
		this.quality = quality;
		// TODO Auto-generated constructor stub
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}
	 public String toString() {
	        return "ProduitA{" +
	                "name='" + getName() + '\'' +
	                ", originCity='" + getOriginCity() + '\'' +
	                ", unitPrice=" + getUnitPrice() +
	                ", quantity=" + getQuantity() +
	                ", quality='" + quality + '\'' +
	                '}';
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (!(o instanceof ProduitA)) return false;
	        if (!super.equals(o)) return false;

	        ProduitA produitA = (ProduitA) o;

	        return quality.equals(produitA.quality);
	    }
}
