package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        long[][] num = new long[n][3];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < 3; i++) {
                num[j][i] = input.nextLong();
            }
        }
        for(int i=0;i<n;i++)
        {
            long [] temp=new long[3];
            for(int j=0;j<3;j++)
            {
                temp[j]=num[i][j];
            }
            if(temp[0]+temp[1]>temp[2])
            {
                System.out.printf("Case #%d: true\n",i+1);
            }
            else{
                System.out.printf("Case #%d: false\n", i + 1);
            }
        }

    }
}