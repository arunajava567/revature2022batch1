package onetoone;

import org.hibernate.HibernateException;
import org.hibernate.Session;



public class One_TOne_Test_Bidirectional {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();

		LaptopBag bag1 = new LaptopBag();
		bag1.setBagId(1002);
		bag1.setColor("Red");

		Scholar scholar1 = new Scholar();
		scholar1.setScholarId(2);
		scholar1.setScholarName("Raj");
		
		scholar1.setBag(bag1);
		bag1.setScholar(scholar1);

		session.beginTransaction();
		try {
			session.save(bag1);
			session.getTransaction().commit();
			System.out.println("Data inserted successfully");

		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

}
