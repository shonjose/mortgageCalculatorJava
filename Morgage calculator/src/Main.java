public class Main {
    public static void main(String[] args) {

        //Read values from user
        int principal = (int)ReadValue.mortgageValue("Enter Principal Amount($1K - $1M): ", 1000, 1000000);
        float rateOfInt = (float)ReadValue.mortgageValue("Enter rate of interest: ", 0.1, 30);
        short year = (short)ReadValue.mortgageValue("Enter Number Of Years: ", 10, 30);
        int month = year * 12;

        //Assign read values to methods
        var mortgage = new Mortgage(principal, rateOfInt, month);
        var report = new MortgagePrint(mortgage);

        //Printing monthly payment and balance after each payment,
        report.printMort();
        report.printBalance();


    }
}







