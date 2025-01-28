
public class Main {
    public static void main(String[] args) {

//        ----- =====   Задание № 1   ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 1   ===== -----");
        byte age = 21;
        if (age >= 18) {
            System.out.println("Вам " + age + ", вы совершеннолетний.");
        } else {
            System.out.println("Вам " + age + ", вы не совершеннолетний.");
        }

//        ----- =====   Задание № 2   ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 2   ===== -----");
        byte temp = -14;
        if (temp <= 5) {
            System.out.println("На улице " + temp + ", холодно, нужно надеть шапку.");
        } else {
            System.out.println("Сегодня +" + temp + ", тепло, можно идти без шапки.");
        }

//        ----- =====   Задание № 3   ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 3   ===== -----");
        byte speed = 65;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, можно ездить спокойно.");
        }

//        ----- =====   Задание № 4   ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 4   ===== -----");
        age = 28;
        if (age > 2 && age < 6) {
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в детский сад.");
        } else if (age > 7 && age < 17) {
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в школу.");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно учиться в университете.");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + " лет, то ему пора ходить на работу.");
        } else {
            System.out.println("Указанный возраст не попадает ни под один критерий.");
        }

//        ----- =====   Задание № 5   ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 5   ===== -----");
        age = 8;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + " лет, то он не может кататься на аттракционе.");
        } else if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + " лет,то он может кататься только в сопровождении " +
                    "взрослого.");
        } else if (age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + " лет, то он может кататься сомостоятельно.");
        }

//        ----- =====   Задание № 6, Вариант № 1  ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 6, Вариант № 1   ===== -----");
        byte full = 102;
        byte sit = 60;
        byte passengers = 72;
        if (passengers <= sit) {
            System.out.println("При посадке " + passengers + " человек, все займут сидячие места.");
        } else if (passengers > sit && passengers <= full) {
            int stand = passengers - sit;
            System.out.println("При посадке " + passengers + " человек," + sit + " пассажиров займут сидячие, а " + stand
                    + " пассажирам достанутся стоячие места");
        } else if (passengers > full) {
            int bad = passengers - full;
            int stand = full - sit;
            System.out.println("При посадке " + passengers + " человек, " + sit + " пассажиров займут сидячие, " + stand
                    + " пассажирам достанутся стоячие места, а " + bad + " человека не войдут в вагон.");
        }

//        ----- =====   Задание № 6, Вариант № 2  ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 6, Вариант № 2   ===== -----");
        byte capasity = 56;
        full = 102;
        sit = 60;
        if (capasity <= sit) {
            int stand = full - sit;
            int newSit = sit - capasity;
            System.out.println("В вагоне есть " + newSit + " сидячих мест и " + stand + " стоячих мест.");
        } else if (capasity > sit && capasity < full) {
            int stand = full - capasity;
            System.out.println("В вагоне осталось только " + stand + " стоячих мест.");
        } else if (capasity == full) {
            System.out.println("Вагон заполнен полностью.");
        }

//        ----- =====   Задание № 7  ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 7   ===== -----");
        int one = 17;
        int two = 5;
        int three = 9;
        if (one > two && one > three) {
            System.out.println("Число " + one + " наибольшее.");
        } else if (two > one && two > three) {
            System.out.println("Число " + two + " наибольшее.");
        } else if (three > one && three > two) {
            System.out.println("Число " + three + " наибольшее.");
        }

    }
}