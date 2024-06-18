package test.metier;

import main.metier.ProduitA;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProduitATest {
	@Test
	public void testCalculerPrix() {
		ProduitA produitA = new ProduitA("PC", "Paris", 700, 2, "High_Quality");
		assertEquals(1400, produitA.calculerPrix());
	}

	@Test
	public void testToString() {
		ProduitA produitA = new ProduitA("PC", "Paris", 700, 2, "High_Quality");
		String expected = "ProduitA{name='PC', originCity='Paris', unitPrice=700.0, quantity=2, quality='High_Quality'}";
		assertEquals(expected, produitA.toString());
	}

	@Test
	public void testEquals() {
		ProduitA produitA1 = new ProduitA("PC", "Paris", 700, 2, "High_Quality");
		ProduitA produitA2 = new ProduitA("PC", "Paris", 700, 2, "High_Quality");
		assertEquals(produitA1, produitA2);
	}
}


