package com.waycoolsearch.tutorials.jamon;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

public class TestTemplateJamonTest {
	private static Logger log = Logger.getLogger(TestTemplateJamonTest.class);

	@Test
	public void testIncludeOutput() throws Exception {
		List<String> list = Arrays.asList("JAXB", "JAXP", "Flex", "Velocity",
				"Annotation", "Hibernate");

		String output1 = TestTemplateJamon.getContent(
				"Jamon tutorials", "Welcome to Jamon tutorials!",
				"http://tutorials.waycoolsearch.com/java/", "java tutorial",
				list);;


		String output2 = ListTemplateJamon.getContent(list);

		log.info("Output1 = " + output1);
		log.info("Output2 = " + output2);
		Assert.assertTrue(output1.contains(output2));
	}

}
