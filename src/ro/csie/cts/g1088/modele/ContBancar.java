package ro.csie.cts.g1088.modele;

public abstract class ContBancar extends Cont {//mostenesc metodele de la cont
    protected double balanta; //implementez balanta in ContBancar ca sa evit dry
    protected String iban;

    //ma fortez ca de fiecare data cand construiesc un cont
    //definesc un constructor care sa

    //Click dreapta > Generate > Constructor
    public ContBancar(double balanta, String iban) {
        this.balanta = balanta;
        this.iban = iban;
    }

    @Override //se scrie pentru supradefinire
    public double getBalanta() {
        return this.balanta;
    }
}
