package challenge;

import java.util.Scanner;

public class Solution2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<1;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            String x1 = String.valueOf(x);
            //Complete this line
            if (x1.length()==2){
                x1="0"+x1;
            }else if(x1.length()==1){
                x1="00"+x1;
            }
            StringBuilder space=new StringBuilder();
            for (int j = 0; j < 15-s1.length(); j++) {
                space.append(" ");
            }
            //System.out.format(s1+"%"+15+"s",""+x1+"\n");
            System.out.println(s1+space+x1);
        }
        System.out.println("================================");
    }
}



