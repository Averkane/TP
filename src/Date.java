import java.util.Scanner;

public class Date {
    private int day,month,year;
    public static Scanner scandate = new Scanner(System.in);
    public Date(int day , int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public void Set_Date(int day , int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void Saisir(){
        do{
        System.out.println("Input day (1-31)");
        this.day = scandate.nextInt();
        }while(this.day < 1 || this.day > 31);
        do{
        System.out.println("Input month (1-12)");
        this.month = scandate.nextInt();
        }while(this.month < 1 || this.month > 12);
        System.out.println("Input year");
        this.year = scandate.nextInt();

    };
    public void Display(){
        System.out.printf("%d/%d/%d\n" ,day,month,year);
    }

}