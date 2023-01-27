package ru.netology.stats;

public class StatsService {

    //1
    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result;
    }

    //2
    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    //3
    public int monthMaxSale(long[] sales) {
        int monthMax = 0;
        long saleMax = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= saleMax) {
                monthMax = i;
                saleMax = sales[i];
            }
        }
        return monthMax + 1;
    }

    //4
    public int monthMinSale(long[] sales) {
        int monthMin = 0;
        long saleMin = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= saleMin) {
                monthMin = i;
                saleMin = sales[i];
            }
        }
        return monthMin + 1;
    }

    //5
    public int calcMonthSaleBellowAverage(long[] sales) {
        long averageSale = average(sales);

        int counter = 0;
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    //6
    public int calcMonthSaleAboveAverage(long[] sales) {
        long averageSale = average(sales);

        int counter = 0;
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }
}

