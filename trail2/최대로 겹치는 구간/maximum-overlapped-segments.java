import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        int[]arr=new int[200];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
           
        }
        
        for(int i=0;i<n;i++) {
            if(i<n-1&&(x2[i]==x1[i+1]))
            {
                continue;
            }
              for(int j=x1[i];j<x2[i];j++)
              {        
                 
                    arr[j+100]++;
                  
                
              }
        }
      
        int max=arr[0];
        for(int i=0;i<200;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.print(max);
       
       
    
    }
}