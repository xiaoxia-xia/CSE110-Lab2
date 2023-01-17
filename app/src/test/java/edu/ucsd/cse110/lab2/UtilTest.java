package edu.ucsd.cse110.lab2;

import org.junit.Test;
import static org.junit.Assert.*;

public class UtilTest {
    @Test
    public void test_trim(){
        assertEquals("1.234",Utilities.trimDisplayStr("1.2340"));
        assertEquals("13", Utilities.trimDisplayStr("13.0"));
    }
}
