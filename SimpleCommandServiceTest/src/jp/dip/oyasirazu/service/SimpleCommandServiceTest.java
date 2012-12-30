package jp.dip.oyasirazu.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleCommandServiceTest {

    @Test
    public void testPandoc() {
        SimpleCommandService scs = new SimpleCommandService();
        String result = scs.pandoc(new String[]{"-f", "markdown", "-t", "html"}, "aaa\n===\n");

        assertNotNull(result);
        assertEquals(result, "<h1 id=\"aaa\">aaa</h1>\n");

        result = scs.pandoc(new String[]{"-f", "markdown", "-t", "latex"}, "aaa\n===\n");

        assertNotNull(result);
        assertEquals(result, "\\section{aaa}\n");
    }

}
