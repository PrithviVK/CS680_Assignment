package edu.umb.cs680.hw11;
import java.util.List;

public class Manhattan implements DistanceMetric {

	@Override
	public double distance(List<Double> p1, List<Double> p2) {
		double distance=0;
		for(int i=0;i<p1.size();i++) {
				double x=p1.get(i);
				double y=p2.get(i);
				distance+=Math.abs(x-y);
			}
		return distance;
		}
		

	
//	@Override
//	public double distance(List<Double> p1, List<Double> p2) {
//		double distance=0;
//		for(int i=0;i<p1.size();i++) {
//			for(int j=0;j<3;j++) {
//				Double x[]=(Double) p1.get(i);
//				distance+=Math.abs(p1.get(i[j])-p2.get(i));
//			}
//		}
//		return distance;
//		
//	}
	
}
