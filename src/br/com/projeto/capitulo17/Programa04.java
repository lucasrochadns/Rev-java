package br.com.projeto.capitulo17;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Programa04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a folder path: ");
        String path = scanner.nextLine();
        try{
            File file = new File(path);
            File[] folders = file.listFiles(File::isDirectory);
            File[] files = file.listFiles(File::isFile);
            System.out.println("FOLDERS: ");
            for(File folder : folders){
                System.out.println(folder);
            }
            System.out.println("FILES: ");
            for(File files01 : files){
                System.out.println(files01);
            }
            // created directory
            boolean sucess = new File(path + "\\subdir").mkdir();
            System.out.println("Directory created " + sucess);
        }catch(Exception message){
           message.printStackTrace();
        }
    }
}
