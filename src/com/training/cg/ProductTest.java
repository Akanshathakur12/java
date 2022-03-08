package com.training.cg;

public class ProductTest {
	public static void main(String args[]) {
		Product pro1= new Product();
		Product pro2= new Product();
		Product pro3= new Product();
		Product pro4= new Product();
		Product pro5= new Product();
		int h;
		
		pro1.setProdId("1001");
		pro1.setProdName("CHAIR");
		pro1.setProdDesc("A Wooden chair with Comfortable cushions ");
		pro1.setPrice(2000);
		
		pro2.setProdId("1002");
		pro2.setProdName("BAG");
		pro2.setProdDesc("A large black colored bag for travelling");
		pro2.setPrice(1000);
		
		pro3.setProdId("1003");
		pro3.setProdName("PEN");
		pro3.setProdDesc("A blue ink pen for smooth writing");
		pro3.setPrice(10);
		
		pro4.setProdId("1004");
		pro4.setProdName("SHIRTS");
		pro4.setProdDesc("Fancy shirts for all age groups");
		pro4.setPrice(500);
		
		pro5.setProdId("1005");
		pro5.setProdName("SHOES");
		pro5.setProdDesc("Sports shoes for sports enthusiast ");
		pro5.setPrice(1000);
		
		h= compare(pro1.getPrice(),pro2.getPrice(),pro3.getPrice(),pro4.getPrice(),pro5.getPrice());
		
		
		System.out.println("Product with highest price is: ");
		System.out.println(pro1.getProdId());
		System.out.println(pro1.getProdName());
		System.out.println(pro1.getProdDesc());
		//System.out.println(pro1.getPrice());
		System.out.println(h);
		
	

		
		
	}
public  static int compare(int a,int b,int c,int d,int e) {
		
		if((a>b)&&(a>c)&&(a>d)&&(a>e)){
			return a;
		}
		else if((b>c)&&(b>d)&&(b>e)) {
			return b;
		}
		else if((c>d)&&(c>e)) {
			return c;
		}
		else if(d>e) {
			return d;
		}
		else {
			return e;
		}
		
	}


}
