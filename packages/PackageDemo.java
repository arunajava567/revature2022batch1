import pack1.Sum;
import pack1.Product;

public class PackageDemo
{
	public static void main(String[] args)
	{
		Sum s = new Sum();
		
		System.out.println("Sum:"+s.add(10,20));

		Product p = new Product();
		
		System.out.println("Product:"+p.mul(10,20));
	}
}