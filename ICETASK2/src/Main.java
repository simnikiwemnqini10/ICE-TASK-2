//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    String[] gyms = {"GYM 1","GYM2", "GYM3"};
    String[] months = {"MONTH 1","MONTH2","MONTH3"};

    double [][] weightloss = {
            {10,20,27},
             {22,5 ,27},
             {30,20,10},
    };

    double grandTotalWeightLoss = 0;

    System.out.println("=================================================");
    System.out.println("          WEIGHT LOSS PROGRAMME REPORT          ");
    System.out.println("=================================================");
    System.out.println("Gym Name\tMonth 1\tMonth 2\tMonth 3\tTotal\tAverage");
    System.out.println("------------------------------------------------,");

    for (int i =0 ;i < weightloss.length;i++) {
        double gymTotal = 0;

        System.out.print(gyms[i] + "\t\t");

        for (int j =0 ;j < weightloss.length;j++) {
            System.out.print((int)weightloss[i][j] + "kg\t");
            gymTotal += weightloss[i][j];
        }
        double gymAverage = gymTotal / weightloss[i].length;
        grandTotalWeightLoss += gymTotal;

        System.out.printf("%.1fkg\t%.2fkg%n", gymTotal, gymAverage);
    }
    System.out.println("------------------------------------------------");
    System.out.printf("Grand Total Weight Loss Across All Gyms: %.1fkg%n", grandTotalWeightLoss);
    System.out.println("=================================================");
}

