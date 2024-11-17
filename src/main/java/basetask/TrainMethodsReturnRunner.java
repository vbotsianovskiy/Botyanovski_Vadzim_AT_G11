package main.java.basetask;

public class TrainMethodsReturnRunner {
    public static void main(String[] args) {
        TrainMethodsReturn number = new TrainMethodsReturn();

        System.out.println("метод returnNewInt вернул " + number.returnNewInt(7));
        System.out.println("метод returnNewLong вернул " + number.returnNewLong(20));
        System.out.println("метод returnNewChar вернул " + number.returnNewChar('#'));
        System.out.println("метод returnNewFloat вернул " + number.returnNewFloat(7755.772f));
        System.out.println("метод returnNewDouble вернул " + number.returnNewDouble(54.14));
        System.out.println("метод returnNewShort вернул " + number.returnNewShort((short)2000));
        System.out.println("метод returnNewByte вернул " + number.returnNewByte((byte)1));
        System.out.println("метод returnNewBoolean вернул " + number.returnNewBoolean(true));
    }
}





