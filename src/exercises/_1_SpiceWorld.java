package exercises;

import java.io.File;
import java.io.IOException;
import java.util.List;

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
		
		String myPath = new java.io.File("src").getCanonicalPath();
		File C = new File(myPath);
		String[] extensions = new String[] { "java" };
		String Copyright = "Copyright Branislav Nesic, 2019";

		List<File> files = (List<File>) FileUtils.listFiles(C, extensions, true);
		for (File sourceFile : files) {
			String fileContent = FileUtils.readFileToString(sourceFile);
			if (!fileContent.endsWith(Copyright)) {
				FileUtils.writeStringToFile(sourceFile, "\n" + Copyright, true);
		}
	}
}

interface SpiceGirl {
	void perform();
	}
}

// Copyright Branislav Nesic, 2019