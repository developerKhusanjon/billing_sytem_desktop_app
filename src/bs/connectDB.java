package bs;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class connectDB {
	static Connection con = null;
	
	public static Connection connect() {
		try {
			Class.forName("org.sqlite.JDBC");
			con = DriverManager.getConnection("jdbc:sqlite:Users.sqlite");
			System.out.println("connected succesfully....");
		} catch(Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null, e);
		}
		
		return con;
	}
}
