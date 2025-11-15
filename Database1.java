import java.sql.*;

public class Database1

{

public static void main(String arg[]) throws Exception {

Class.forName("org.sqlite.JDBC");

Connection con = DriverManager.getConnection("jdbc:sqlite:C:/sqllite/univ.db");

Statement stm=con.createStatement();

ResultSet rs=stm.executeQuery("select * from student");


while(rs.next())

{

System. out.print (rs.getInt("roll")+" ");
System. out.print (rs.getString("name")+" ");
System. out.print (rs.getString("city")+" ");
System. out.println (rs.getInt(4)+" ");
}
stm.close();
con.close();

}
}