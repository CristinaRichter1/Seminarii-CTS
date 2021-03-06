package ro.csie.cts.g1088.modele;

import ro.csie.cts.g1088.exceptii.ExceptieFonduriInsuficiente;
import ro.csie.cts.g1088.exceptii.ExceptieTransferIlegal;

public abstract class Cont {
    public abstract double getBalanta();
    //public abstract void alimenteaza(Object valoare); //object e o valoare generica mai tarziu aflu daca e int, String, float etc
    public abstract void alimenteaza(Double valoare);
    public abstract void extrage(Double valoare) throws ExceptieFonduriInsuficiente;
    public abstract void transfer(Cont destinatie, Double valoare) throws ExceptieTransferIlegal;
}
