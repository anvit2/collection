import slecscnd.setdemo;

import java .util.*;
public class listexample {
    void func1()
    {
        List lc = new ArrayList();
        lc.add("Coke");
        lc.add("pepsi");
        lc.add(500);
        lc.add("fruti");
        lc.add("Perk");
        System.out.println(lc);
        System.out.println("no. of item:"+lc.size());
        System.out.println("\n\n-------------------------------\n\n");
        System.out.println(lc.get(3));
       // lc.set(1."Limca");
        //lc.add(2."Limca");
       // lc.remove("fruti");
        //lc.clear();
        System.out.println(lc);
        System.out.println("no. of item :"+lc.size());

    }
    public static void main(String [] args)
    {
        listexample obj =new listexample();
        obj.func1();
    }
}


