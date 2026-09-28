package LAB2;

class Time {
    public int hr;
    public int min;
    public int seconds;

    public Time() {
        hr = 3;
        min = 50;
        seconds = 40;
        display();
    }

    public Time(int hr, int min, int seconds) {
        if ((hr > 0 && hr < 24) && (min > 0 && min < 60) && (seconds > 0 && seconds < 60)) {
            this.hr = hr;
            this.min = min;
            this.seconds = seconds;
            display();
        } else {
            System.out.println("Invalid time");
        }

    }

    public void display() {
        System.out.println("Hours: " + hr + "h\nMinutes: " + min + "min\nSeconds: " + seconds + "sec\n");
    }
}

public class TimeRun {
    public static void main(String[] args){
        Time t1= new Time();
        Time t2= new Time(6,45,40);
        Time t3= new Time(25,40,79);
    }

}
