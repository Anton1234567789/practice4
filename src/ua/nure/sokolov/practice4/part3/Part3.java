package ua.nure.sokolov.practice4.part3;

import ua.nure.sokolov.practice4.GetInputFile;
import ua.nure.sokolov.practice4.TypeData;
import ua.nure.sokolov.practice4.part1.Part1;

import java.util.Scanner;

public class Part3 {

    private GetInputFile classGetIput = new GetInputFile();

    public static void main(String[] args) {
        Part3 part3 = new Part3();
        part3.getType();

    }

    public void getType(){
        String textOfpart2 = classGetIput.getInput("part3.txt");
//        System.out.println(textOfpart2);

        Scanner sc = new Scanner(System.in);
        String line;
        while (sc.hasNextLine()){
            line = sc.nextLine();
            if (line.equals("char")){
                for (int j = 0; j < textOfpart2.length(); j++){

                }
            }
            }
        }
}
