package fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class TestFizzBuzz {

	FizzBuzz fizzBuzz = new FizzBuzz();
	
	@Test
	public void testOneNumber() {
		Assert.assertEquals(fizzBuzz.ProcessFizzBuzz(1), "1");
		Assert.assertEquals(fizzBuzz.ProcessFizzBuzz(2), "2");
		Assert.assertEquals(fizzBuzz.ProcessFizzBuzz(4), "4");
	}
	
	@Test
	public void testThreeMultple() {
		Assert.assertEquals(fizzBuzz.ProcessFizzBuzz(3), "fizz");
		Assert.assertEquals(fizzBuzz.ProcessFizzBuzz(6), "fizz");
		Assert.assertEquals(fizzBuzz.ProcessFizzBuzz(9), "fizz");
	}
	
	@Test
	public void testFiveMultple() {
		Assert.assertEquals(fizzBuzz.ProcessFizzBuzz(5), "buzz");
		Assert.assertEquals(fizzBuzz.ProcessFizzBuzz(10), "buzz");
	}
	
	@Test
	public void testThreeAndFiveMultple() {
		Assert.assertEquals(fizzBuzz.ProcessFizzBuzz(15), "fizzbuzz");
		Assert.assertEquals(fizzBuzz.ProcessFizzBuzz(30), "fizzbuzz");
	}
	
}
