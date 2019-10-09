package be.ifosupwavre.info.poo.sexa;

public class Sexagecimal {
    private double decimalHours;
    private int hour;
    private int minutes;
    private int seconds;

    public Sexagecimal(double decimalHours) {
        this.hour = (int)decimalHours;
        double decimalMinutes = (decimalHours-hour)*60;
        this.minutes = (int) decimalMinutes;
        this.seconds = (int) ((decimalMinutes-minutes)*60);
    }

    public Sexagecimal(int hours, int minutes, int seconds) {
        this.hour = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours(){
        return this.hour;
    }

    public int getMinutes(){
        return this.minutes;
    }

    public int getSeconds(){
        return this.seconds;
    }

    public double getDecimalHours(){
        return hour + (double)minutes/60 + (double)seconds/3600;
    }
}
