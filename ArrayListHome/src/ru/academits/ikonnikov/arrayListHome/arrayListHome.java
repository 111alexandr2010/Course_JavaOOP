package ru.academits.ikonnikov.arrayListHome;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class arrayListHome {
    public static void main(String[] args)  {
        try {
            Scanner scanner = new Scanner(new FileInputStream("C:\\Users\\Александр\\IdeaProjects\\ru.academits\\src\\Course_JavaOOP\\res\\input.txt"));
            ArrayList<String> list = new ArrayList<>();

            do {
                list.add(scanner.next());
            } while (scanner.hasNext());

            System.out.println(list);

        } catch (FileNotFoundException e ){
            e.getMessage();
        }
    }
}
