import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DisjointSegmentSumFromArrayTest {

    @Test
    public void calculateMaximusTest1() {

        int k = 2;
        int l = 2;
        Integer[] a = {10, 19, 15};

        DisjontSegmentsSumFromArray disjontSegmentsSumFromArray = new DisjontSegmentsSumFromArray(k, l, a);
        disjontSegmentsSumFromArray.calculateMaximus();
        assertEquals(0, disjontSegmentsSumFromArray.getMax());

    }

    @Test
    public void calculateMaximusTest2() {

        int k = 3;
        int l = 2;
        Integer[] a = {6, 1, 4, 6, 3, 2, 7, 4};

        DisjontSegmentsSumFromArray disjontSegmentsSumFromArray = new DisjontSegmentsSumFromArray(k, l, a);
        disjontSegmentsSumFromArray.calculateMaximus();
        assertEquals(24, disjontSegmentsSumFromArray.getMax());

    }
}
