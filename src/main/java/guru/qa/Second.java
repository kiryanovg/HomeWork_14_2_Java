package guru.qa;

public class Second {

    // Сравнение сверхзвуковой и дозкувой скорости самолета

    public static void main(String[] args) {
        double aDouble = 1.3;
        double bDouble = 3.1;
        double speedM = 0.7;
        String name = "Если значение выше, значит скорость преодалена ";
        String aName = "Если значение ниже, значит скорость непреодалена";

        if (speedM < aDouble) {
            System.out.println(aName);
        }
        if (bDouble > aDouble) {
            System.out.println(name);

        }
    }
}
