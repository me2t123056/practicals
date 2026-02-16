class Time {
    int hours;
    int minutes;
    public void setTime(int h, int m) {
        this.hours = h;
        this.minutes = m;
    }

    public void displayTime() {
        System.out.printf("%d:%02d%n", hours, minutes);
    }

    public void addTime(Time t1, Time t2) {
        int totalMinutes = t1.minutes + t2.minutes;
        int extraHours = totalMinutes / 60;
        this.minutes = totalMinutes % 60;
        this.hours = t1.hours + t2.hours + extraHours;
    }
}

public class Practical11 {
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time();
        Time t3 = new Time(); 

        t1.setTime(2, 45); 
        t2.setTime(3, 30); 

        t3.addTime(t1, t2);

        System.out.print("Time 1: ");
        t1.displayTime();

        System.out.print("Time 2: ");
        t2.displayTime();

        System.out.println("-----------------");
        System.out.print("Total Time: ");
        t3.displayTime();
    }
}