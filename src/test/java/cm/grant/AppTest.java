package cm.grant;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase {
    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * This should pass if we compile.
     */
    public void testApp() {
        assertNotNull(CustomString.testString);
    }
}
