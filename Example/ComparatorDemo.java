import java.util.*;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class AgeComparator implements Comparator<Object> {
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;
        if (s1.age == s2.age)
            return 0;
        else if (s1.age > s2.age)
            return 1;
        else
            return -1;
    }
}

public class ComparatorDemo {
    public static void main(String args[]) {
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student("Vijay", 23));
        al.add(new Student("Ajay", 27));
        al.add(new Student("Jai", 21));
        System.out.println("Sorting by age");
        Collections.sort(al, new AgeComparator());
        Iterator<Student> itr2 = al.iterator();
        while (itr2.hasNext()) {
            Student st = (Student) itr2.next();
            System.out.println(st.name + " " + st.age);
        }
    }
}