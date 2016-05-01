package easy;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;



import org.junit.Test;

import easy.PascalTriangle;


public class PascalTriangleTest {

	@Test
	public void testGenerate1() {
		List<Integer> rowOne = Arrays.asList(1);
		List<Integer> rowTwo = Arrays.asList(1,1);
		List<Integer> rowThree = Arrays.asList(1,2,1);
		List<Integer> rowFour = Arrays.asList(1,3,3,1);
		List<Integer> rowFive = Arrays.asList(1,4,6,4,1);
		List<List<Integer>> triangle = Arrays.asList(rowOne,rowTwo,rowThree,rowFour,rowFive);
		List<List<Integer>> res = PascalTriangle.generate(5);
		System.out.println(res);
		System.out.println(triangle);
		assertEquals(res.toString(),triangle.toString());
		
	}

	@Test
	public void testGenerate2() {
		List<Integer> rowOne = Arrays.asList(1);
		List<List<Integer>> triangle = Arrays.asList(rowOne);
		List<List<Integer>> res = PascalTriangle.generate(1);
		System.out.println(res);
		System.out.println(triangle);
		assertEquals(res.toString(),triangle.toString());
	}

}
