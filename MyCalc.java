public class MyCalc
{
  public static void main(String[] args)
  {
    if (args[0].equals("add"))
    {
      double one = Double.parseDouble(args[1]);
      double two = Double.parseDouble(args[2]);
      System.out.println(one+two);
    }
      if (args[0].equals("sub"))
    {
      double one = Double.parseDouble(args[1]);
      double two = Double.parseDouble(args[2]);
      System.out.println(one-two);
    }
      
      if (args[0].equals("mult"))
    {
      double one = Double.parseDouble(args[1]);
      double two = Double.parseDouble(args[2]);
      System.out.println(one*two);
    }

     if (args[0].equalsIgnoreCase("divide"))
    {
      double one = Double.parseDouble(args[1]);
      double two = Double.parseDouble(args[2]);
      System.out.println(one/two);
    }
  
}
}