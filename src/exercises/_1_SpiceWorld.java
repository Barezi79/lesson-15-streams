package exercises;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class _1_SpiceWorld {
	/*
	 * Replace the anonymous inner class with a lambda expression.
	 */

	public static void main(String[] args) throws IOException {
		/*
		 * SpiceGirl sporty = new SpiceGirl() {
		 * 
		 * @Override public void perform() { System.out.println("Do backflips.");
		 * 
		 * } };
		 */
		SpiceGirl sporty = () -> System.out.println("Do backflips.");
		sporty.perform();
		
		File file = new File("src/copyright");
		file.createNewFile();
		System.out.println(file.getAbsolutePath());
		FileUtils.write(file, "Copyright Branislav Nesic, 2019");
	}
}

interface SpiceGirl {
	void perform();
}
