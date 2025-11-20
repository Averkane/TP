import java.util.Scanner;

public class Person_physique extends Abonné {
    private String NPI;
    private Date dateNaissance;
    public static Scanner scanphysique = new Scanner(System.in);
    public Person_physique(String nom , String phoneNumber , Adress adress , String NPI, Date dateNaissance)
    {
        super(nom, phoneNumber, adress);
        this.NPI = NPI;        
        this.dateNaissance = dateNaissance;
    }
    public void Display() {
    System.out.print("NPI : "+NPI+ " Date de Naissance" );dateNaissance.Display();
    super.Display();
    
    }
    public void Saisir() {
    	System.out.println("Input the NPI");
    	this.NPI = scanphysique.nextLine();
    	System.out.println("Input The Date of Birth");
    	dateNaissance.Saisir();
    	super.Saisir();
    	}
    
    	
}
