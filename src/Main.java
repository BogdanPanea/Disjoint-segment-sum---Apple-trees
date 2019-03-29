public class Main {
    public static void main(String[] args) {
        int k = 2;
        int l = 2;
        Integer[] a = {10, 19, 15};

        int k2 = 3;
        int l2 = 2;
        Integer[] b = {6, 1, 4, 6, 3, 2, 7, 4};

        DisjontSegmentsSumFromArray disjontSegmentsSumFromArray = new DisjontSegmentsSumFromArray(k2, l2, b);
        disjontSegmentsSumFromArray.calculateMaximus();
        System.out.println(disjontSegmentsSumFromArray.getMax());
    }
}
