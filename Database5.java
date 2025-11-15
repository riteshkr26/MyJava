import java.sql.*;
import java.util.*;

public class Database5

{

public static void main(String arg[]) throws Exception {

Class.forName("org.sqlite.JDBC");

Connection con = DriverManager.getConnection("jdbc:sqlite:C:/sqllite/univ.db");

Statement stm=con.createStatement();

//stm. executeUpdate ("create table Temp (a integer,b float) ") ;
stm. executeUpdate ("drop table Temp") ;

stm.close();
con.close();

}
}