package ru.netology.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void calculateBonus() {
        BonusService bonusService = new BonusService();
        int amount = 2000;
        int actual = bonusService.calculateBonus(amount);
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void shoulReturnZeroIfAmountLowerThan1000() {
        BonusService service = new BonusService();
        int amount = 900;
        int actual = service.calculateBonus(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturn100IfAmountMoreThen11000(){
        BonusService service = new BonusService();
        int amount = 20000;
        int actual = service.calculateBonus(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }

}