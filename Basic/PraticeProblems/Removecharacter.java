//Example 1
// Input:
// string1 = "computer"
// string2 = "cat"
// Output: "ompuer"
// Explanation: After removing characters(c, a, t) from string1 we get "ompuer".

//Example 2
// Input:
// string1 = "occurrence"
// string2 = "car"
// Output: "ouene"
// Explanation: After removing characters (c, a, r) from string1 we get "ouene".

public class Removecharacter
{
	public static void main(String[] args) {
	String string1="computer";
	String string2="cat";
	System.out.println(removeChars(string1,string2));
	}
    static String removeChars(String string1, String string2){
      String string3=string1.replaceAll( "["+string2+"]","");
      return string3;
  }
}
