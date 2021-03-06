/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package segurtasun;

import junit.framework.TestCase;

public class OrdezkatzeHiztegiaTest extends TestCase {
    OrdezkatzeHiztegia app = null;

    public void setUp() throws Exception {
        super.setUp();
        app = new OrdezkatzeHiztegia();
    }

    public void tearDown() throws Exception {
    }

    public void testZifratu() {
        assertEquals("BP MZTVB MBWWZWBJ ZGVB", app.zifratu("EZ GAUDE GERRAREN ALDE"));
    }
    public void testDeszifratu() {

        assertEquals("EZ GAUDE GERRAREN ALDE",
                app.deszifratu(
                        app.zifratu("EZ GAUDE GERRAREN ALDE")));

    }
}

