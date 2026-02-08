public class MarathonConversion {
    public static void main(String[] args) {
        // a) & b) Declare and initialize variables [cite: 5, 6]
        int miles = 26; [cite: 6]
        int yards = 385; [cite: 6]
        double kilometers; [cite: 5]

        // c) & d) Calculate and save the result [cite: 7, 8]
        // One mile is 1.609 km; there are 1760.0 yards in a mile [cite: 9]
        double totalMiles = miles + (yards / 1760.0); [cite: 9]
        kilometers = totalMiles * 1.609; [cite: 9]

        System.out.println("Total Kilometers: " + kilometers);
    }
}