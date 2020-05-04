import java.util.*;
public class Test {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
      int indx=0;
      int min=0;
      for(int i=0;i<n-1;i++)
        {
          min=a[i];
          indx=i;
          for(int j=i+1;j<n;j++)
            {
              if(min>a[j])
               {
                 min=a[j];
                 indx=j;
               }

            }

            int t=a[i];
            a[i]=a[indx];
            a[indx]=t;

            for(int h=0;h<n;h++)
               System.out.print(a[h]+" ");
               System.out.println();
        }
        for(int i=0;i<n;i++)
           System.out.print(a[i]+" ");
    }
}
