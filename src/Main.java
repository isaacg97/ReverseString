import java.util.*;
public class Main {
    public static void main(String[] args) {

       String str = "Octopus";
       String reverseStr = "";

       char [] strArray = str.toCharArray();

       for (int i = strArray.length - 1; i >= 0; i--) {
           reverseStr = reverseStr + strArray[i];
       }
        System.out.println(reverseStr);
    }
}