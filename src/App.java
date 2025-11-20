
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        /*
        Connexion.Type type = Connexion.Type.ADSL;
        System.out.println(type);
        Date date = new Date(0, 0, 0);
        date.Saisir();
        date.Display();
        Connexion connexion = new Connexion(5, 10, Connexion.Debit.values()[0], Connexion.Type.ADSL);
        */
        Adress adressCnas = new Adress(8, "Hamid bouaelm", 5188 , "Alger");
        Person_morale CNAS = new Person_morale("Cnas","063784935757" , adressCnas, "07389157", "SPA");
        CNAS.Display();
    }
}
