package main.metier;

public class ProduitB extends Produit{
	private double discount;

	public ProduitB(String name, String orignCity, double unitPrice, int quantity, double discount) {
		super(name, orignCity, unitPrice, quantity);
		this.discount = discount;
		// TODO Auto-generated constructor stub
	}

	public double getDiscout() {
		return discount;
	}

	public void setDiscout(double discout) {
		this.discount = discout;
	}

	public double calculerPrixReduit() {
		return this.calculerPrix()*(1-discount/100);
	}
	 public String toString() {
	        return "ProduitB{" +
	                "name='" + getName() + '\'' +
	                ", originCity='" + getOriginCity() + '\'' +
	                ", unitPrice=" + getUnitPrice() +
	                ", quantity=" + getQuantity() +
	                ", discount=" + discount +
	                '}';
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (!(o instanceof ProduitB)) return false;
	        if (!super.equals(o)) return false;

	        ProduitB produitB = (ProduitB) o;

	        return Double.compare(produitB.discount, discount) == 0;
	    }
}
