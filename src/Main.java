public class Main {
    public static void main(String[] args) {

        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(1, 1));
        System.out.println(intsCalc.div(40, 10));
        System.out.println(intsCalc.pow(2, 3));
        System.out.println(intsCalc.mult(2,8));
        System.out.println(intsCalc.sub(64, 32));
    }
}
