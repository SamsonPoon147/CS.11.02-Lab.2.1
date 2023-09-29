public class Main {

    public static void main(String[] args) {
        // 1. add
        int add1 = add(3,8);
        System.out.println(add1);

        // 2. add
        int addTwo = add(3,8,4,9);
        System.out.println(addTwo);

        // 3. morningGreeting
        String morningGreetingResult = morningGreeting("Toby Fox");
        System.out.println(morningGreetingResult);

        // 4. afternoonGreeting
        String afternoonGreetingResult = afternoonGreeting("Mac Miller");
        System.out.println(afternoonGreetingResult);

        // 5. triple
        String result = triple("oohbaby");
        System.out.println(result);

        // 6. half
        double result1 = (double) half(8.0);
        System.out.println(result1);

        // 7. roundPositiveValueToNearestInteger
        double value1 = 8.5;
        int result2 = roundPositiveValueToNearestInteger(value1);
        System.out.println(result2);

        double value2 = 8.49;
        int result3 = roundPositiveValueToNearestInteger(value2);
        System.out.println(result3);

        // 8. roundNegativeValueToNearestInteger
        double value3 = -8.5;
        int result4 = roundNegativeValueToNearestInteger(value3);
        System.out.println(result4);

        double value4 = -8.49;
        int result5 = roundNegativeValueToNearestInteger(value4);
        System.out.println(result5);
    }
    public static int add(int a, int b) {return a + b;}
    public static int add(int a, int b, int c, int d) {return add(add(a,b), add(c,d));}
    public static String morningGreeting(String name) {return "早上好, " + name + "!";}
    public static String afternoonGreeting(String name1) {return "下午好, " + name1 + "!";}
    public static String triple(String o) {return o + o + o;}
    public static double half(double i) {return i/2.0;}
    public static int roundPositiveValueToNearestInteger(double value) {return (int) Math.round(value);}
    public static int roundNegativeValueToNearestInteger(double value) {return (int) -Math.round(-value);}


}

