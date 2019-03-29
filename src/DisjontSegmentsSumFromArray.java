public class DisjontSegmentsSumFromArray {
    private Integer n;
    private Integer k;
    private Integer l;
    private Integer[] a;
    private int max = 0;

    public DisjontSegmentsSumFromArray() {
    }

    public DisjontSegmentsSumFromArray(Integer k, Integer l, Integer[] a) {
        this.k = k;
        this.l = l;
        this.a = a;
        this.n = a.length;
    }

    public int getMax() {
        return max;
    }

    public int calculateMaximus() {

        int max = 0;

        if (n < k + l) {
            return -1;
        } else {
            for (int i = 0; i <= n - k; i += 1) {
                int sumK = 0;
                for (int iK = i; iK < k + i; iK++) {
                    sumK += a[iK];
                }
                if (i >= l) {
                    for (int j = 0; j <= i - l; j++) {
                        int sumL = 0;
                        for (int iJ = j; iJ < l + j; iJ++) {
                            sumL += a[iJ];
                        }
                        if (max < sumK + sumL) {
                            max = sumK + sumL;
                        }
                    }
                }
                for (int j = k + i; j <= n - l; j++) {
                    int sumL = 0;
                    for (int iJ = j; iJ < l + j; iJ++) {
                        sumL += a[iJ];
                    }
                    if (max < sumK + sumL) {
                        max = sumK + sumL;
                    }
                }
            }
            this.max = max;
            return max;
        }
    }
}
