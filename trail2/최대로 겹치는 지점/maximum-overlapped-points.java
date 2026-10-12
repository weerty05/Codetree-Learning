import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] start = new int[n];
        int[] end = new int[n];
        int arr[]=new int[101];
        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();
            for(int k=start[i]-1;k<end[i];k++)
            {
                arr[k]++;
            }
        }
        int max=arr[0];
        for(int k:arr)
        {
            if(max<k)
            {
                max=k;
            }
        }
        // Please write your code here.
        System.out.print(max);

    }
}