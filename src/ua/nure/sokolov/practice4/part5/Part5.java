package ua.nure.sokolov.practice4.part5;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part5 {

    public static void main(String[] args) {

        Locale locale = new Locale("ru","RU");
        Locale locale1 = new Locale("en","EN");

        Scanner scanner = new Scanner(System.in);
        String sc = "";
        while (scanner.hasNext()){

            sc = scanner.next();
            Matcher matcher = Pattern.compile("(\\\\s+)?\\\\S+(\\\\s*)?").matcher(sc);
            if (sc.equals("stop")){
                System.exit(1);
            }
                ResourceBundle resourceBundle = ResourceBundle.getBundle("resources/resources", locale1);

                String st = resourceBundle.getString(sc);
                String s1 = null;
                try {
                    s1 = new String(st.getBytes("ISO-8859-1"), "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                System.out.println(s1);

        }
    }
}
