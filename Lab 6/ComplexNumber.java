/*Define class for Complex number with real and imaginary as data members. Create its 
constructor, overload the constructors. Also define addition method to add two 
complex objects.*/

class ComplexNo {
    int real;
    int imaginary;

    ComplexNo() {
        this.real = 0;
        this.imaginary = 0;
    }

    ComplexNo(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void addition(ComplexNo c) {
        int newReal = this.real + c.real;
        int newImaginary = this.imaginary + c.imaginary;

        if (newImaginary >= 0) {
            if (imaginary >= 0) {
                System.out.println(newReal + " + " + newImaginary + "i");
            } else {
                System.out.println(newReal + " - " + (-newImaginary) + "i");
            }
        }
    }
}

public class ComplexNumber {
    public static void main(String[] args) {
        ComplexNo c1 = new ComplexNo(3, 3);
        ComplexNo c2 = new ComplexNo(1, 2);

        c1.addition(c2);
    }
}
