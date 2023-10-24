import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2() {
    int[] input1 = {1, 2, 3};
    assertArrayEquals(new int[]{3, 2, 1}, ArrayExamples.reversed(input1));
  }
  @Test 
	public void testReverseInPlace2() {
    int[] input1 = {1,2,3,4};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{4,3,3,4}, input1);
	}
  @Test 
	public void averageWithoutLowestEmp() {
    double[] arr = {};
    ArrayExamples.averageWithoutLowest(arr);
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(arr), 0.01);

  }

  @Test 
	public void averageWithoutLowestOne() {
    double[] arr = {5};
    ArrayExamples.averageWithoutLowest(arr);
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(arr), 0.01);
  }
  
  @Test 
	public void averageWithoutLowestA() {
    double[] arr = {1, 2, 3};
    ArrayExamples.averageWithoutLowest(arr);
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(arr), 0.01);
  }
}
