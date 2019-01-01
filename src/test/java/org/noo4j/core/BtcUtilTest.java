package org.noo4j.core;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * @author tbrooks
 */
public class BtcUtilTest {

    @Test
    public void atLeast() {
        assertEquals(10, BtcUtil.atLeast(10, 10));
        assertEquals(11, BtcUtil.atLeast(11, 10));
        assertEquals(10, BtcUtil.atLeast(9, 10));

        BigDecimal decimal = new BigDecimal(1.1);
        assertEquals(new BigDecimal(1.1), BtcUtil.atLeast(decimal, 1.1));
        assertEquals(new BigDecimal(1.1), BtcUtil.atLeast(decimal, 1.0));
        assertEquals(BigDecimal.valueOf(1.0), BtcUtil.atLeast(null, 1.0));

        assertNotEquals(new BigDecimal(1.2), BtcUtil.atLeast(decimal, 1.2));
        assertEquals(BigDecimal.valueOf(1.2), BtcUtil.atLeast(decimal, 1.2));
        assertEquals(new BigDecimal(1.2).doubleValue(), BtcUtil.atLeast(decimal, 1.2).doubleValue(), .001);
    }
    
    @Test
    public void testNotNull() {

        BigDecimal decimal = null;
        assertNotNull(BtcUtil.notNull(decimal));
        BtcScript script = null;
        assertNotNull(BtcUtil.notNull(script));

        assertNotNull(BtcUtil.notNull(new BigDecimal(0)));
        assertNotNull(BtcUtil.notNull("null"));
    }

    @Test
    public void testNil() {
        assertNull(BtcUtil.nil(null));
        assertNull(BtcUtil.nil("null"));
        assertNull(BtcUtil.nil(""));
        assertNotNull(BtcUtil.nil("foo"));

    }
}