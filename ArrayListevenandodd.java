//This program prints Even and Odd ArrayLists from an ArrayList in Java

import java.util.ArrayList;
public class ArrayListevenandodd {
    public static void main(String args[])
    {
        int a[] = {1,2,3,4,5,6};
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                even.add(a[i]);
            }
            else
            {
                odd.add(a[i]);
            }
        }
        System.out.print("Even ArrayList = ");
        for(int i=0;i<even.size();i++)
        {
            System.out.print(even.get(i)+" ");
        }

        System.out.println();

        System.out.print("Odd ArrayList = ");
        for(int i=0;i<odd.size();i++)
        {
            System.out.print(odd.get(i)+" ");
        }
    }
}