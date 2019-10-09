package be.ifosupwavre.info.poo.sexa;

public class MainApp {
    public static void main(String[] args){
        var hour1 = new Sexagecimal(3.5);
        System.out.println(hour1.getHours() + ":" + hour1.getMinutes() + ":" + hour1.getSeconds() );

        var hour2 = new Sexagecimal(4,35,7);
        System.out.println(hour2.getDecimalHours());
        System.out.println(hour2.getHours() + ":" + hour2.getMinutes() + ":" + hour2.getSeconds());
    }
}
