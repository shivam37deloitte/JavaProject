package com.deloitte.abc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	public static final SessionFactory sessionFactory;

	static {
		try {
			// Create the SessionFactory from hibernate.cfg.xml
			sessionFactory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static final ThreadLocal session = new ThreadLocal();

	public static Session currentSession() throws HibernateException {
		Session s = (Session) session.get();
		// Open a new Session, if this thread has none yet
		if (s == null) {
			s = sessionFactory.openSession();
			// Store it in the ThreadLocal variable
			session.set(s);
		}
		return s;
	}

	public static void closeSession() throws HibernateException {
		Session s = (Session) session.get();
		if (s != null)
			s.close();
		session.set(null);
	}

	static Connection conn;
	static Statement st;

	public static void setup(String sql) {
		try {
			// Step 1: Load the JDBC driver.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loaded.");
			// Step 2: Establish the connection to the database.
			String url = "jdbc:oracle:thin:@desktop-m03s522:1522:teamdb";

			conn = DriverManager.getConnection(url, "shivam", "shivam37");
			System.out.println("Got Connection.");

			st = conn.createStatement();
			st.executeUpdate(sql);
		} catch (Exception e) {
			System.err.println("Got an exception! ");
			e.printStackTrace();
			System.exit(0);
		}
	}

	public static void checkData(String sql) {
		try {
			HibernateUtil.outputResultSet(st.executeQuery(sql));
			// conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void outputResultSet(ResultSet rs) throws Exception{
			ResultSetMetaData metadata = rs.getMetaData();

			int numcols = metadata.getColumnCount();
			String[] labels = new String[numcols]; 
			int[] colwidths = new int[numcols];
			int[] colpos = new int[numcols];
			int linewidth;

			linewidth = 1;
			for (int i = 0; i < numcols; i++) {
				colpos[i] = linewidth; 
				labels[i] = metadata.getColumnLabel(i + 1); // get its label
				int size = metadata.getColumnDisplaySize(i + 1);
				if (size > 30 || size == -1)
					size = 30;

}
}
}