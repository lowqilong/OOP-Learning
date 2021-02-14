
// import java.lang.* automatic
import java.util.*;

public class Test {
  public static void main(String[] args) {

    // Java generics
    // only reference data type for arraylist<>
    // any primitive data type got corresponding data type
    // byte --> Byte
    // short --> Short
    // int --> Integer
    // long --> Long
    // float --> Float
    // double --> Double
    // char --> Character
    // boolean --> Boolean --> Wrapper class 
    ArrayList<Integer> x = new ArrayList<>();
    // Boxing
    x.add(2);
    // unboxing
    int value = x.get(0);

    // autoboxing
    
  }
}
