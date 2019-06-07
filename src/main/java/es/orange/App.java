package es.orange;

/**
 * Hello world!!x!!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}

	public static int add(String nums) {
		//sahdjksahfdkj
		String[] nums_arr = nums.split(",");
		int suma = 0;
		for (String unNum : nums_arr) {
			int numToAdd=unNum.trim().equals("") ? 0:Integer.parseInt(unNum.trim());
			suma += numToAdd>=1000?0:numToAdd;
		}
		return suma;

	}

}
