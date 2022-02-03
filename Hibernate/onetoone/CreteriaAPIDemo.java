package onetoone;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class CreteriaAPIDemo
{     public static void main(String[] args) throws Exception
     { 	Session session = HibernateUtil.getSessionFactory().openSession();
		 Criteria ctr = session.createCriteria(Student.class);
    	 List <Student> list = ctr.list();
    	 for(Student p : list)
    	 {	 System.out.print(p.getStdId()+" ");
    		 System.out.print(p.getFirstName()+" ");
    		 System.out.print(p.getLastName()+ " ");
    		 System.out.print(p.getAge()+ " ");
      	 }
    	 System.out.println();
    	ctr.add(Restrictions.lt("age",15 ));
    	 List <Student> list1 = ctr.list();
    	 for(Student p : list)
    	 {	 System.out.print(p.getStdId()+" ");
    		 System.out.print(p.getFirstName()+" ");
    		 System.out.print(p.getLastName()+ " ");
    		 System.out.print(p.getAge()+ " ");
    	 }    	 System.out.println();   	 
     }} 
     

