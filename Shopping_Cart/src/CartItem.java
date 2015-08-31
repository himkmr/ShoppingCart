
public class CartItem {
String item_name;
double  item_price;
int quantity;

public static CartItem getItem(String name, double price, int quantity)
{
	CartItem c = new CartItem();
	c.item_name = name;
	c.item_price = price;
	c.quantity = quantity;
	
	return c;
}
}
