package service;

import java.util.Scanner;

public class ScanBookID {
    public static String scanBookID(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ID of the book");
        return scanner.nextLine().trim();
    }
}
