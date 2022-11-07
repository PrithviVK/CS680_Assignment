package edu.umb.cs680.hw06.Template_Test;
//import edu.umb.cs680.hw06.Model_ABC.*;
import edu.umb.cs680.hw06.PrintingFramework.PrintJob;
import edu.umb.cs680.hw06.SecurityContext.SecurityContext;
//import edu.umb.cs680.hw06.Model_XYZ.PrintJobExecutor;
//import edu.umb.cs680.hw06.PrintingFramework.PrintJob;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class HW6_Test {

	String pwd="hello123";
	@Test
	public void testModelABC() {
		edu.umb.cs680.hw06.Model_ABC.PrintJobExecutor ex=new edu.umb.cs680.hw06.Model_ABC.PrintJobExecutor ();
		PrintJob job=new PrintJob();
		ex.execute(job,pwd,SecurityContext.getInstance());	
	}
	
	
	@Test
	public void testModelXYZ() {
		edu.umb.cs680.hw06.Model_XYZ.PrintJobExecutor ex=new edu.umb.cs680.hw06.Model_XYZ.PrintJobExecutor();
		PrintJob job=new PrintJob();
		ex.execute(job,null, null);
	}
}
