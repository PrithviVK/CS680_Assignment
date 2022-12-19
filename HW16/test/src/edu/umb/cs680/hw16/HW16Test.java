package edu.umb.cs680.hw16;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class HW16Test {

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
//			double distance=0;
			
			List<List<Double>> expected=Arrays.asList(Arrays.asList(0.0, 15.0, 11.0, 8.0, 13.0),Arrays.asList(15.0, 0.0, 4.0, 9.0, 10.0),
					Arrays.asList(11.0, 4.0, 0.0, 7.0, 8.0),Arrays.asList(8.0, 9.0, 7.0, 0.0, 13.0),Arrays.asList(13.0, 10.0, 8.0, 13.0, 0.0));
						
			List<List<Double>> actual=Distance.matrix(manhattan_point,(List<Double> l1, List<Double> l2)->{double distance=0;
								for(int i=0;i<l1.size();i++) {
									double x=l1.get(i);
									double y=l2.get(i);
									distance+=Math.abs(x-y);}
								return distance;}); 
						
//			List<List<Double>> actual=Distance.matrix(manhattan_point,
//			Collections.sort(manhattan_point,Comparator.comparing((Distance distance)->(car.getMileage()))));
					
//			List<List<Double>> actual=Distance.matrix(manhattan_point,new Manhattan());
//	List<List<Double>> actual=Distance.matrix(manhattan_point,Collections.sort(manhattan_point,Comparator.comparing((Distance distance)->(car.getMileage()))));       
//			System.out.println(actual);
//			List<Double> l1.forEach((i)->double x=l1.get(i)) List<Double> p2)->(return(p1.forEach((i)->double distance+=Math.abs(double x=p1.get(i)-double y=p2.get(i)))));
			assertEquals(actual,expected);
			
		}
		
		
		@Test
		public void verifyManhattanGet() {
//			List<List<Double>> p1=Arrays.asList({{1.0,2.0,3.0},{0.0,1.0,2.0},{1.0,0.0,2.0},{1.0,2.0,0.0},{3.0,1.0,2.0}});
			List<Double> p1=Arrays.asList(5.0,7.0,10.0);
			List<Double> p2=Arrays.asList(2.0,3.0,2.0);
			List<Double> p3=Arrays.asList(3.0,4.0,4.0);
			List<Double> p4=Arrays.asList(1.0,7.0,6.0);
			List<Double> p5=Arrays.asList(8.0,2.0,5.0);
//			List<List<Double>> manhattan_point =  new ArrayList<>();
//			manhattan_point.add(p1);
//			manhattan_point.add(p2);
//			manhattan_point.add(p3);
//			manhattan_point.add(p4); 
//			manhattan_point.add(p5);
			
//			System.out.println(Distance.matrix(manhattan_point,new Manhattan()));
//			double distance=0;
			
			Double expected=15.0;
			
			double actual=Distance.get(p1,p2,(List<Double> l1, List<Double> l2)->{double distance=0;
						for(int i=0;i<l1.size();i++) {
							double x=l1.get(i);
							double y=l2.get(i);
							distance+=Math.abs(x-y);}
						return distance;}); 
						
//			List<List<Double>> actual=Distance.matrix(manhattan_point,(List<Double> l1, List<Double> l2)->{double distance=0;
//			for(int i=0;i<l1.size();i++) {
//				double x=l1.get(i);
//				double y=l2.get(i);
//				distance+=Math.abs(x-y);}
//			return distance;}); 
//			
			assertEquals(actual,expected);
			}

}