package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import com.sms.model.*;

public class CRUD_MainStudent {

	String dbURL = connection.dbURL;
	String sql_username = connection.username;
	String sql_password = connection.password;

	
public List<tblStudents> getGPAByStudentID(String studentid)
{
	return null;
}

public int getMainStudentIdByName(String username)
{
	int student_id = 0;
	try {
		 
	    Connection conn = DriverManager.getConnection(dbURL, sql_username, sql_password);
	 
	    if (conn != null) {
	        System.out.println("Connected");
	    }
	    
	    String sql = "select * from tblStudents where studentid='"+ username + "'";
	    
	    Statement statement = conn.createStatement();
	    ResultSet result = statement.executeQuery(sql);
 

	    while (result.next())
	    {
	    	int unique_student_id = result.getInt("id");
	    	student_id = unique_student_id;
	    }
	} 
	catch (SQLException ex) {
	    ex.printStackTrace();
	}
	return student_id;
}
}
