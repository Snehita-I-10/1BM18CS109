import java.util.*;
class gene<T>
{
	T ob;
	gene(T ob1)
	{
	ob=ob1;
	}
	T ret()
	{
	return ob;
	}
	void showtype()
	{
	System.out.println("parameter type:"+ob.getClass().getName());
	}
}
class gendemo
{
 public static void main(String X[])
 {
  
  gene<Integer> g=new gene<Integer>(100);
  int x=g.ret();
  System.out.println(x);
  g.showtype();
  gene<String> s=new gene<String>("Generics");
  String s1=s.ret();
  System.out.println(s1);
  s.showtype();
  }
}

  
