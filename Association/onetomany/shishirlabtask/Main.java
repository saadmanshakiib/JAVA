package shishirlabtask;
import java.util.Scanner;
public class Main {
    public static void main(String[] arsg){
        try(Scanner in = new Scanner(System.in)){
        Book b1 = new Book("Let Us C","Saadman");
        Book b2 = new Book("Tech Yourself C","Nissan");
        Book b3 = new Book("JAVA Programming","Dr. Alif");
        Book b4 = new Book("Web Development","Dr.Sakib");
        Book b5 = new Book("JavaScript For Beginners","Rakib Rana");



            Library l1 = new Library(10);
            l1.insertbook(b1);
            l1.insertbook(b2);
            l1.insertbook(b3);
            l1.insertbook(b4);
            l1.insertbook(b5);


            System.out.println("Welcome to Our Library Management System");
            System.out.println("1.Show Available Books ");
            System.out.println("2.Insert A New Book ");
            System.out.println("3.Show A Book ");
            System.out.println("4.Delete A Book ");
            System.out.println("5.Search A Book By Name");
            System.out.println("0.Exit");
            System.out.println();
            int input = in.nextInt();
            if(input == 1){
                    l1.print();
                    System.out.println();
            }
            else if(input==2){
                    Book b6 = new Book("Bangla Coding ","Ariful");
                    l1.insertbook(b6);
                    Book b7 = new Book("OOP C++","Niton");
                    l1.insertbook(b7);
                    l1.print();
                   }
            else if(input==3){
                l1.print(); 
            }
            else if(input==4){
                l1.DeleteBook(b3);
                l1.print();
            }
            else if(input == 5){
                l1.search(b2);
            }
            else if(input == 0){
                System.exit(0);
        }

           }
        }
            }
    
    

