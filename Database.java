import java.sql.*;

public class Database

{

public static void main(String arg[]) throws Exception {

Class.forName("org.sqlite.JDBC");

Connection con = DriverManager.getConnection("jdbc:sqlite:C:/sqllite/univ.db");

Statement stm=con.createStatement();

ResultSet rs=stm.executeQuery("select * from dept");

int depno;

String depname;

while(rs.next())

{

depno=rs.getInt("deptno");

depname=rs.getString("deptname");

System.out.println(depno +" "+ depname);

}

}
}