class SwiggyRunner{
public static void main(String foods[])//why void here
{
 double price = Swiggy.takeOrder("alooParota");
System.out.println("the price is:"+price);
double  price1 = Swiggy.takeOrder("doosa");
System.out.println("The price of doosa is"+price1);

}

}