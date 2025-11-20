public class AboProf extends Abonnement{
    public Person_morale Pmorale;

    public AboProf(Date datedeb){
        super(datedeb);
    }
    
    public void Display(){        
        Pmorale.Display();
        super.Display();
    }
}
