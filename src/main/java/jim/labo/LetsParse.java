package jim.labo;

import java.io.InputStream;

public class LetsParse {

	public static void main(String[] args) {
		// Let's Parse XML !!
		
		InputStream exemple = fichierExemple();
		
		
		// Dom, Sax, XPath, JAXB...

	}

	private static InputStream fichierExemple() {
		final String ex = "toto-clients.xml";
		return LetsParse.class.getClassLoader().getResourceAsStream(ex);
	}

}
