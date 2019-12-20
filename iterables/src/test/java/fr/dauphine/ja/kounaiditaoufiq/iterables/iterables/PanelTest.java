package fr.dauphine.ja.kounaiditaoufiq.iterables.iterables;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class PanelTest extends TestCase {

	 /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PanelTest( String testName ) {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite(){
        return new TestSuite( PanelTest.class );
    }

    
    public void testPanel(){
        assertTrue( true );
    }

}
