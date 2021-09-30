package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int calculateAverage(int[] sales) {
//        int sum = 0;
//        for (int sale : sales) {
//            sum = sum + sale;
//        }
//        int average = sum / sales.length;
//        return average;
        return calculateSum(sales) / sales.length;
    }

    public int calculateMinSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int calculateMaxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int calculateNumberMonthBelowAverage(int[] sales) {
        int number = 0;
        int average = calculateAverage(sales);
        for (int sale : sales) {
            if (sale < average) {
                number++;
            }
        }
        return number;
    }
    public int calculateNumberMonthAboveAverage(int[] sales) {
        int number = 0;
        int average = calculateAverage(sales);
        for (int sale : sales) {
            if (sale > average) {
                number++;
            }
        }
        return number;
    }
}

