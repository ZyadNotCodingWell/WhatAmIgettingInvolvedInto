package main.metier;

public class Produit implements IProduit{
	private String name;
    private String originCity;
    private double unitPrice;
    private int quantity;
    public Produit(String name, String orignCity, double unitPrice, int quantity) {
    	this.name = name;
    	this.originCity = orignCity;
    	this.unitPrice = unitPrice;
    	this.quantity = quantity;
    }
	@Override
	public double calculerPrix() {
		// TODO Auto-generated method stub
		return unitPrice*quantity;
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
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
    public String toString() {
        return "Produit{" +
                "name='" + name + '\'' +
                ", originCity='" + originCity + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Produit produit = (Produit) o;

        if (Double.compare(produit.unitPrice, unitPrice) != 0) return false;
        if (quantity != produit.quantity) return false;
        if (!name.equals(produit.name)) return false;
        return originCity.equals(produit.originCity);
    }

}
