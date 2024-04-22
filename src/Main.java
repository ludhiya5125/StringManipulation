import java.util.LinkedHashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
String text= """
        Twinkle, twinkle, little star
        How I wonder what you are
        Up above the world so high
        Like a diamond in the sky
        Twinkle, twinkle, little star
        How I wonder what you are
        When the blazing sun is gone
        When he nothing shines upon
        Then you show your little light
        Twinkle, twinkle, all the night
        Twinkle, twinkle, little star
        How I wonder what you are
        """;
        int wordCount = countWords(text);
        System.out.println("Word Count: " + wordCount);

        // Count lines
        int noOfLines = countLines(text);
        System.out.println("Line Count: " + noOfLines);

        // Reverse string
        String reversedText = String.valueOf(ReverseString(text));
        System.out.println("Reversed Text: " + reversedText);

        // Remove duplicates
        String textWithoutDuplicates = RemoveDuplicates(text);
        System.out.println("Text Without Duplicates: " + textWithoutDuplicates);
    }
    private static int countWords(String text)
    {
        String[] words = text.split("\\s+");
        return words.length;
    }
    private static int countLines(String text)
    {
        String[] lines=text.split("\n");
        return lines.length;

    }
private static StringBuilder ReverseString(String text)
{
StringBuilder sb1=new StringBuilder(text);
sb1.reverse();
//System.out.println(sb1);
return sb1;

}
private static String RemoveDuplicates(String text)
{
    Set<Character> set = new LinkedHashSet<>();
    for (char c : text.toCharArray()) {
        set.add(c);
    }
    // Construct the string without duplicates
    StringBuilder result = new StringBuilder();
    for (char c : set) {
        result.append(c);
    }
    return result.toString();
}
}
