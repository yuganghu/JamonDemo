package com.waycoolsearch.tutorials.jamon;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

public class ListTemplateJamon {
    public static String getContent(List<String> list) throws IOException {
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        new ListTemplate().render(new OutputStreamWriter(bo), list);

        return bo.toString();
    }
}
