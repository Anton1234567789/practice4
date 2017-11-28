package ua.nure.sokolov.practice4.part4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class Part4 implements Iterable<String> {

    final String filename;

    public Part4(String filename) {
        this.filename = filename;
    }

    public Iterator<String> iterator() {
        return new TextFileIterator();
    }

    class TextFileIterator implements Iterator<String> {

        BufferedReader in;

        String nextline;

        public TextFileIterator() {
            try {
                in = new BufferedReader(new FileReader(filename));
                nextline = in.readLine();
            } catch (IOException e) {
                throw new IllegalArgumentException(e);
            }
        }

        public boolean hasNext() {
            return nextline != null;
        }

        public String next() {
            try {
                String result = nextline;

                if (nextline != null) {
                    nextline = in.readLine();
                    if (nextline == null)
                        in.close();
                }

                return result;

            } catch (IOException e) {
                throw new IllegalArgumentException(e);
            }
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] args) {
        String filename = "part1.txt";
        if (args.length > 0) {
            filename = args[0];
        }

        for (String line : new Part4(filename))
            System.out.println(line);
    }
}
