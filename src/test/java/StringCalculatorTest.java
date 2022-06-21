import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {
	StringCalculator test;
	
	@BeforeEach
	public void before() {
		test = new StringCalculator();
	}
	
	@AfterEach
	public void after() {
		test = null
	}
	
	@Test
	public void test1() {
		assertThrows(IllegalArgumentException.class, () -> {test.add("-1","10")});
	}
	public void test1a() {
		assertThrows(IllegalArgumentException.class, () -> {test.add("0","-1")});
	}
	@Test
	public void test2() {
		assertEquals("1",test.add("1","10000000"));
	}
	
	@Test
	public void test2a() {
		assertEquals("1",test.add("100000000","1"));
	}

}
