
public class Metropolis {
    public static void main(String args[]) {
        boolean isCaptialCity = false;
        int numberOfCitizen = 200000;
        double taxPerCitizen = 430.0;

        boolean isMetrop = isMetropolis(isCaptialCity, numberOfCitizen, taxPerCitizen);
        System.out.println(isMetrop?"City is a Metropolis":"City is not a Metropolis");

    }

    public static boolean isMetropolis(boolean isCapitalCity, int numberOfCitizen,
                                double taxPerCitizen) {
        if (isCapitalCity && numberOfCitizen >= 100000 ||
                numberOfCitizen >= 200000 &&
                numberOfCitizen*taxPerCitizen*12 > 720000000) {
            return true;
        }else {
            return false;
        }
    }
}