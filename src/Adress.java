import java.util.Scanner;

public class Adress {
    
    private int num_rue, CP;
    private String ville , nom_rue;
    public Scanner scanadress = new Scanner(System.in);
    public Adress (int num_rue , String nom_rue , int CP , String ville)
    {
        this.num_rue = num_rue;
        this.nom_rue = nom_rue;
        this.CP = CP;
        this.ville = ville;

    }
    public void display(){
        System.out.printf("Adress : %d %s CP: %d City : %s \n" ,num_rue,nom_rue,CP , ville);
    }
    public void Saisir(){
        System.out.println("Input Street Number");
        this.num_rue = scanadress.nextInt();
        scanadress.nextLine();
        System.out.println("Input Name of Steet");
        this.nom_rue = scanadress.nextLine();
        System.out.println("Input Name of City");
        this.ville = scanadress.nextLine();
        System.out.println("Input Postal Code");
        this.CP = scanadress.nextInt();
        scanadress.nextLine();

        
    }
    /*Au besoin
    public void setter(int num_rue , String nom_rue , int CP , String ville) {
   		this.num_rue = num_rue;
        this.nom_rue = nom_rue;
        this.CP = CP;
        this.ville = ville;
    	}
        
    public int get_CP(){
        return CP;
    }
    */
    
}
