package Strategy;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Dia{
    int dia;
    int mes;
    int ano;
    int day;
    Estrategia strategy;

    public Dia(int d, int m, int a){
        Calendar cal = new GregorianCalendar(d,m,a);
        day = cal.get(Calendar.DAY_OF_WEEK);
    }

    public void DefinirEstrategia(){
        if(day>=0 && day<5){
            strategy = new DiadaSemana();
        }
        else if(day==5){
            strategy = new Sexta();
        }
        else if(day>5){
            strategy = new FinaldeSemana();
        }
    }

    public void action(){
        strategy.DiaDaSemana();
    }
}