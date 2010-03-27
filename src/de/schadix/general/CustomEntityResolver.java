package de.schadix.general;

import java.io.IOException;
import java.io.InputStreamReader;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class CustomEntityResolver extends Object implements EntityResolver {

	@Override
	public InputSource resolveEntity(String publicId, String systemId)
			throws SAXException, IOException {
		if (systemId
				.equals("http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd")) {
			return new InputSource(new InputStreamReader(
					CustomEntityResolver.class
							.getResourceAsStream("/xhtml1-strict.dtd")));
		} else if (systemId.contains("xhtml-lat1.ent"))
			return new InputSource(new InputStreamReader(
					CustomEntityResolver.class
							.getResourceAsStream("/xhtml-lat1.ent")));
		else if (systemId.contains("xhtml-symbol.ent"))
			return new InputSource(new InputStreamReader(
					CustomEntityResolver.class
							.getResourceAsStream("/xhtml-symbol.ent")));
		else if (systemId.contains("xhtml-special.ent"))
			return new InputSource(new InputStreamReader(
					CustomEntityResolver.class
							.getResourceAsStream("/xhtml-special.ent")));
		else
			return null;
	}
}
