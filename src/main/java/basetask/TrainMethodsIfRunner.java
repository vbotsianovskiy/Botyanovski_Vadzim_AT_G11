package main.java.basetask;

public class TrainMethodsIfRunner {
    public static void main(String[] args) {
        TrainMethodsIf xx = new TrainMethodsIf();

        System.out.println("метод returnNewInt вернул " + xx.returnNewInt(8));
        System.out.println("метод returnNewLong вернул " + xx.returnNewLong(7589632));
        System.out.println("метод returnNewChar вернул " + xx.returnNewChar('g'));
        System.out.println("метод returnNewFloat вернул " + xx.returnNewFloat(622.99f));
        System.out.println("метод returnNewDouble вернул " + xx.returnNewDouble(800.88));
        xx.returnNewBoolean(true);

    }
}
