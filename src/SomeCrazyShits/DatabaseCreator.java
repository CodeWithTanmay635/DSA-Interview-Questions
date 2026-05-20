package SomeCrazyShits;

import java.io.*;
import java.util.Scanner;

public class DatabaseCreator {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String dbName;
        System.out.println("----------------------------------------------------------Manage-Databases----------------------------------------------------------------------");

        boolean exit = true;
        while(exit) {
            System.out.println("Enter your choice 1-5 :");
            menu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("-----------Databases-----------");
                    System.out.println(runQuery("SHOW DATABASES"));
                    break;
                case 2:
                    System.out.println("-----------Create Database-----------");
                    System.out.println("Enter Database Name:");
                    dbName = sc.nextLine();
                    runQuery("CREATE DATABASE " + dbName + ";");
                    runQuery("USE " + dbName + ";");
                    System.out.println("Database CREATED Successfully");
                    break;
                case 3:
                    System.out.println("-----------Create Table-----------");
                    System.out.println("Enter Table Name:");
                    String tableName = sc.nextLine();
                    runQuery("CREATE TABLE " + tableName + ";");
                    System.out.println("Table CREATED Successfully");
                    break;
                case 4:
                    System.out.println("-----------Delete Database-----------");
                    System.out.println("Enter Database Name :");
                    dbName = sc.nextLine();
                    runQuery("DROP DATABASE IF EXISTS " + dbName + ";");
                    break;
                case 5:
                    exit = false;
                    break;
                default:
                    System.out.println("You Choose Invalid Option try again.......");
            }

        }
    }
    public static String runQuery(String query) throws IOException{
        ProcessBuilder ps = new ProcessBuilder("mysql",
                "-u","root",
                "-p@Tanu0089",
                "-e",query
        );
        ps.redirectErrorStream(true);
        Process process = ps.start();
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        StringBuilder output = new StringBuilder();
        String line;
        while ((line = reader.readLine())!= null){
            if(line.contains("Warning"))continue;
            output.append(line).append("\n");
        }
        return output.toString();
    }
    public static void menu(){
        System.out.println("1. View Database");
        System.out.println("2. Create Database");
        System.out.println("3. Create Table");
        System.out.println("4. Delete Database");
        System.out.println("5. Exit");
    }
}