package onetoone;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pms.model.Account;
import com.pms.model.Product;



public class One_TMany_Test_Unidirectional {

	public static void main(String[] args) {
	SessionFactory sessionFactory =new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		
		/*
		 * Snack dish1 = new Snack(); dish1.setSnackId(1); dish1.setSnackName("Samosa");
		 * 
		 * Snack dish2 = new Snack(); dish2.setSnackId(2);
		 * dish2.setSnackName("Kachori");
		 * 
		 * Snack dish3 = new Snack(); dish3.setSnackId(3); dish3.setSnackName("Rusk");
		 * 
		 * Set<Snack> mydishes= new HashSet<Snack>(); mydishes.add(dish1);
		 * mydishes.add(dish2); mydishes.add(dish3);
		 * 
		 * Tea t= new Tea(); t.setTeaId(10); t.setTeaName("IraniTea");
		 * t.setSnacks(mydishes);
		 */
		Product p=new Product();
		p.setProductName("bag");
		p.setPrice(90.00);
		p.setQty(80.00);
		
		Product p1=new Product();
		p1.setProductName("bag1");
		p1.setPrice(90.00);
		p1.setQty(80.00);
		
		Set<Product> pset=new HashSet<Product>();
		
		pset.add(p);
		pset.add(p1);
		
		Account a=new Account();
		a.setName("Ram");
		a.setProducts(pset);
		
		session.beginTransaction();
		try{
			
			session.save(a);  //t with multiple set of snack  t o - s m
			session.getTransaction().commit();
			System.out.println("Data inserted successfully");
			
		}catch(HibernateException e){
			e.printStackTrace();
		}finally{
			if(session!=null){
				session.close();
			}
		}
		

	}

}
