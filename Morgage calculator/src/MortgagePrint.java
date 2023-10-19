import java.text.NumberFormat;

public class MortgagePrint {

    private Mortgage mortgage;

    public MortgagePrint(Mortgage mortgage) {
        this.mortgage = mortgage;
    }

    //Iteration to print.
    public void printMort(){
        System.out.println("               ");
        System.out.println("Monthly Payment");
        System.out.println("---------------");
        System.out.println(NumberFormat.getCurrencyInstance().format(mortgage.mortgageCalculator()));
    }

    public void printBalance(){
        System.out.println("                 ");
        System.out.println("Remaining Balance");
        System.out.println("-----------------");
        for(short currentMonth = 1; currentMonth <= mortgage.getMonth() ; currentMonth ++ ){
            double balancAmount = mortgage.mortBalance(currentMonth);
            System.out.println(NumberFormat.getCurrencyInstance().format(balancAmount));
        }
    }
}
