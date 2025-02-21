class Time1 {
    int hours;
    int minutes;

    public Time1(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public void addition(int hours1, int minutes1) {
        this.hours += hours1;
        this.minutes += minutes1;
        while (minutes > 59) {
            hours++;
            minutes -= 60;
        }
        System.out.println(hours+":"+minutes);
    }
}

public class Time {
    public static void main(String[] args) {
        Time1 t1 = new Time1(1, 35);
        t1.addition(2, 35);
        t1.addition(3, 45);
    }
}
