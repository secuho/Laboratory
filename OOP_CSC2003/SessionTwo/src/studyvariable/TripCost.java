package studyvariable;

public class TripCost {
    public static void main(String[] args) {
        final int FUEL_PRICE = 1650;

        int distanceKm = 123;
        float efficiencyF = 13.5f; // efficiency 연비
        double efficiencyD = 13.5;

        double litersByFloat = distanceKm / efficiencyF; // 사용량
        double litersByDouble = distanceKm / efficiencyD;

        double costByFloat = litersByFloat * FUEL_PRICE; // total Value
        double costByDouble = litersByDouble * FUEL_PRICE;

        String status;
        if (costByDouble > 0) {
            status = "OK";
        } else {
            status = "ERROR";
        }

        int roundedByFloat = (int)(costByFloat + 0.5);
        int roundedByDouble = (int)(costByDouble + 0.5);

        long roundedByFloat2 = Math.round(costByFloat);
        long roundedByDouble2 = Math.round(costByDouble);

        System.out.printf("litersByFloat  = %.10f\n", litersByFloat);
        System.out.printf("litersByDouble = %.10f\n", litersByDouble);
        System.out.printf("costByFloat    = %.10f\n", costByFloat);
        System.out.printf("costByDouble   = %.10f\n", costByDouble);
        System.out.println("roundedByFloat  = " + roundedByFloat);
        System.out.println("roundedByDouble = " + roundedByDouble);
        System.out.println("roundedByFloat2  = " + roundedByFloat2);
        System.out.println("roundedByDouble2 = " + roundedByDouble2);
        System.out.println("status = " + status);

    }
}
