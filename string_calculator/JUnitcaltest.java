package string_calculator;
import org.junit.*;
import static org.junit.Assert.*;
public class JUnitcaltest{
   @Test
   public void inputEmptyString(){
	   assertEquals(0,JUnitcal.Add(""));
   }
   @Test
    public void returnnumfornum(){
	   assertEquals(1,JUnitcal.Add("1"));
    }
    @Test
    public void sumof2numns(){
	   assertEquals(3,JUnitcal.Add("1,2"));
    } 
}