import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo {

	public static void main(String [] args){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Stu");
			
			while(rs.next()){
				System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString("subject"));
			}
			con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
