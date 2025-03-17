// Declare a class called Student having following data members:id_no, 
// no_of_subjects_registered, subject_code, subject_credits, grade_obtained and spi. 
// Define constructor and calculate_spi methods. Define main to instantiate an array for 
// objects of class student to process data of n students to be given as command line 
// arguments

import java.util.Scanner;

class Student {
    int id_no;
    int no_of_subjects_registered;
    int[] subject_code;
    int[] subject_credits;
    int[] grade_obtained;
    double spi;

    Student(int id_no, int no_of_subjects_registered) {
        this.id_no = id_no;
        this.no_of_subjects_registered = no_of_subjects_registered;
        subject_code = new int[no_of_subjects_registered];
        subject_credits = new int[no_of_subjects_registered];
        grade_obtained = new int[no_of_subjects_registered];
    }

    double calculate_spi() {
        int totalCredits = 0;
        int totalPoints = 0;
        for (int i = 0; i < no_of_subjects_registered; i++) {
            totalCredits += subject_credits[i];
            totalPoints += subject_credits[i] * grade_obtained[i];
        }
        spi = (double) totalPoints / totalCredits;
        return spi;
    }
}


public class Student_spi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int s = sc.nextInt();
        Student[] students = new Student[s];
        for (int i = 0; i < s; i++) {
            System.out.println("Enter student id : ");
            int id = sc.nextInt();

            System.out.println("Enter no of subject registered: ");
            int sub = sc.nextInt();

            students[i] = new Student(id, sub);

            for (int j = 0; j < sub; j++) {
                System.out.println("Enter subject code of sub "+ (j+1) + " :");
                students[i].subject_code[j] = sc.nextInt();
                System.out.println("Enter subject_credits of sub "+ (j+1) + " :");
                students[i].subject_credits[j] = sc.nextInt();
                System.out.println("Enter grade_obtained of sub "+ (j+1) + " :");
                students[i].grade_obtained[j] = sc.nextInt();
                
            }
            double spi = students[i].calculate_spi();
            System.out.println("SPI of student " + id + " is " + spi);
        }
        sc.close();

    }
}
