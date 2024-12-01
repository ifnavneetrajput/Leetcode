class Solution {
      public double myPow(double x, int n) {
        
        long N = n; 
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        return power(x, N);
    }
    public double power(double x, long n) {

        
        if(n==0){
            return 1;
        }
        double halfPower = power(x,n/2);
        double halfPowerSquare = halfPower *halfPower;

        if(n%2!=0){
            halfPowerSquare = x * halfPowerSquare; 
        }
        return halfPowerSquare;
    }
}