package ro.csie.cts.g1088.interfete;

public interface Profitabil {

    //interfata clasa abstracta care contine doar metode constante sau contin cel putin o metoda abstracta
    //public abstract /*abstract se subintelege se poate sa nu o scrii*/ void adaugaDobanda();
    //final = constant Pentru o clasa final nu mai poate fi derivata. clasa e incapsulata
    //final pentru metode inseamna ca nu o putem supradefini mai tarziu. O mostenesti si gata.
    public static final int MAX_PROCENT_DOBANDA = 5;
    public abstract void adaugaDobanda(double procentDobanda);
}
