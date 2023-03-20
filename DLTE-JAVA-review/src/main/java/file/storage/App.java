package file.storage;


import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.exit;


public class App {
    public static void main( String[] args ) throws IOException, ClassNotFoundException {
        Scanner scanner  = new Scanner(System.in);
        Student student = new Student();
        Address address = new Address();
        StudentImplements studentImplements = new StudentImplements();
        do {
            System.out.println("Student Details");
            System.out.println("Select the operation to be performed: \n 1.Add New Student Details\n 2.Display All students details\n 3.Exit");
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Enter the student Name");
                    student.setName(scanner.next());
                    System.out.println("Enter the student Register Number");
                    student.setReg_Num(scanner.nextInt());
                    System.out.println("Enter the student age");
                    student.setAge(scanner.nextInt());
                    System.out.println( "Enter the student EmailId");
                    student.setEmail(scanner.next());
                    System.out.println("Enter the Student addressDetails:");
                    System.out.println("area: ");
                    address.setArea(scanner.next());
                    System.out.println("landmark : ");
                    address.setLandmark(scanner.next());
                    System.out.println("City : ");
                    address.setCity(scanner.next());
                    System.out.println("PIN Code : ");
                    address.setPin(scanner.nextInt());
                    studentImplements.writeRecords(student);
                case 2:
                    System.out.println("All Student Details");
                    ArrayList<Student> studentArrayList = studentImplements.readRecords();
                    for (Student record : studentArrayList) {
                        System.out.println(record);
                    }
                case 3:
                    exit(0);
                default:
                    System.out.println("Invalid Input");
            }
        }while(true);
    }
}