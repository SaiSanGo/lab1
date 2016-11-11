package lab1;

import static org.junit.Assert.*;

import org.junit.Test;

public class btest {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		functionmain T=new functionmain();
		String str="x+3";
		String[] test={"x","3"};
		String[] result=T.expression(str);
			assertEquals(test,result);

	}

}
