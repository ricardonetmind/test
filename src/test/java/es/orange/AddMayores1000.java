package es.orange;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddMayores1000 {

	@Test
	public void test() {
		//fail("Not yet implemented");
		assertTrue(true);
	}
	
	@Test
	public void suma1001() {
		assertTrue(App.add("1,1001") == 1);
	}
	
	@Test
	public void suma10001() {
		assertTrue(App.add("1,10001") == 1);
	}
	
	@Test
	public void suma2000() {
		assertTrue(App.add("1,2000") == 1);
	}

}
