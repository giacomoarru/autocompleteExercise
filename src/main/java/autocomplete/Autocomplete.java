package autocomplete;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Problem: AUTOCOMPLETE
 * 
 * input: 'do'
 * 
 * possibilities: [ 'dog', 'dark', 'cat', 'door', 'dodge' ]
 * 
 * output: [ 'dog', 'door', 'dodge' ]
 * 
 * @author giaarr
 *
 */
public class Autocomplete {

	private static final String[] autocompleteDatabase = {"dog", "dark", "cat", "door", "dodge"};
	
	public static void main(String[] args) {
		
		String input = "do";
		
		System.out.println(Arrays.toString(autocomplete(input, autocompleteDatabase)));
	}

	/**
	 * Returns autocomplete suggestions
	 * @param input
	 * @param autocompleteDatabase
	 * @return
	 */
	static String[] autocomplete(String input, String[] autocompleteDatabase) {
		Objects.requireNonNull(input);
		Objects.requireNonNull(autocompleteDatabase);
		
		Set<String> output = new HashSet<>();
		
		for (String currentString : autocompleteDatabase) {
			if (currentString == null)
				continue;
			
			if (currentString.toLowerCase().startsWith(input.toLowerCase())) {
				output.add(currentString);
			}
		}
		
		return output.toArray(new String[0]);
		
	}
	
}
