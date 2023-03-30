package org.example.StringsAndArrays.services;

public class StatsService {

    public long calculateSumNumbers(long[] sales) {
        long salesAmount = 0;
        for (long sale : sales) {
            salesAmount += sale;
        }
        return salesAmount;
    }

    public long averageMonthly(long[] sales) {
        long salesAmount = 0;
        for (long sale : sales) {
            salesAmount += sale;
        }
        long averageMonthlySale = salesAmount / 12;

        return averageMonthlySale;
    }

    public int peakSales(long[] sales) {
        int monthNumber = 0;
        long maxSale = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSale) {
                monthNumber = i;
                maxSale = sales[i];
            }
        }
        return monthNumber + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth - 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int lowSalesMonths(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < averageMonthly(sales)) {
                counter++;
        }
        }
        return counter;
    }
    public int aboveSalesMonths(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > averageMonthly(sales)) {
                counter++;
            }
        }
        return  counter;
        }
}