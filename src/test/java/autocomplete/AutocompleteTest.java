package autocomplete;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class AutocompleteTest {

	@Test
	public void testNullPointerException() {
		Assert.assertThrows(NullPointerException.class, () -> Autocomplete.autocomplete(null, null));				
	}
	
	@Test
	public void testCase1() {
		String[] testArray = Autocomplete.autocomplete(
				"do", 
				new String[] {"dog", "dark", "cat", "door", "dodge"}
				);
		Arrays.sort(testArray);
		assertArrayEquals(
				new String[] {"dodge", "dog", "door"},
				testArray
				); 
	}

	@Test
	public void testCase2() {
		String[] testArray = Autocomplete.autocomplete(
				"dop", 
				new String[] {"do", "dop", "dopp", null, "", "Doppler"}
				);
		Arrays.sort(testArray);
		assertArrayEquals(
				new String[] {"Doppler", "dop", "dopp"},
				testArray
				); 
	}
	
}
