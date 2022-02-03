package onetoone;

import java.util.List;




import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class HQLDemo 
{      public static void main(String[] args) {
    	  Session session = HibernateUtil.getSessionFactory().openSession();
  
    	 Query Q = session.createQuery("from onetoone.Student p"); //hql
    	 List <Student> list =Q.list();
   
    	  for(Student p : list)
    	  {
    		   	System.out.print(p.getStdId()+" ");
    		  	System.out.print(p.getFirstName()+" ");
    		  	System.out.print(p.getLastName()+" ");
    		  	System.out.print(p.getAge()+" ");
    		  	System.out.println();
    }
    	
    	  session.close();
    	  }
}
