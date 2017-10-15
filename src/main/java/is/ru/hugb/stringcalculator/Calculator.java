package is.ru.stringcalculator;

import java.util.*;

public class Calculator {
  public static int add(String text){
    if(text.equals( "")) {return 0;}
    if(text.contains(",")){
      String numbers[] = text.split(",|\n");
      return sum(numbers);
    } 
    return 1;
  }

  private static int toInt(String number){
    return Integer.parseInt(number);
  }

  private static int sum(String[] numbers){
    int total = 0;
    for(String number : numbers){
      if(toInt(number) < 0){
        negativeChecker(numbers);
      }
      if(toInt(number) < 1000){
        total += toInt(number);
      }
    }
    return total;
  }

  private static void negativeChecker(String[] numbers) {
    ArrayList al = new ArrayList();
    for(int i = 0; i < numbers.length; i++){
      if(toInt(numbers[i]) < 0){
        al.add(numbers[i]);
      }
    }
    throw new IllegalArgumentException("Negatives not allowed: " + al);
  }

}
