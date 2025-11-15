import java.sql.*;
import java.util.*;

public class Database3

{

public static void main(String arg[]) throws Exception {

Class.forName("org.sqlite.JDBC");

Connection con = DriverManager.getConnection("jdbc:sqlite:C:/sqllite/univ.db");

Statement stm=con.createStatement();

stm.executeUpdate("insert into dept values(60,'MCA')");
stm.executeUpdate("insert into dept values(70,'BCA')");
//stm.executeUpdate("delete from dept where deptno>=60");
stm.executeUpdate("update dept set deptname='Chem' where deptno=50");


stm.close();
con.close();

}
}