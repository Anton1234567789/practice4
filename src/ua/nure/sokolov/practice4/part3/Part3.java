package ua.nure.sokolov.practice4.part3;

import ua.nure.sokolov.practice4.GetInputFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part3 {

    private GetInputFile classGetInput = new GetInputFile();

    public static void main(String[] args) {
        Part3 part3 = new Part3();
        String in = "Int";
        String ch = "Char";
        String st = "String";
        String db = "Double";
        System.out.println(part3.convert(in, part3.getFile()));
        System.out.println(part3.convert(ch, part3.getFile()));
        System.out.println(part3.convert(st, part3.getFile()));
        System.out.println(part3.convert(db, part3.getFile()));

    }

    public String[] getFile() {
        String textOfPart3 = classGetInput.getInput("part3.txt");
        String[] text = textOfPart3.split("\\s");
        return text;
    }

    public String convert(String type, String[] arrText){
        final String INT = "(^|\\s)(\\d+)(\\s|$)";
        final String CHAR = "(^|\\s)\\w(\\s|$)";
        final String DOUBLE = "(^|\\s)([\\d+]*\\.\\d+)(\\s|$)";
        final String STRING ="[\\D]{2,}";
        StringBuilder sb = new StringBuilder();
        if (type.equals("INT") || type.equals("Int") || type.equals("int")) {
            Pattern pattern = Pattern.compile(INT, Pattern.UNICODE_CHARACTER_CLASS);
            for (int j = 0; j < arrText.length; j++) {
                Matcher matcher = pattern.matcher(arrText[j]);
                while (matcher.find()) {
                    sb.append(arrText[j] + " ");
                }
            }
        }else if (type.equals("Char") || type.equals("CHAR") || type.equals("char")){
            Pattern pattern = Pattern.compile(CHAR, Pattern.UNICODE_CHARACTER_CLASS);
            for (int j = 0; j < arrText.length; j++) {
                Matcher matcher = pattern.matcher(arrText[j]);
                while (matcher.find()) {
                    sb.append(arrText[j] + " ");
                }
            }
        }else if (type.equals("STRING") || type.equals("String") || type.equals("string")){
            Pattern pattern = Pattern.compile(STRING, Pattern.UNICODE_CHARACTER_CLASS);
            for (int j = 0; j < arrText.length; j++) {
                Matcher matcher = pattern.matcher(arrText[j]);
                while (matcher.find()) {
                    sb.append(arrText[j] + " ");
                }
            }
        }else if (type.equals("Double") || type.equals("DOUBLE") || type.equals("double")){
            Pattern pattern = Pattern.compile(DOUBLE, Pattern.UNICODE_CHARACTER_CLASS);
            for (int j = 0; j < arrText.length; j++) {
                Matcher matcher = pattern.matcher(arrText[j]);
                while (matcher.find()) {
                    sb.append(arrText[j] + " ");
                }
            }
        }
        return sb.toString();
    }

}

