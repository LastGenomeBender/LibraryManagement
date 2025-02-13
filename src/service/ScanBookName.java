package service;

import java.util.Scanner;

public class ScanBookName {
    public static String scanBookName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the book");
        return scanner.nextLine().trim();
    }
}
