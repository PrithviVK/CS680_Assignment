package edu.umb.cs680.hw11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import edu.umb.cs680.hw11.Manhattan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class HW11Test {

		@Test
		public void verifyManhattan() {
//			List<List<Double>> p1=Arrays.asList({{1.0,2.0,3.0},{0.0,1.0,2.0},{1.0,0.0,2.0},{1.0,2.0,0.0},{3.0,1.0,2.0}});
			List<Double> p1=Arrays.asList(5.0,7.0,10.0);
			List<Double> p2=Arrays.asList(2.0,3.0,2.0);
			List<Double> p3=Arrays.asList(3.0,4.0,4.0);
			List<Double> p4=Arrays.asList(1.0,7.0,6.0);
			List<Double> p5=Arrays.asList(8.0,2.0,5.0);
			List<List<Double>> manhattan_point =  new ArrayList<>();
			manhattan_point.add(p1);
			manhattan_point.add(p2);
			manhattan_point.add(p3);
			manhattan_point.add(p4); 
			manhattan_point.add(p5);
			
//			System.out.println(Distance.matrix(manhattan_point,new Manhattan()));
			
			List<List<Double>> expected=Arrays.asList(Arrays.asList(0.0, 15.0, 11.0, 8.0, 13.0),Arrays.asList(15.0, 0.0, 4.0, 9.0, 10.0),
					Arrays.asList(11.0, 4.0, 0.0, 7.0, 8.0),Arrays.asList(8.0, 9.0, 7.0, 0.0, 13.0),Arrays.asList(13.0, 10.0, 8.0, 13.0, 0.0));
					
			List<List<Double>> actual=Distance.matrix(manhattan_point,new Manhattan());
			System.out.println(actual);
			assertEquals(actual,expected);
			
		}
		
		@Test
		public void verifyEuclidean() {
			List<Double> p1=Arrays.asList(5.0,7.0,10.0);
			List<Double> p2=Arrays.asList(2.0,3.0,2.0);
			List<Double> p3=Arrays.asList(3.0,4.0,4.0);
			List<Double> p4=Arrays.asList(1.0,7.0,6.0);
			List<Double> p5=Arrays.asList(8.0,2.0,5.0);
			List<List<Double>> Euclidean_point =  new ArrayList<>();
			Euclidean_point.add(p1);
			Euclidean_point.add(p2);
			Euclidean_point.add(p3);
			Euclidean_point.add(p4); 
			Euclidean_point.add(p5);
			
//			System.out.println(Distance.matrix(Euclidean_point,new Euclidean()));
			
			List<List<Double>> expected=Arrays.asList(Arrays.asList(0.0, 9.433981132056603, 7.0, 5.656854249492381, 7.681145747868608),
					Arrays.asList(9.433981132056603, 0.0, 2.449489742783178, 5.744562646538029, 6.782329983125268),
					Arrays.asList(7.0, 2.449489742783178, 0.0, 4.123105625617661, 5.477225575051661),
					Arrays.asList(5.656854249492381, 5.744562646538029, 4.123105625617661, 0.0, 8.660254037844387),
					Arrays.asList(7.681145747868608, 6.782329983125268, 5.477225575051661, 8.660254037844387, 0.0));
			
			List<List<Double>> actual=Distance.matrix(Euclidean_point,new Euclidean());
			assertEquals(actual,expected);
		}
		
		@Test
		public void verifyEuclideanMatrix() {
			List<Double> p1=Arrays.asList(5.0,7.0,10.0);
			List<Double> p2=Arrays.asList(2.0,3.0,2.0);
			List<Double> p3=Arrays.asList(3.0,4.0,4.0);
			List<Double> p4=Arrays.asList(1.0,7.0,6.0);
			List<Double> p5=Arrays.asList(8.0,2.0,5.0);
			
			List<List<Double> > expected = new ArrayList<List<Double> >();
			List<Double> p6=Arrays.asList(0.0, 13.0, 8.0, 10.0, 13.0);
			List<Double> p7=Arrays.asList(13.0, 0.0, 7.0, 9.0, 8.0);
			List<Double> p8=Arrays.asList(8.0, 7.0, 0.0, 4.0, 11.0);
			List<Double> p9=Arrays.asList(10.0, 9.0, 4.0, 0.0, 15.0);
			List<Double> p10=Arrays.asList(13.0, 8.0, 11.0, 15.0, 0.0);
			expected.add(p6);
			expected.add(p7);
			expected.add(p8);
			expected.add(p9);
			expected.add(p10);

			List<List<Double>> dist =  new ArrayList<>();
			dist.add(p5);
			dist.add(p4);
			dist.add(p3);
			dist.add(p2);
			dist.add(p1);
			List<List<Double>> actual=Distance.matrix(dist,new Manhattan());
//			System.out.println();
			assertEquals(actual,expected);
		}

 

}