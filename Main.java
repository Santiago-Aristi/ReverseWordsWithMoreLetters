public class Main {
    public static void main(String[] args) {
        String newString = "You can write this function that is supercalifragilisticexpialidocious";
        System.out.println(reverseWordsThatAreLongerThanFiveLetters(newString));
    }

    public static String reverseWordsThatAreLongerThanFiveLetters(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arrayOfWords = s.split(" ");

        StringBuilder sbReversed = new StringBuilder();
        for (String word : arrayOfWords) {
            if (word.length() > 4) {
                sbReversed.append(word).reverse().append(" ");
                sb.append(sbReversed);
                sbReversed.setLength(0);
            } else {
                sb.append(word).append(" ");
            }
        }
        return sb.toString();
    }
}