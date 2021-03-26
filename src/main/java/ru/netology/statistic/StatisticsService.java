package ru.netology.statistic;

public class StatisticsService {
  /**
   * Calculate index of max income
   *
   * @param incomes - array of incomes
   * @return - index of first max value
   */
  public long findMax(long[] incomes) {
    long current_max_index = 0;
    long current_max = incomes[0];
    long counter = 0;
    for (long income : incomes) {
      counter++;
      if (current_max <= income) {
        current_max_index = counter;
        current_max = income;
      }
    }
    return current_max_index;
  }
}