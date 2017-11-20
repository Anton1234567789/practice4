package ua.nure.sokolov.practice4.part1;

import ua.nure.sokolov.practice4.GetInputFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part1 {

    private GetInputFile classGetInputFile = new GetInputFile();
    public static void main(String[] args) {
        Part1 part1 = new Part1();
        System.out.println(part1.getWord());
    }

    public String getWord(){
        StringBuilder result = new StringBuilder("");
        String INPUT_FILE = classGetInputFile.getInput("part1.txt");

        String regexp = "(\\w+)(\\W+)";
        Pattern pattern = Pattern.compile(regexp, Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher  = pattern.matcher(INPUT_FILE);

        while (matcher.find()){
            if (matcher.group(1).length() > 3){
               result.append(matcher.group(1).toUpperCase()+ matcher.group(2));
            }else {
                result.append(matcher.group(1) + matcher.group(2));
            }
        }

        return String.valueOf(result);

    }

}
