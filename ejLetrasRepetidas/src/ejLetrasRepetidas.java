import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ejLetrasRepetidas {

	public static void main(String[] args) {
		// Fase 1
				char[] myName = { 'k', 'o', 'n', 's', 't', 'a', 'n', 't', 'i', 'n', 'a' };
				for (int i = 0; i < myName.length; i++) {
					System.out.println(myName[i]);
				}

				
				// Fase 2
				List<Character> letters = Arrays.asList('k', 'o', 'n', 's', 't', 'a', 'n', 't', 'i', 'n', 'a');
				
				List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'y');
				
				List<Character> consonants = Arrays.asList('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z');
				
				for (Character letter : letters) {
					for (Character vowel : vowels) {
						if (letter.equals(vowel)) {
							System.out.println(letter + " is a vowel");
						}
					}
					for (Character consonant : consonants) {
						if (letter.equals(consonant)) {
							System.out.println(letter + " is a consonant");
						}
					}
					if (Character.isDigit(letter)){
						System.out.println("Els noms de persones no contenen números!");
					}
				}
				
				
				// Fase 3			
				Map<Character, Integer> lettersCount = new HashMap<>();
				for (char letter : myName) {
				    Integer count = lettersCount.get(letter);
				    if (count == null) {
				    	count = 0; 
				    }
				    lettersCount.put(letter, count + 1);
				}
				System.out.println(lettersCount);
				
				
				// Fase 4
				List<Character> surname = Arrays.asList('m', 'a', 'r', 't', 'i', 'n', 'e', 'z');
				List<Character> nameSurname = new ArrayList<Character>();
				nameSurname.addAll(letters);
				nameSurname.add(' ');
				nameSurname.addAll(surname);
				
				System.out.println(nameSurname);

	}

}
