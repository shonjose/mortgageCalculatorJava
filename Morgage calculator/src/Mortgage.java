public class Mortgage {

    private int principal;
    private float rateOfInt;
    private int month;
    public Mortgage(int principal, float rateOfInt, int month) {
        this.principal = principal;
        this.rateOfInt = rateOfInt;
        this.month = month;
    }

    //Calculating the monthly payment
    public double mortgageCalculator() {

        return principal * ((getMonthInt() * Math.pow((1 + (getMonthInt())), month)) / (Math.pow((1 + (getMonthInt())), month) - 1));
    }

    //Calculating the remaining balance
    public  double mortBalance(double numberOfPaymentsMade){
        double balance = (principal *
                (Math.pow((1 + getMonthInt()), month) - Math.pow((1 + getMonthInt()), numberOfPaymentsMade)))/
                (Math.pow((1 + getMonthInt()), month)-1);
        return balance;
    }

    private float getMonthInt() {
        return (rateOfInt / 100) / 12;
    }
    public int getMonth() {
        return month;
    }
}
