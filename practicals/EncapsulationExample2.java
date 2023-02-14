class Product{
    private int prod_id;
	private String prod_name;
	private String prod_color;
	private double prod_price;
	
	//getter setter method
	public int prod_id(){
	    return prod_id;
	}
	public void setId(int prod_id){
	    this.prod_id=prod_id;
	}
	public String prod_name(){
	    return prod_name;
	}
	public void setName(String prod_name){
	    this.prod_name=prod_name;
	}
	public String prod_color(){
	    return prod_color;
	}
	public void setColor(String prod_color){
	    this.prod_color=prod_color;
	}
	public double prod_price(){
	    return prod_price;
	}
	public void setPrice(double prod_price){
	    this.prod_price=prod_price;
	}
}
class EncapsulationExample2{
	public static void main(String args[]){
		Product p = new Product();
		p.setId(1);
		p.setName("Car");
		p.setColor("Navy Blue");
		p.setPrice(135000);
		System.out.println("Product id:"+p.prod_id()+" "+"Product name:"+p.prod_name()+" "+"Product color:"+p.prod_color()+" "+"Product price:"+p.prod_price());
	}
}