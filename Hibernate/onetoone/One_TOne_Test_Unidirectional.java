package onetoone;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class One_TOne_Test_Unidirectional {

	public static void main(String[] args) {
		SessionFactory sessionFactory =new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		LaptopBag bag1 = new LaptopBag();
		bag1.setBagId(1003);
		bag1.setColor("Blue");
		
		Scholar scholar1 = new Scholar();
		scholar1.setScholarId(4);
		scholar1.setScholarName("Ram3");
		scholar1.setBag(bag1);
		
		session.beginTransaction();
		try{
			session.save(scholar1);
			session.getTransaction().commit();
			System.out.println("Data inserted successfully");
		
		}catch(HibernateException e){
			e.printStackTrace();
		}finally {
			if(session!=null){
				session.close();
			}
		}
		

	}

}
