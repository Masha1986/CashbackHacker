package ru.netology.service;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void showLessBoundary() {
        int amount = 200;
        int expected = 800;

        int actual = cashbackHackService.remain(amount);

        assertEquals(actual, expected);

    }

    @Test
    public void showMoreBoundary() {
        int amount = 2200;
        int expected = 800;

        int actual = cashbackHackService.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void showAmountEqualBoundary() {
        int amount = 1000;
        int expected = 0;

        int actual = cashbackHackService.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void showAmountNullBoundary() {
        int amount = 0;
        int expected = 1000;

        int actual = cashbackHackService.remain(amount);

        assertEquals(actual, expected);
    }
}