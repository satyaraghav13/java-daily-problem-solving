package max;
//public final class java.lang.String implements java.io.Serializable, java.lang.Comparable, java.lang.CharSequence {
//public final class java.lang.Integer extends java.lang.Number implements java.lang.Comparable
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ListString {
public static void main(String[] args) {
   List<String> l= new 	ArrayList<String>();
   l.add("bala");
   l.add("dala");
   l.add("ala");
   l.add("kala");
   Collections.sort(l);
   //Collections.synchronizedList(l);
   for(String p:l)
   {
	   System.out.println(p);
   }
}
}
