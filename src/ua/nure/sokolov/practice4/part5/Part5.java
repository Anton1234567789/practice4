package ua.nure.sokolov.practice4.part5;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Part5 {

    public static void main(String[] args) {
        Part5 part5 = new Part5();
        part5.getValueFromPropertiesFiles();
    }

    private void getValueFromPropertiesFiles(){
        Scanner scanner = new Scanner(System.in);
        String sc = "";
        while (scanner.hasNext()){
            sc = scanner.nextLine();
            String[] strSplit = sc.split(" ");
            if (sc.equals("stop")){
                scanner.close();
                System.exit(1);
            }

            ResourceBundle resourceBundle = ResourceBundle.getBundle("resources/resources", Locale.forLanguageTag(strSplit[1]));

            String st = resourceBundle.getString(strSplit[0]);
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
