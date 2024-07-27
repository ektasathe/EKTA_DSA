/QUE 2:/no is prime or not
//no should be dvisible by 1 and itself nd total no of divisors should be 2
//time  > O(√n)
class Solution{
    static int isPrime(int N){
        // code here
        if(N==1)
        {
             return 0;
        }
        for(int i=2;i<=Math.sqrt(N);i++)  //for(int i=2;i<=N/2;i++)
        {
            if(N%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
}
