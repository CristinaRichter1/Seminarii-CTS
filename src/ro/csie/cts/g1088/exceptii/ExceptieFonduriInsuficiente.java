package ro.csie.cts.g1088.exceptii;

//constructor
public class ExceptieFonduriInsuficiente extends Exception {
    //exceptie custom

    //constructor cu parametrii
    public ExceptieFonduriInsuficiente(String mesaj){
        super(mesaj); //super e clasa de baza
    }

    public ExceptieFonduriInsuficiente(){

    }
}
