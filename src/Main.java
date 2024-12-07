public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка 7");
        System.out.println("Задание 1");
        double deposit = 15000;
        double total = 0;
        int month = 0;
        while (total < 2459000) {
            total += deposit;  // Увеличиваем сумму накоплений на размер вклада
            month += 1;  // Увеличиваем счетчик месяцев на 1
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");  // Выводим текущую сумму
        }
        System.out.println("Задание 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        int b = 10;
        for (; b >= 1; b--) {
            System.out.print(b + " ");
        }
        System.out.println("Задание 3");
        int population = 12000000;
        int birthRatePer1000 = 17;
        int mortalPer1000 = 8;
        int yearNow = 2024;
        for (int year = yearNow; year < yearNow + 10; year++) {
            population += population * birthRatePer1000 / 1000 - population * mortalPer1000 / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        System.out.println("Задание 4");
        int deposit2 = 15000;
        double monthlyPercent = 0.07;
        int totalAmount = 12_000_000;
        int numberMonth = 1;
        while (deposit2 <= totalAmount) {
            deposit2 += deposit2 * monthlyPercent;
            System.out.println("Месяц " + numberMonth + ", сумма накоплений: " + deposit2);
            numberMonth++;
        }
        System.out.println("Задание 5");
        int deposit3 = 15000;
        double monthlyPercent2 = 0.07;
        int totalAmount2 = 12_000_000;
        int numberMonth2 = 1;
        while (deposit3 <= totalAmount2) {
            deposit3 += deposit3 * monthlyPercent2;
            numberMonth2++;
            if (numberMonth2 % 6 == 0) {
                System.out.println("Месяц " + numberMonth2 + ", сумма накоплений: " + deposit3);
            }
        }
        System.out.println("Задание 6");
        int deposit4 = 15000;
        double monthlyPercent3 = 0.07;
        int investmentTime = 9;
        int totalInvestmentTime = investmentTime * 12;
        int numberMonth3 = 1;
        while (numberMonth3 <= totalInvestmentTime) {
            deposit4 += deposit4 * monthlyPercent3;
            numberMonth3++;
            if (numberMonth3 % 6 == 0) {
                System.out.println("Месяц " + numberMonth3 + ", сумма накоплений: " + deposit4);
            }
        }
        System.out.println("Задание 7");
        int friday = 6;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday += 7;
        }
        System.out.println("Задание 8");
        int now = 2024;
        int past = now - 200;
        int future = now + 100;
        int year = 0;
        for (year = past; year <= future; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
    }
}