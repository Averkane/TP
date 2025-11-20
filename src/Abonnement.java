import java.util.Scanner;

public class Abonnement {
    protected Date datedeb,datefin; //Check if i should put it private
    protected Date datepaiement;
    protected Connexion connexion;
    protected boolean Resiliated = false;
    public static Scanner scanabonnement = new Scanner(System.in);
    public Abonnement(Date datedeb){
    	this.datedeb = datedeb;
        this.datepaiement = datedeb;
        this.datefin = null;
        this.Resiliated = false;
    }
    
    public void Saisir() {
        connexion.Saisir();
        datedeb.Saisir();
    }
    public void Display() {
    	connexion.Display();
        System.out.print("Date of the beggining of the subscription : ");datedeb.Display();
    	System.out.print("Date of last paiement : ");datepaiement.Display();
        if(Resiliated != false){
            System.out.println("Date of end of the substription : ");datefin.Display();
        }
    	System.out.println("--------------------------------------------------------------");
    }
    
    public void setnewpaiementdate(){
        System.out.println("Input the new Date of last paiement");
        datepaiement.Saisir();
    }
    

    public void Resiliate() {
    	System.out.println("Input a date of Resignation");
        datefin.Saisir();
    }
}
