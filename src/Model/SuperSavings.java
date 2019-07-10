package Model;
import java.util.Calendar;

public class SuperSavings extends Savings{

    public SuperSavings(){
        super();
        month = Calendar.getInstance().get(Calendar.MONTH);
    }

    public String toString(){
        double wrapperBalance = balance;
        return "Current balance: " + wrapperBalance;
    }

    @Override
    public void updateAccount(){
        balance = (int) (balance + (balance * 0.025) - 100);
    }

}
