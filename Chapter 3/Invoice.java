
public class Invoice {
    private String number; // instance variable
    private String descript; // instance variable
    private int quantity; // instance variable
    private double price;
 public Invoice(String number,String descript,int quantity,double price){
     this.number = number;
     this.descript = descript;
     this.quantity = quantity;
     this.price = price;
}
// method to set the number in the object
public void setnumber(String name)
{
this.number = number; // store the name
}
// method to retrieve the number from the object
public String getnumber()
{
return number; // return value of number to caller
}
public void setdescript(String name)
{
this.descript = descript; // store the descript
}
// method to retrieve the descript from the object
public String getdescript()
{
return descript; // return value of descript to caller
}
 public void setquantity(int quantity)
{
this.quantity = quantity; // store the quantity
}
// method to retrieve the quantity from the object
public int getquantity()
{
return quantity; // return value of quantity to caller
}
public void setprice(double price)
{
this.price = price; // store the price
}
// method to retrieve the pricefrom the object
public double getprice()
{
return price; // return value of price to caller
}
public double getInvoiceAmount(double priceAmount,int quantityAmount)
{
    double invoiceAmount;
if (priceAmount < 0.0){ // if the priceAmount is valid
price = 0.0;}
if (quantityAmount < 0){ // if the quantityAmount is valid
quantity = 0;}
if (quantityAmount > quantity){
    System.out.println("out of stocks");}

invoiceAmount=price*quantityAmount;
return invoiceAmount;
}

}