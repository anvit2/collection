//hash set example
package slecscnd;
import java .util.*;
public class setdemo {
    void func()
    {
        Set sc=new HashSet();
        sc.add("coke");
        sc.add("pepsi");
        sc.add(500);
        sc.add(5.6);

        if(sc.isEmpty())
        {
            System.out.println("trolley is empty");
        }
        else
        {
        System.out.println(sc);
        System.out.println("no. of item"+sc.size());
    }
        if(sc.contains("ucoke"))
        {
            System.out.println("Found");
            System.out.println(sc);
            System.out.println("no. of item :"+ sc.size());
        }
        else
        {
            System.out.println("not found");
        }
    }
    public static void main(String [] args)
    {
        setdemo obj =new setdemo();
        obj.func();
    }
}
