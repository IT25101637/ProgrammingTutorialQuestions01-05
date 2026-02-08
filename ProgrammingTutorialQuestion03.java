// a) Create class EvenOddNumber [cite: 19]
class EvenOddNumber {
    // b) & c) Method takes integer and returns boolean [cite: 20, 21]
    public boolean findEvenOrOdd(int i) {
        return (i % 2 == 0); // Returns true if even, false if odd [cite: 22]
    }
}

// d) Create Demo class with main method [cite: 25]
public class Demo {
    public static void main(String[] args) {
        // Create an object of EvenOddNumber [cite: 25]
        EvenOddNumber checker = new EvenOddNumber(); 

        // e) Call method and display outputs [cite: 26]
        int testNum = 7;
        if (checker.findEvenOrOdd(testNum)) {
            System.out.println(testNum + " is an even number."); [cite: 26]
        } else {
            System.out.println(testNum + " is an odd number."); [cite: 26]
        }
    }
}