import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.Result;

public class jdbcImageret {
public static void main(String[] args) {
	Connection connection=null;
	PreparedStatement pst=null;
	ResultSet rs=null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","sql799");
	       pst=connection.prepareStatement("select*from offer_latter");
	       rs=pst.executeQuery();
	       while(rs.next()) {
	    	   
	       File f=new File("D:\\IOFolder\\dbfil_retr.txt");
	       f.createNewFile();
	       FileOutputStream fos=new FileOutputStream("D:\\IOFolder\\dbfil_retr.txt");
	       
	       fos.write(rs.getBytes(3));
	       System.out.println("success");
	       
	       
	}
	
	
}
	catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	finally {
		try {
			rs.close();
			pst.close();
			connection.close();
		}
		catch (Exception e) {
  e.printStackTrace();			// TODO: handle exception
		}
	}
		
	}
	
	
}
