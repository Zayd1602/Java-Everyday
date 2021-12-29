// Write a java program to calculate the sum of every mth and kth digit in the given number. 
// The input consists of a single integer 'n' which corresponds to the given number. 
// In case if k or m is greater than the number of digits presents in n, print 1.

// Input format
// Integer n
// Integer m
// Integer k

import java.util.*; 
class calculate
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n,m,k,num,sum=0,c=0;
        n = scan.nextInt();
        m = scan.nextInt();
        k = scan.nextInt();
        num = n;
        while(n>0)
        {
            n= n/10;
            c++;
        }
        int arr[]=new int[c];
        for (int i=1;i<=c;i++)
        {
            arr[c-i] = num%10;
            num = num/10;
        }
        int i,j;
        i=k-1;
        j=m-1;
        while(i<c && j<c)
        { 
            sum += arr[i]+arr[j];
            i+=k;
            j+=m;  
        }
        if(c<k || c<m)
            System.out.println(-1);
        else
            System.out.println(sum);
    }
}

