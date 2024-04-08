package org.adarshvijay.motleyjavatrivia;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class ComparableButNotEqualTest {

    @Test
    public void testAdditionByComparesTo() {
        BigDecimal singlePrecision = new BigDecimal("1.0");
        BigDecimal doublePrecision = new BigDecimal("1.00");

        Set<BigDecimal> result = ComparableButNotEqualDemo.addToTargetSet(new TreeSet<>(),
                singlePrecision, doublePrecision);

        assertThat("A TreeSet uses compareTo(), which treats the two values as equal ",
                result.size(), equalTo(1));
    }

    @Test
    public void testAdditionByEqualsTo() {
        BigDecimal singlePrecision = new BigDecimal("1.0");
        BigDecimal doublePrecision = new BigDecimal("1.00");

            Set<BigDecimal> result = ComparableButNotEqualDemo.addToTargetSet(new HashSet<>(),
                singlePrecision, doublePrecision);

        assertThat("A HashSet uses equals(), which treats the two values as equal ",
                result.size(), equalTo(1));
    }

    @Test
    public void comparesToVersusEquals() {
        BigDecimal singlePrecision = new BigDecimal("1.0");
        BigDecimal doublePrecision = new BigDecimal("1.00");

        assertThat("1.0 != 1.00", singlePrecision.equals(doublePrecision), is(false));
        assertThat("Unless you are trying to sort them", singlePrecision.compareTo(doublePrecision),
                equalTo(0));
    }
}