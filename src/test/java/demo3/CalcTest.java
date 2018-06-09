package demo3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalcTest {

	Calc c1 = new Calc();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		int i =c1.add(10,20);
		assertTrue("add with 10,20", i == 30);
	}
	@Test
	public void testDivide() {
		int i;
		i =c1.divide("10","20");
		assertTrue("divide 10 with 20", i == 10/20);
	}
	@Test
	public void testDividebyZero() {
		try {
		int i =c1.divide("10","20");
		}
		catch(ArithmeticException e) {
			assertTrue("divide by zero", true);
		}
	}
	@Test
	public void testDivideNonNumeric() {	
		try {
			int i = c1.divide("1A0", "20");
		}
		catch(NumberFormatException e) {
			assertTrue("Number Format Exception", true);
		}
	}
}
