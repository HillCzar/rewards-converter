public class RewardValue {
    private double cashValue;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    // Constructors
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    // Getters
    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return convertToMiles(this.cashValue);
    }

    // Methods
    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    private static double convertToCash(int milesValue) {
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }
}
