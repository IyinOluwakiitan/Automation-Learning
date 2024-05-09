package src.basics_04_17Dec;

import java.util.Scanner;

public class Lab057 { // Usecase / real Life case of Lab 056
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Browser Name chrome, firefox, edge, opera");
        String browser = sc.nextLine();
        switch (browser.toLowerCase()){ //so that it won't be case sensitive
            case "chrome":
                System.out.println("Execute the chrome code");
                break;
            case "Firefox":
                System.out.println("Execute the Firefox code");
            case "edge":
                System.out.println("Execute the Edge code");
            case "opera":
                System.out.println("Execute the Opera code");
            default:
                System.out.println("I have no idea which browser this is");


        }
    }
}
