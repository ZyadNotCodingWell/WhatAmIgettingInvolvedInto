package test.metier;

import main.metier.ProduitB;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProduitBTest {
    @Test
    public void testCalculerPrixReduit() {
        ProduitB produitB = new ProduitB("PC", "Paris", 500, 3, 10);
        assertEquals(1350, produitB.calculerPrixReduit());
    }

    @Test
    public void testToString() {
        ProduitB produitB = new ProduitB("PC", "Paris", 500, 3, 10);
        String expected = "ProduitB{name='PC', originCity='Paris', unitPrice=500.0, quantity=3, discount=10.0}";
        assertEquals(expected, produitB.toString());
    }

    @Test
    public void testEquals() {
        ProduitB produitB1 = new ProduitB("PC", "Paris", 500, 3, 10);
        ProduitB produitB2 = new ProduitB("PC", "Paris", 500, 3, 10);
        assertEquals(produitB1, produitB2);
    }
}
