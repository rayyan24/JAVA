import java.util.Scanner;
public class _5_badWord {
  static String removeBadWord(String str) {
    String badWords[] = { "fool", "idiot", "stupid" };
    String replacement = "";
    for (String word : badWords) {
      for (int i = 1; i <= word.length(); i++) {
        replacement = replacement.concat("#");
      }

      str = str.replace(word, replacement);
    }
    return str;
  }
  public static void main(String[] args) {
    String unstr = " ";
    String cnstr = " ";
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a string to censor");
    unstr = input.nextLine();
    cnstr = removeBadWord(unstr.toLowerCase());
    System.out.println(cnstr);
    input.close();
  }
}