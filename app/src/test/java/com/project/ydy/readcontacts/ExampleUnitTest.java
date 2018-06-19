package com.project.ydy.readcontacts;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
        ArrayList<String> data = new ArrayList<>();
        data.add("a");
        data.add("b");
        data.add("c");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < data.size(); i++) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append("'").append(data.get(i)).append("'");
        }
        System.out.println(sb.toString());

    }
}