import java.util.Arrays;
import java.util.stream.Collectors;

public class Anagram {
	
	public static boolean checkAnagram(String str1,String str2) {
		
		if(str1.length()!=str2.length()) return false;
		if(str1.equals(str2)) {
			return false;
		}
		
		String sortedStr1=Arrays.asList(str1.split("")).stream().sorted().collect(Collectors.joining());
		String sortedStr2=Arrays.asList(str2.split("")).stream().sorted().collect(Collectors.joining());
		
		if(sortedStr1.equals(sortedStr2)) {
			return true;
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(" 'dog' 'dog'  anagram="+checkAnagram("dog", "dog"));
		System.out.println(" 'god' 'dog' anagram="+checkAnagram("god", "dog"));
		System.out.println(" 'mary' 'army' anagram="+checkAnagram("mary", "army"));
		System.out.println(" 'army' 'army' anagram="+checkAnagram("army", "army"));
		
	}
	
	

}
