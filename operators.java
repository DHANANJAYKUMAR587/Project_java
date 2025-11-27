class Operators {
    public static void main(String[] args) {

        int a = 10, b = 5;

        // Arithmetic Operators
        System.out.println(a + b);  // +
        System.out.println(a - b);  // -
        System.out.println(a * b);  // *
        System.out.println(a / b);  // /
        System.out.println(a % b);  // %

        // Unary Operators
        System.out.println(++a);    // pre-increment
        System.out.println(b--);    // post-decrement

        // Assignment Operators
        a += 3;                     // a = a + 3
        System.out.println(a);

        // Relational Operators
        System.out.println(a > b);  // >
        System.out.println(a == b); // ==

        // Logical Operators
        System.out.println(a > 5 && b < 10);  // &&
        System.out.println(a > 5 || b > 10);  // ||
        System.out.println(!(a > b));         // !

        // Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println(max);
    }
}
