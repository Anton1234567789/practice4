package ua.nure.sokolov.practice4.part2;

import ua.nure.sokolov.practice4.GetInputFile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Part2 {

    private GetInputFile classGetIput = new GetInputFile();
    private int[] array = new int[10];
    private final String NAME_CREATE_FILE = "part2.txt";
    private final String NAME_READ_CREATED_FILES = "part2(1).txt";

    public static void main(String[] args) {
        Part2 part2 = new Part2();
        part2.createFile();
    }


    public void createFile(){

        for (int i = 0; i < array.length; ++i)
            array[i] = (int) (Math.random()*50);
        System.out.print("input ==> ");

        createFilePart2(NAME_CREATE_FILE, array);

        int[] arr1 = readFile(NAME_CREATE_FILE);

        bubbleSort(arr1);
        System.out.print("output ==> ");
        createFilePart2(NAME_READ_CREATED_FILES, arr1);

        readFile(NAME_READ_CREATED_FILES);
    }


    public void createFilePart2(String nameTxt, int[] fileArray){

        try(PrintWriter out = new PrintWriter(new FileOutputStream(nameTxt))) {

            for (int i = 0; i < fileArray.length; ++i)
            {
                final String s = Integer.toString(fileArray[i]);
                out.write(s);
                out.write(" ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public int[] readFile(String nameFile){
        String textOfPart2 = classGetIput.getInput(nameFile);
        System.out.println(textOfPart2);
        String[] str = textOfPart2.split(" ");
        int[] arr = new int[10];
        for (int j = 0; j < str.length; j++){
            arr[j] = Integer.parseInt(str[j]);
        }

        return arr;
    }


    public void bubbleSort(int[] arr){
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            if( arr[j] > arr[j+1] ){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
                }
            }
        }
    }


}
