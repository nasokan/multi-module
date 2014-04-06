package com.nithinasokan.maven.multimodule;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class SumOfNumbersTest {

	@Test
	public void testSum() {
		assertEquals(3, SumOfNumbers.sum(1, 2));
	}
}
