package Fiona;

public class multipleof3and5 {

  public int solution(int number) {

    int sumOfdivisibleNumbers = 0;

    for (int i = 0; i < number; i++) {

      if (i % 3 == 0 || i % 5 == 0) {

        sumOfdivisibleNumbers += i;

      }
    }
    return sumOfdivisibleNumbers;
  }

}