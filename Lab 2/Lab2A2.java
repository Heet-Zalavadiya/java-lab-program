import java.util.Scanner;
        public class Lab2A2{
        	public static void main(String[] args){
        		Scanner sc = new Scanner(System.in);
        		System.out.println("Basic calculation of two numbers");
        		System.out.println("Enter a string operator:");
        		String str = sc.nextLine();
        		System.out.println("Enter a number1 : ");
        		int a = sc.nextInt();
        		System.out.println("Enter a number2:  ");
        		int b = sc.nextInt();

        		if (str.equals("+")) {
        			System.out.println(a + "+" + b + "="+ (a+b));
        		}
        		else if(str.equals("-")){
        			System.out.println(a + "-" + b + "="+ (a-b));
        		}
        		else if(str.equals("x")){
        			System.out.println(a + "x" + b + "=" + (a*b));
        		}
        		else if(str.equals("/")){
        			System.out.println(a + "/" + b + "=" + (a/b));
        		}
        		else{
        			System.out.println("Out of memeory");
        		}
				sc.close();

        	}
        }
