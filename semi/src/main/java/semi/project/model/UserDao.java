package semi.project.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
//import static semi.project.common.JdbcTemplate.*;

public class UserDao {
	public UserDto SelectOne() {
		Connection conn=null;
		UserDto result = null;
		PreparedStatement pmtm =null;
		ResultSet rs = null;
		String query = "select * from member_tbl_02";
		try {
		pmtm = conn.prepareStatement(query);
		
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
	
		}
		
		
		
		
		return result;
	}
	public List<UserDto> selectList() {  // 전체 보기
		List<UserDto> result = null;
		//CUSTNO,CUSTNAME,PHONE,ADDRESS,JOINDATE,GRADE,CITY
		Connection conn =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn =  DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "KM", "KM");
			if(conn != null) {
				System.out.println("DB연결 성공!!!!!!!!!");
			} else {
				System.out.println("------ DB 연결 실패------");
			}
			
			
			String query= "select * from member_tbl_02";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()==true) {
				result = new ArrayList<UserDto>();
					UserDto vo = new UserDto();
//					 private int custno;
//					 private String custname;
//					 private String phone;
//					 private String address;
//					 private String joindate;
//					 private String grade;
//					 private String city;
					 
				vo.setCustno(rs.getInt("custno"));
				vo.setCustname(rs.getString("custname"));
				vo.setPhone(rs.getString("phone"));
				vo.setAddress(rs.getString("address"));
				vo.setJoindate(rs.getString("joindate"));
				vo.setGrade(rs.getString("grade"));
				vo.setCity(rs.getString("city"));
				result.add(vo);
			}	
				
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null) {
					pstmt.close();
				}
				if(conn!=null) {
					conn.close();
				}

			}catch(SQLException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println(result);
		return result;
		
	}
	
}
