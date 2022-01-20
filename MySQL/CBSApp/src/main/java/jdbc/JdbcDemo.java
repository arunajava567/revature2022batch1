package jdbc;
import java.sql.*;
import java.util.Scanner;
public class JdbcDemo {

	public static void main(String[] args) throws Exception {
		// 1 register driver
		Class.forName("com.mysql.cj.jdbc.Driver");//"com.mysql.jdbc.Driver"
		
		//2 creating connection
		
		Connection con=
		DriverManager.getConnection("jdbc:mysql://localhost:3307/cbs1", "root", "root");
		
		//3 step
		Statement st=con.createStatement();
		//DML 
	//	st.executeUpdate("create table customer(id int,name varchar(20))");
		
	//	st.executeUpdate("insert into customer values(1,'ram')");
	//	st.executeUpdate("insert into customer values(2,'ram')");
	//	st.executeUpdate("update  customer set name='Ram' where id=1");
	//	st.executeUpdate("delete from customer where id=2");
	//	System.out.println("rows are inserted...");
		PreparedStatement pst=con.prepareStatement("insert into customer values(?,?)");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 3 customer records");
		for(int i=1;i<=3;i++) {
			int id=sc.nextInt();   sc.nextLine();
			String name=sc.nextLine();
			pst.setInt(1,id);
			pst.setString(2, name);
			pst.execute(); //insert 
		}
		
		
		//DQL
		ResultSet rs=st.executeQuery("select * from customer");
		while(rs.next()) {
			System.out.println(rs.getString(1)+" "+ rs.getString(2));
		}
		
		
		
		
		

	}

}
