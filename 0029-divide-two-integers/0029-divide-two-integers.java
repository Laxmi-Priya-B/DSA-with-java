class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        if(dividend == -1 && divisor == -1){
            return 1;
        }
        long Dividend = Math.abs((long)dividend);
        long Divisor = Math.abs((long)divisor);
        int res = 0;
        while(Dividend >= Divisor){
            long temp = Divisor;
            int x = 1;
            while(Dividend >= (temp << 1)){
                temp <<= 1;
                x <<= 1;
            }
            Dividend -= temp;
            res += x;
        }
        if((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0)){
            return res;
        }
        return -res;
    }
}

