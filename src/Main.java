public class Main {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756,-3.176) ? "The first three decimals are Matching"
                        : "The first three decimals do not match");
    }

    public static boolean areEqualByThreeDecimalPlaces(double Number1 , double Number2){
        int scale1 = (int) (Number1 * 1000);
        int scale2 = (int) (Number2 * 1000);

        return scale1 == scale2;
    }
}