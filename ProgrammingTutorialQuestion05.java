// Create class Calculator [cite: 40]
class Calculator {
    // add() returns sum of two integers [cite: 41]
    public int add(int a, int b) {
        return a + b;
    }

    // multiply() returns product of two integers [cite: 42]
    public int multiply(int a, int b) {
        return a * b;
    }

    // square() returns the number multiplied by itself [cite: 43]
    public int square(int a) {
        return a * a;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // 1. Expression: (3 * 4 + 5 * 7)^2 [cite: 45]
        int part1 = calc.multiply(3, 4);
        int part2 = calc.multiply(5, 7);
        int result1 = calc.square(calc.add(part1, part2));
        System.out.println("Result 1: " + result1);

        // 2. Expression: (4 + 7)^2 + (8 + 3)^2 [cite: 46]
        int term1 = calc.square(calc.add(4, 7));
        int term2 = calc.square(calc.add(8, 3));
        int result2 = calc.add(term1, term2);
        System.out.println("Result 2: " + result2);
    }
}
