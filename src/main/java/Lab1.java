public class Lab1 {
    public static void main(String[] args) {
        // simulate the passing of time
        int startingYear = 2000;
        int targetYear = 2011;
        int currentYear = startingYear;
        while (currentYear < targetYear) {
            System.out.println((currentYear - startingYear) + " year(s) have passed");
            // conditional logic based on the current year
            currentYear++;
        }
    }
}
