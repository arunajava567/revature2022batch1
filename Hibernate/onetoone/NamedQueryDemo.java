package onetoone;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class NamedQueryDemo 
{    public static void main(String[] args) {
	Session session = HibernateUtil.getSessionFactory().openSession();
   	Query Q=session.createSQLQuery("select * from student");
   		 List <Object []> list=Q.list();	
    		 for(Object [] s:list)
    	  {  System.out.print(s[0]+"    ");
    		 System.out.println(s[1]);
    	  }
    		 
    /*ArrayList<Object> slist=(ArrayList<Object>)Q.list();
     	  Iterator i=slist.iterator();
       	  while(i.hasNext())
       	  {Object  s= i.next();
            System.out.println(s.toString());
      	  }
    	   	  
    	*/  
    	  session.close();
	}
}


/*
Query Q = sess.createQuery("from com.hcl.entity.Student s"); //hql
List <Person> list =Q.list();

System.out.println(list.toString());

for(Person p : list)
{
	  
	  	System.out.print(
	  	System.out.println();

sess.close();*/