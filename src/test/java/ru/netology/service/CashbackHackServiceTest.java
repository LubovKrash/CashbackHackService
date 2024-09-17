package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 400;

        int actual = service.remain(amount);
        int expected = 600;

        assertEquals(actual, expected);
    }
}