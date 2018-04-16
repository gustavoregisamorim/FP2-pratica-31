
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gustavo
 */
public class Pratica31 {

    private static Date inicio, fim;
    private static String meuNome;
    private static GregorianCalendar dataNascimento = new GregorianCalendar(1999, Calendar.JUNE, 27);
    private static GregorianCalendar dataAtual = new GregorianCalendar(); 
    

    public static void main(String[] args) {

        inicio = new Date();

        meuNome = "Gustavo Regis Amorim";

        System.out.println(meuNome.toUpperCase());

        System.out.println(meuNome.substring(14) + "," + meuNome.substring(0, 1).toUpperCase() + "." + meuNome.substring(8, 9).toUpperCase() + ".");    

        System.out.println((dataAtual.getTimeInMillis()-dataNascimento.getTimeInMillis())/86400000);

        fim = new Date();

        System.out.println(fim.getTime() - inicio.getTime());
    }
}