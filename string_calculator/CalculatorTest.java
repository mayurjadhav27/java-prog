package string_calculator;
import org.junit.*;
import static org.junit.Assert.*;
public class CalculatorTest{
   @Test
   public void inputEmptyString(){
	   assertEquals(0,Calculator.Add(""));
   }
   @Test
    public void returnnumfornum(){
	   assertEquals(1,Calculator.Add("1"));
    }
    @Test
    public void sumof2numns(){
	   assertEquals(3,Calculator.Add("1,2"));
    }
    
}