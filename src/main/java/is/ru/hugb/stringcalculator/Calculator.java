package is.ru.stringcalculator;

public class Calculator {
  public static int add(String text){
    if(text.equals( "")) {return 0;}
    
    String numbers[] = text.split(",");
    if(numbers.length == 1) {return toInt(numbers[0]);} 
    else { return toInt(numbers[0]) + toInt(numbers[1]);}

  }

  private static int toInt(String number){
    return Integer.parseInt(number);
  }
}
