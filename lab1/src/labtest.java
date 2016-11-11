package lab1;

import static org.junit.Assert.*;

import org.junit.Test;

public class labtest {

	@Test
	public void testDerivative() {
		String x;
		x="x";
		String[] str={"y"};
		String[] test={""};
		functionmain temp1=new functionmain();
		temp1.derivative(str, x);
		assertArrayEquals(str,test);

	}

}
