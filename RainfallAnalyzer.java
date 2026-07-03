import java.util.Random;

public class RainfallAnalyzer {
    public static void main(String[] args) {
        // (i) Generate 30 random daily rainfall readings between 0 and 60 mm
        int[] rainfall = new int[30];
        Random rand = new Random();
        for (int i = 0; i < 30; i++) {
            rainfall[i] = rand.nextInt(61); // 0 to 60 inclusive
        }

        // Display the readings
        System.out.println("Daily Rainfall Readings (mm):");
        for (int i = 0; i < 30; i++) {
            System.out.printf("Day %d: %d mm%n", i+1, rainfall[i]);
        }

        // (ii) Compute total and average
        int total = 0;
        for (int r : rainfall) {
            total += r;
        }
        double average = (double) total / 30;

        System.out.println("\nTotal monthly rainfall: " + total + " mm");
        System.out.printf("Average daily rainfall: %.2f mm%n", average);

        // (iii) Count wet days (>30 mm)
        int wetDays = 0;
        for (int r : rainfall) {
            if (r > 30) {
                wetDays++;
            }
        }
        System.out.println("Number of wet days: " + wetDays);

        // (iv) Classify the month
        String classification;
        if (total <= 300) {
            classification = "Dry";
        } else if (total < 600) {
            classification = "Normal";
        } else {
            classification = "Flood-risk";
        }
        System.out.println("Month classification: " + classification);
    }
}
