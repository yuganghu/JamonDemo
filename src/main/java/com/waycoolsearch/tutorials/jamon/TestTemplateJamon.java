package com.waycoolsearch.tutorials.jamon;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TestTemplateJamon {
	public static String getContent(final String title, final String welcome,
			final String tutorial_url, final String tutorial_name,
			final java.util.List<String> list) throws IOException {
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		OutputStreamWriter writer = new OutputStreamWriter(bo);
		new TestTemplate().render(writer, title, welcome, tutorial_url,
				tutorial_name, list);
		return bo.toString();
	}
}
