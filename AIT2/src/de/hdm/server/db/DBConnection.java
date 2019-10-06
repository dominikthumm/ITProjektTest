package de.hdm.server.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class DBConnection {
	
    private static Connection con = null;

    private static String googleUrl = "jdbc:google:mysql://bankproject-154007:bankproject/bankproject?user=demo&password=demo";

    private static String localUrl = "jdbc:mysql://127.0.0.1:3306/bankproject?user=demo&password=demo";

    
	public static Connection getConnection()  {

		/*
		 * Herstellung einer DB Verbindung, wenn bisher keine Verbindung besteht
		 */
		checkConnection();
		if (con == null) {
			try {

				/*
				 * Neue Instanz mysl Konnektor (JDBC). Bisher nur localUrl, später durch
				 * googleUrl ersetzt.
				 */

				Class.forName("com.mysql.jdbc.GoogleDriver"); // ladet den JDBC Driver Connector für mysql
				con = DriverManager.getConnection(localUrl);

				/*
				 * Die Verbindung zur Datenbank wird in der Variablen con mit den dazugehoerigen
				 * Informationen gespeichert
				 */

				Statement s = con.createStatement();
				System.out.println("DB Connection!");

				/*
				 * Veranschaulichung ob die Datenbankverbindung zu stande gekommen ist
				 */

			} catch (Exception e) {

				// TODO: handle exception
				//throw new MapperException(e); // throw new RuntimeException() nötig?
			}

			/*
			 * Verfolgt beim Debuggen den Fehler bis zum Ursprung
			 */

		}

		return con;
	}

	private static void checkConnection() {
		if (con != null) {
			try {
				Statement s = con.createStatement();
				s.execute("Select 1");

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				con = null;
			}
		}

	}
}
