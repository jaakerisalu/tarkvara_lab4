package ee.ttu.tt.harjutused;

import static org.junit.Assert.*;

import org.junit.Test;

public class OnePlusOneTest
{
	@Test
	public void test()
	{
		assertEquals("Result is different then expected", 2, OnePlusOne.onePlusOne());
	}
}
