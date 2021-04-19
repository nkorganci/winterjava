//package day41javadeveloper.Q108;
//
//import java.sql.Connection;
//import java.sql.JDBCType;
//import java.sql.PreparedStatement;
//
//public class Question108 {
//
//
///* ANSWER C
// *
// * What does executing this code fragment do?
//	A. inserts two rows (101, 'SMITH', 'HR') and (102, 'JONES', NULL)
//	B. inserts two rows (101, 'SMITH', 'HR') and (102, 'JONES', 'HR')
//	C. inserts one row (101, 'SMITH', 'HR')
//	D. throws a SQLException
// *
// */
//
//
//	public static void main(String[] args) {
//
//		try (Connection conn = ds.getConnection();
//				PreparedStatement ps = conn.prepareStatement("INSERT INTO EMP VALUES(?,?,?)")){
//				ps.setObject(1, 101,JDBCType.VARCHAR);
//				ps.setObject(2, "SMITH",JDBCType.VARCHAR);
//				ps.setObject(3, "HR",JDBCType.VARCHAR);
//				ps.executeUpdate();
//				ps.setInt(1, 102);
//				ps.setString(2, "JONES");
//				ps.executeUpdate();
//			}
//
//	}
//
//}
