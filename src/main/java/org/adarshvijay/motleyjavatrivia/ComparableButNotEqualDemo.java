package org.adarshvijay.motleyjavatrivia;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ComparableButNotEqualDemo {

    public static void main(String[] args) {
        BigDecimal singlePrecision = new BigDecimal("1.0");
        BigDecimal doublePrecision = new BigDecimal("1.00");

        Set<BigDecimal> hashSet = addToTargetSet(new HashSet<>(), singlePrecision, doublePrecision);
        Set<BigDecimal> treeSet = addToTargetSet(new TreeSet<>(), singlePrecision, doublePrecision);

        System.out.println(hashSet);
        System.out.println(treeSet);
    }

    public static Set<BigDecimal> addToTargetSet(Set<BigDecimal> target, BigDecimal ...values) {
        Collections.addAll(target, values);
        return target;
    }
}