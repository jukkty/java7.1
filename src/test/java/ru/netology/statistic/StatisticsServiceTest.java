package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

  @Test
  void homeworkValues() {
    StatisticsService service = new StatisticsService();

    long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
    long expected = 12;

    long actual = service.findMax(incomesInBillions);

    assertEquals(expected, actual);
  }

  @Test
  void myValues() {
    StatisticsService service = new StatisticsService();
    long[] incomesInMillions = {1,2,3,4,5,6,5,4,3,2,1};
    long expected = 6;

    long actual = service.findMax(incomesInMillions);
    assertEquals(expected,actual);

  }
}
