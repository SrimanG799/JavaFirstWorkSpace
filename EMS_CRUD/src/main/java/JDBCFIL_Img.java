import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ciqconnection.UtilConnection;

public class JDBCFIL_Img {
	public static void main(String[] args) {
		Connection connection=null;
		PreparedStatement pst=null;
		//ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","sql799");
		
		pst=connection.prepareStatement("insert into offer_latter values(?,?,?)");
                       pst.setInt(1,1);
                       pst.setString(2, "pooja");
                      FileReader fi=new FileReader("D:\\IOFolder\\FileTrwo.txt");
                       pst.setClob(3, fi);
                      pst.execute();
                      System.out.println("success");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				pst.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}