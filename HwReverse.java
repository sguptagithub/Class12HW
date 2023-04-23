package Class12HW;

public class HwReverse {
    public static void main(String[] args) {
    //Create a String and print it in reverse order (Sunday → yadnuS).
        String str = "Sunday";
        String reversedString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString += str.charAt(i);
        }
        System.out.println(reversedString);

    }
}
