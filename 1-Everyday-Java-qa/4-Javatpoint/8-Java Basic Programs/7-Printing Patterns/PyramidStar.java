<<<<<<< HEAD
public class PyramidStar {
    public static void main(String args[]){
        int row = 5;
        for(int i=1;i<=row;i++){
            for(int t=row-i;t>=1;t--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/* Output is 
    * 
   * *
  * * *
 * * * *
* * * * *
=======
public class PyramidStar {
    public static void main(String args[]){
        int row = 5;
        for(int i=1;i<=row;i++){
            for(int t=row-i;t>=1;t--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/* Output is 
    * 
   * *
  * * *
 * * * *
* * * * *
>>>>>>> cb9d92341e9ff39c69159e2c49b036eee628df7b
*/