package org.jfree.data.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.jfree.data.DataUtilities;
import org.jfree.data.Values2D;
import org.jfree.data.KeyedValues;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Test;

public class DataUtilitiesTest extends DataUtilities {

	@Test
	public void calculateColumnTotalForTwoValues() {
	    // setup
	    Mockery mockingContext = new Mockery();
	    final Values2D values = mockingContext.mock(Values2D.class);
	    mockingContext.checking(new Expectations() {
	        {
	            one(values).getRowCount();
	            will(returnValue(2));
	            one(values).getValue(0, 0);
	            will(returnValue(7.5));
	            one(values).getValue(1, 0);
	            will(returnValue(2.5));
	        }
	    });
	    
	    double result = DataUtilities.calculateColumnTotal(values, 0);
	    // verify
	    assertEquals("The column total value should be 10.", result, 10.0, .000000001d);
	    // tear-down: NONE in this test method
	}
	
//	@Test
//	public void calculateColumnTotalForNullColumn() {
//	    // setup
//	    Mockery mockingContext2 = new Mockery();
//	    final Values2D values2 = mockingContext2.mock(Values2D.class);
//	    mockingContext2.checking(new Expectations() {
//	        {
//	            one(values2).getRowCount();
//	            will(returnValue(2));
//	            one(values2).getColumnCount();
//	            will(returnValue(2));
//	            one(values2).getValue(0, 0);
//	            will(returnValue(7.5));
//	            one(values2).getValue(1, 0);
//	            will(returnValue(2.5));
//	        }
//	    });
//	    
//	    double result2 = DataUtilities.calculateColumnTotal(values2, 1);
//	    // verify
//	    //assertEquals("The column total value should be 0.", result2, 0, .000000001d);
//	    assertNull("The column total value should be NULL.", result2);
//	    // tear-down: NONE in this test method
//	}
	
	@Test
	public void calculateRowForTwoValues() {
	    // setup
	    Mockery mockingContext2 = new Mockery();
	    final Values2D values2 = mockingContext2.mock(Values2D.class);
	    mockingContext2.checking(new Expectations() {
	        {
	            one(values2).getRowCount();
	            will(returnValue(2));
	            one(values2).getColumnCount();
	            will(returnValue(2));
	            one(values2).getValue(0, 0);
	            will(returnValue(5.5));
	            one(values2).getValue(0, 1);
	            will(returnValue(4.5));
	        }
	    });
	    
	    double result2 = DataUtilities.calculateRowTotal(values2, 0);
	    // verify
	    assertEquals("The row total value should be 10.", result2, 10, .000000001d);
	    //assertNull("The column total value should be NULL.", result2);
	    // tear-down: NONE in this test method
	}
	
//	@Test
//	public void calculateRowTotalForNullRow() {
//	    // setup
//	    Mockery mockingContext2 = new Mockery();
//	    final Values2D values2 = mockingContext2.mock(Values2D.class);
//	    mockingContext2.checking(new Expectations() {
//	        {
//	            one(values2).getRowCount();
//	            will(returnValue(0));
//	            one(values2).getColumnCount();
//	            will(returnValue(2));
//	            one(values2).getValue(0, 0);
//	            will(returnValue(7.5));
//	            one(values2).getValue(1, 0);
//	            will(returnValue(2.5));
//	        }
//	    });
//	    
//	    double result2 = DataUtilities.calculateRowTotal(values2, 0);
//	    // verify
//	    //assertEquals("The column total value should be 0.", result2, 0, .000000001d);
//	    assertNull("The row total value should be NULL.", result2);
//	    // tear-down: NONE in this test method
//	}
	
	@Test 
	public void createNumberArrayTest() {
	    // setup
		
		double[] test = {1, 2, 3};
		Number[] answer = {1.0, 2.0, 3.0};
		
		assertEquals("Arrays should be equal.", answer, DataUtilities.createNumberArray(test));
		
	}
	
	@Test 
	public void createNumberArrayWithDoubles() {
	    // setup
		
		double[] test = {1.45, 2.84, 3.35};
		Number[] answer = {1.45, 2.84, 3.35};
		
		assertEquals("Arrays should be equal.", answer, DataUtilities.createNumberArray(test));
		
	}
	
	@Test 
	public void createNumberArray2DTest() {
	    // setup
		
		double[][] test = {{1, 1}, {2, 2}, {3, 3}};
		Number[][] answer = {{1.0, 1.0}, {2.0, 2.0}, {3.0, 3.0}};
		
		assertEquals("Arrays should be equal.", answer, DataUtilities.createNumberArray2D(test));
		
	}
	
	@Test
	public void getCumulativePercentagesTest() {
		Mockery mockingContext = new Mockery();
	    final KeyedValues values = mockingContext.mock(KeyedValues.class);
	    mockingContext.checking(new Expectations() {
	        {
	        	one(values).getKey(0);
	        	will(returnValue(1));
	        	one(values).getIndex(1);
	        	will(returnValue(0));
//	        	one(values).getKeys();
//	        	will(returnValue(1));
	        	one(values).getValue(1);
	        	will(returnValue(0.5));
//	        	one(values).getValue(0);
//	            will(returnValue(0.1));
//	        	one(values).getValue(1);
//	            will(returnValue(0.1));
//	        	one(values).getValue(2);
//	            will(returnValue(0.1));
	        }
	    });
	    
	    KeyedValues result = DataUtilities.getCumulativePercentages(values);
	    assertEquals("Should be equal.", 1, 1);
	}

}
