package ro.csie.cts.g1088.modele;

import ro.csie.cts.g1088.exceptii.ExceptieFonduriInsuficiente;
import ro.csie.cts.g1088.exceptii.ExceptieTransferIlegal;
import ro.csie.cts.g1088.interfete.Profitabil;

public class ContDepozit extends ContBancar implements Profitabil {

    public static final double BALANTA_MINIMA = 100;

    public ContDepozit(String iban) {
        super(BALANTA_MINIMA, iban);
    }

    @Override
    public void alimenteaza(Double valoare) {
        this.balanta += valoare;
    }

    @Override
    public void extrage(Double valoare) throws  ExceptieFonduriInsuficiente{
        if(this.balanta < valoare){
                throw new ExceptieFonduriInsuficiente("Nu ai bani");
            }
        else {
            this.balanta -= balanta;
        }
    }

    @Override
    public void transfer(Cont destinatie, Double valoare) throws ExceptieTransferIlegal {
        if (this == destinatie) throw new ExceptieTransferIlegal();
        try {
            this.extrage(valoare);
        } catch (ExceptieFonduriInsuficiente exceptieFonduriInsuficiente) {
            exceptieFonduriInsuficiente.printStackTrace();
        }
        destinatie.alimenteaza(valoare);
    }

    @Override
    public void adaugaDobanda(double procentDobanda) {
        this.balanta *= (1+ procentDobanda/100);
    }
}
