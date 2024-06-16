package JavaFX;

import java.util.ArrayList;
import whyDoIAgreeToThisShit.*;

// The issue is, we're havin a downcast here, so we're losing the properties of subs that aren't inherited
// from the matrix, I'll try to find a workaround by using generalized type data structures :)
// turned to string, just for showcase, eventually make a string to object parser?

public class ProductArray {
	public static ArrayList<String> prodArray = new ArrayList<String>();
	// now this is kinda funny, it's a string, to operate on elements here, we need to play on the strings,
	// Actually doable, I just need an internet connection right now to get it done

	public static void add(String string) {
		prodArray.add(string);
	}
}
