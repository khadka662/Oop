package Assignment;


import java.util.Scanner;
public class Speed {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  length in meter:");
        float meter=sc.nextInt();
        System.out.println("Enter the time in hour:");
        float hour=sc.nextInt();
        System.out.println("Enter the time in minutes:");
        float min=sc.nextInt();
        System.out.println("Enter the time in second:");
        float sec=sc.nextInt();
        float Ajit= Ajit(meter,sec);
        float besh = besh(hour,meter);
        float ryan = rayn(meter,hour);

        System.out.println("The speed in meter/second is"+Ajit);
        System.out.println("The speed in kilometer/hour is"+besh);
        System.out.println("The speed in miles/hour is"+ryan);


    }

    private static float rayn(float meter, float hour) {
        return (meter/0.1069f)/hour;
    }

    private static float besh(float hour, float meter) {
        return (meter/1000)/hour;
    }

    public static float Ajit(float meter,float sec){
        return meter/sec;

    }
}

