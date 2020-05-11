package ru.netalogy.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsTest {

    @Test
    void shouldSalesAmountForAllYear() {
        Stats sales = new Stats();

        //подготавливаем данные
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = sales.calculateSale(sale);
        assertEquals(expected, actual);
    }

    @Test
    void shouldAverageAmountForAllYear() {
        Stats averageSales = new Stats();

        //подготавливаем данные
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = averageSales.averageAmount(sale);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMonthOfMaxSales() {
        Stats max = new Stats();

        //подготавливаем данные
        long[] sale = {12, 10, 12, 17, 17, 21, 19, 20, 7, 14, 25, 18};
        long expected = 11;

        long actual = max.monthOfMaxSales(sale);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMonthOfMinimumSales() {
        Stats minimum = new Stats();

        //подготавливаем данные
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = minimum.monthOfMinimumSales(sale);
        assertEquals(expected, actual);
    }

    @Test
    void shouldQuantityMonthOfMaxSales() {
        Stats maxMonth = new Stats();

        //подготавливаем данные
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = maxMonth.quantityMonthOfMaxSales(sale);
        assertEquals(expected, actual);
    }


    @Test
    void shouldQuantityMonthOfMinimumSales() {
        Stats minMonth = new Stats();

        //подготавливаем данные
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = minMonth.quantityMonthOfMinimumSales(sale);
        assertEquals(expected, actual);
    }
}