public class TestDrillerUtme {

    public static int testdriller(int number) {
        if (number >= 1 && number <= 4) {
            return number * 2000;
        } else if (number >= 5 && number <= 9) {
            return number * 1800;
        } else if (number >= 10 && number <= 29) {
            return number * 1600;
        } else if (number >= 30 && number <= 49) {
            return number * 1500;
        } else if (number >= 50 && number <= 99) {
            return number * 1300;
        } else if (number >= 100 && number <= 199) {
            return number * 1200;
        } else if (number >= 200 && number <= 499) {
            return number * 1100;
        } else if (number >= 500) {
            return number * 1000;
        } else {
            return 0;
        }
    }
}
