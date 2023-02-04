import java.util.Scanner;
public class patterns {
    public static void main(String[] args){
        int i,j;
        int n=10;
        for (i=0;i<=n;i++){
          if(i==0 || i==n){
            for (j=0;j<=n;j++){
                System.out.print(" *");
            }
          }else if(i!=0 || i!=n){
            for(int k=0;k<=n;k++){
                if(k==0 || k==n){
                    System.out.print(" *");
                }else 
                System.out.print("  ");
            }
          }
            System.out.print("\n");
        }
    }
}
