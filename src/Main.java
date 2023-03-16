import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String text = "malam";

        String temp = "";
        for(int i=text.length()-1; i>=0; i--){
            char c = text.charAt(i);
            temp += String.valueOf(c);
        }

        if (text.toLowerCase().equals(temp.toLowerCase())){
            System.out.println("Text adalah palindrom");
        }else{
            System.out.println("Text bukan palindrom");
        }
    }
}