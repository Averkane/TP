import java.util.Scanner;

public class Person_morale extends Abonné {
    public static Scanner scanmoral = new Scanner(System.in);
    private String NRC;
    private String RaisonSociale; // SPA EURL SARL
    public Person_morale(String nom , String phoneNumber , Adress adress , String NRC, String RaisonSociale)
    {
        super(nom, phoneNumber, adress);
        this.NRC = NRC;
        this.RaisonSociale = RaisonSociale;
    }
    public void Display(){
        System.out.println("----------------------------------------------");
        System.out.println("NRC : "+ NRC + " Raison Sociale : "+RaisonSociale);
        super.Display();
        System.out.println("----------------------------------------------");
    }
    public void SAISIR(){
    System.out.println("Input NRC");
    this.NRC = scanmoral.nextLine();
    System.out.println("Input Raison Social");
    this.RaisonSociale = scanmoral.nextLine();
    super.Saisir();
    }
}
