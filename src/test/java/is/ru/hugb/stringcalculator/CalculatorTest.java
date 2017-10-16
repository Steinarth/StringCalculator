package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

public class CalculatorTest{
  @Test
  public void testEmptyString(){
    assertEquals(0, Calculator.add(""));
  }

  @Test
  public void testOneNumber(){
    assertEquals(1, Calculator.add("1"));
  }

  @Test
  public void testTwoNumbers(){
    assertEquals(3, Calculator.add("1,2"));
  }

  @Test
  public void testMultipleNumbers(){
    assertEquals(6, Calculator.add("1,2,3"));
  }

  @Test
  public void testNewLine(){
    assertEquals(6, Calculator.add("1\n2,3"));
  }

  @Test
  public void testNegetives(){
    try{
      Calculator.add("-1,2");
      fail("supposed to trow an error");
    }catch(IllegalArgumentException e){
      assertEquals("Negatives not allowed: [-1]", e.getMessage());
    }
  }

  @Test
  public void testLargerThan1000(){
    assertEquals(2, Calculator.add("1001,2"));
  } 

  @Test
  public void testDifferentDelimiter(){
    assertEquals(3, Calculator.add("//;\n1;2"));
  }

}


