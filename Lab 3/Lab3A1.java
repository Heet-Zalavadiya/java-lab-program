import java.util.Scanner;
public class Lab3A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of student in subject 1:");
        int a = sc.nextInt();
        System.out.println("Enter marks of student in subject 2:");
        int b = sc.nextInt();
        System.out.println("Enter marks of student in subject 3:");
        int c = sc.nextInt();
        System.out.println("Enter marks of student in subject 4:");
        int d = sc.nextInt();
        System.out.println("Enter marks of student in subject 5:");
        int e = sc.nextInt();
        
        int total_marks = a+b+c+d+e;

        double percentage =(total_marks/500.0)*100;


        if ( percentage>=60) {
            System.out.println("Student got First Class");
            System.out.println("Total Marks =" + total_marks);
            System.out.println("Percentage =" + percentage);
        }
        else if (percentage>=50) {
            System.out.println("Student got Second Class");
            System.out.println("Total Marks =" + total_marks);
            System.out.println("Percentage =" + percentage);
        }
        else if(percentage>=40){
            System.out.println("Student got Third Class");
            System.out.println("Total Marks =" + total_marks);
            System.out.println("Percentage =" + percentage);
        }
        else {
            System.out.println("Student Failed");
            System.out.println("Total Marks =" + total_marks);
            System.out.println("Percentage =" + percentage);
        }

        sc.close();
    }
}
