package online;

public class Online {


String userLoginId;
String name;
String paymentMode;
String Address;
public String userloginid;
public String placeOrder  (int quanity,String itemcode)
{
System.out.println("User "+name+" logged in with "+userLoginId);

return itemcode+" "+quanity+" "+paymentMode+" "+Address;
}
	

public boolean cancelOrder(int orderId)
{
	System.out.println("user "+ name+" is canceling the order");
	if(orderId>0)
	{
		return true;
	}else
	{
		return false;
	}
}
}
