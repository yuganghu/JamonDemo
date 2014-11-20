package com.waycoolsearch.tutorials.jamon;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

public class ListTemplateJamonTest {
	private static Logger log = Logger.getLogger(ListTemplateJamonTest.class);

	@Test
	public void testGenerateList() throws Exception {
		List<String> list = Arrays.asList("JAXB", "JAXP", "Flex", "Velocity",
				"Annotation", "Hibernate");

		String output = ListTemplateJamon.getContent(list);
		log.info(output);
		for (String value : list) {
			Assert.assertTrue(output.contains(value));
		}
	}
}
