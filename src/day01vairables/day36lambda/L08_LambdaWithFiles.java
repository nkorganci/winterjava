package day01vairables.day36lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class L08_LambdaWithFiles {
    /*
    1-Stream<String> lines(Path path)-->Read all lines from a file as a Stream, Returns: the lines from the file as a Stream

     */

    //1- How to read a file by using functional programming
    public static void main(String[] args) {
        try {
            Files.lines(Paths.get("C:\\Users\\nuri.korganci\\IdeaProjects\\winterjava\\src\\day36\\lambdafile.txt")).
                    forEach(t -> System.out.println(t));
        } catch (IOException e) {
            System.out.println("I could not read the file" + e.getMessage());
        }

    }//Stream<String> lines(Path path), Read all lines from a file as a Stream. Returns: the lines from the file as a Stream

    //2- Convert all characters to upper case then read it
    public static void upperCase() {
        try {
            Files.lines(Paths.get("C:\\Users\\nuri.korganci\\IdeaProjects\\winterjava\\src\\day36\\lambdafile.txt")).
                    map(String::toUpperCase).forEach(t -> System.out.println(t));
        } catch (IOException e) {
            System.out.println("I could not read the file" + e.getMessage());
        }
    }

    //3- Check if the file has the word "Lambda"
    public static void hasLambda() {
        try {
            boolean result = Files.lines(Paths.get("C:\\Users\\nuri.korganci\\IdeaProjects\\winterjava\\src\\day36\\lambdafile.txt")).
                    anyMatch(t -> t.contains("Lambda"));
            System.out.println(result);
        } catch (IOException e) {
            System.out.println("I could not read the file" + e.getMessage());
        }
    }

    //4- Check if the file has the word "NUMBER" ignor cases
    public static void hasNumber() {
        try {
            boolean result = Files.lines(Paths.get("C:\\Users\\nuri.korganci\\IdeaProjects\\winterjava\\src\\day36\\lambdafile.txt")).
                    map(t -> t.toUpperCase()).anyMatch(t -> t.contains("NUMBER"));
            System.out.println(result);
        } catch (IOException e) {
            System.out.println("I could not read the file" + e.getMessage());
        }
    }

    //5- Print all distinct words in the text on the console.
    public static void printAllWords() {
        try {
            Files.lines(Paths.get("C:\\Users\\nuri.korganci\\IdeaProjects\\winterjava\\src\\day36\\lambdafile.txt")).
                    map(t -> t.split("")).flatMap((Arrays::stream)).map(t -> t.replaceAll("\\W", "")).distinct().forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("I could not read the file" + e.getMessage());
        }
    }

    //6- Print all words which contain "e" in the words.
    public static void printAllWordsContainE() {
        try {
            Files.lines(Paths.get("C:\\Users\\nuri.korganci\\IdeaProjects\\winterjava\\src\\day36\\lambdafile.txt")).
                    map(t -> t.split("")).flatMap((Arrays::stream)).map(t -> t.replaceAll("\\W", "")).filter(t->t.contains("e")).forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("I could not read the file" + e.getMessage());
        }
    }

}
