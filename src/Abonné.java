import java.util.Scanner;
public abstract class Abonné{
    protected String nom , phoneNumber;
    protected Adress adress;
    public static Scanner scanabo = new Scanner(System.in);
    
    public Abonné(String nom, String phoneNumber , Adress adress){
        this.nom = nom;
        this.phoneNumber = phoneNumber;
        this.adress = adress;
    }


public void Display(){
    System.out.println("Nom : "+ nom +" Phone Number : "+phoneNumber);
    adress.display();
}

public void Saisir(){
    System.out.println("Input the Name");
    this.nom = scanabo.nextLine();
    scanabo.nextLine();
    System.out.println("Input Phone Number");
    this.phoneNumber = scanabo.nextLine();
    adress.Saisir();
}

}