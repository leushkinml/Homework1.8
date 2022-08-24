import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // Task1
        int year = 2022;
        leapYearVerification(year);

        // Task2
        int clientOS = 1;  // 1 - iOS, 2 - Android
        int deviceYear = 2022;
        chekOS(deviceYear, clientOS);

        // Task3
        int deliveryDistance = 95;
        int deliveryDays = chekDeliveryDays(deliveryDistance);
        System.out.println("Потребуется дней: " + deliveryDays);

    }


    // Task1
    private static void leapYearVerification(int year) {
        if ((year % 4) == 0 && (year % 100) != 0 || (year % 400) == 0 ) {
            System.out.println(year + " - високосный год.");
        } else {
            System.out.println(year + " - не високосный год.");
        }
    }

    // Task2
    private static void chekOS(int deviceYear, int clientOS) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && deviceYear < currentYear) {
            System.out.println("Установите облегчённую (Lite) версию приложения для iOS по ссылке.");
        } else if (clientOS == 0 && deviceYear == currentYear) {
            System.out.println("Установите полную (Full) версию приложения для iOS по ссылке.");
        } else if (clientOS == 1 && deviceYear < currentYear) {
            System.out.println("Установите облегчённую (Lite) версию приложения для Android по ссылке.");
        } else if (clientOS == 1 && deviceYear == currentYear) {
            System.out.println("Установите полную (Full) версию приложения для Android по ссылке.");
        }
    }

    // Task3
    private static int chekDeliveryDays(int deliveryDistance) {
        int deliveryDays = 0;
        if (deliveryDistance <= 20 && deliveryDistance > 0) {
            deliveryDays = 1;
        } else if (deliveryDistance > 20 && ((deliveryDistance - 20) % 40) == 0) {
            deliveryDays = 1 + ((deliveryDistance - 20) / 40);
        } else if (deliveryDistance > 20 && ((deliveryDistance - 20) % 40) != 0) {
            deliveryDays = 2 + ((deliveryDistance - 20) / 40);
        }
        return deliveryDays;
    }
}

    /*
        public static void printSeparator() {
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println("---------------------------------");
        }

        public static void printIssues(int issueCount) {
        System.out.println(issueCount);
        }

        public static int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[1];
        }
        return sum;
        }

        int[] issuesByMonths = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6, 7, 1, 8};
        printSeparator();

        for (int i = 0; i < issuesByMonths.length; i++) {
        printIssues(issuesByMonths[i]);
        if ((i + 1) % 3 == 0) {
        printSeparator();
        }

        }
        printSeparator();
        int total = sum(issuesByMonths);
        printIssues(total);



        */