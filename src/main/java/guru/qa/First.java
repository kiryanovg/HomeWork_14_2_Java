package guru.qa;

public class First {

    public static void main(String[] args) {

        // домашнее задание 2. Основы Java. Дмитрий Тучс.
        char symbol, anoterSymbol;
        boolean aBoulen = true || false;
        byte aByte = 37;
        short aShort = 12698;
        int aInt = 331;
        long aLong = 54319;
        float aFloat = 2.7F;
        double aDouble = 1.3D;
        String aString = "Gendolf";
        String aString0 = "Gendolf";

        // Арифметика
        System.out.println(aByte + aShort);
        System.out.println(aInt - aByte);
        System.out.println(aLong / aInt);
        System.out.println(aFloat * aDouble);
        System.out.println();

        String first, second, third, result;
        first = "В скором времени,";
        second = "я достигну ";
        third = "уровня Senior";
        result = first + second + third;
        System.out.println(result);
    }
}
