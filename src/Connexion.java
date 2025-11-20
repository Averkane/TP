import java.util.Scanner;

public class Connexion {
    private int tarif, duree;
    private Debit debit;
    private Type type;
    public static Scanner sc = new Scanner(System.in);
enum Debit {
    M10, M20, M50, M100
}

enum Type {
    ADSL, FIBRE
}

public Connexion(int tarif, int duree, Debit debit , Type type)
{
    this.tarif = tarif;
    this.duree = duree;
    this.debit = debit;
    this.type = type;
}

//Au besoins remove later

    public int getTarif(){
        return tarif;
    }
    /*
    public int getDuree(){
        return duree;
        }
    public Debit getDebit(){
        return debit;
        }
    public Type getType(){
        return type;
        }
    public void setTarif(int tarif)
        {
            this.tarif = tarif;
        }
    public void setDuree(int duree){
        this.duree = duree;
        }
    public void setDebit(Debit debit){
        this.debit = debit;
        }
    public void setType(Type type){
        this.type = type;
    }
*/
    public void Display(){
        System.out.println("Tarif : "+ tarif + " Duree : "+ duree);
        System.out.println("Debit : " + debit + " Connexion de type : " + type );
    }

    public void Saisir(){
        System.out.println("Enter tariff:");
        int t;
        do {
            t = sc.nextInt();
        } while (t < 0);
        this.tarif = t;
        System.out.println("Enter duration (months):");
        int d;
        do {
            d = sc.nextInt();
        } while (d <= 0);
        this.duree = d;
        System.out.println("Choose debit: 1-10M  2-20M  3-50M  4-100M");
        int deb;
        do {
            deb= sc.nextInt();
        } while (deb < 1 || deb > 4);
        this.debit = Debit.values()[deb-1];
        System.out.println("Choose Type of connexion 1-ADSL 2-Fibre");
        do{
            deb = sc.nextInt();
        }while(deb<1 && deb >2);
        this.type = Type.values()[deb-1];
    }
    public void Modifiy(){
        System.out.println("Modiy the Connexion");
        Saisir();
    }

}
