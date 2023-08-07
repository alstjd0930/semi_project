package semi.project.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static semi.project.common.JdbcTemplate.*;

import semi.project.DTO.MemberDto;

public class MemberDao {
	public List<MemberDto> MemberList(){
		List<MemberDto> result = null;
		String query = "SELECT * FROM member_tbl_02";
		Connection conn = null;
		PreparedStatement ptmt =null;
		ResultSet rs = null;
		try {
			conn=getConnection();
			ptmt = conn.prepareStatement(query);
			rs = ptmt.executeQuery();
			result=new ArrayList<MemberDto>();
			while(rs.next()) {
				
				
//				private int custno;
//				private String custname;
//				private String phone;
//				private String address;
//				private Date joindate;
//				private String grade;
//				private String city;
				
				MemberDto dto = new MemberDto();
				dto.setCustno(rs.getInt("custno"));
				dto.setCustname(rs.getNString("custname"));
				dto.setPhone(rs.getString("phone"));
				dto.setAddress(rs.getNString("address"));
				dto.setGrade(rs.getString("grade"));
				dto.setCity(rs.getString("city"));
				result.add(dto);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(ptmt);
			close(conn);
		}
		
		//System.out.println(result);
		return result;
	}
//	CUSTNO   NOT NULL NUMBER(6)    
//	CUSTNAME          VARCHAR2(20) 
//	PHONE             VARCHAR2(13) 
//	ADDRESS           VARCHAR2(60) 
//	JOINDATE          DATE         
//	GRADE             CHAR(1)      da
//	CITY              CHAR(2)   
//	public int insertMember(Connection conn, MemberDto dto) {
//		int result = 0;
//		String query = "insert into member_tbl_02 "
//				+ "(CUSTNAME,PHONE,ADDRESS,GRADE,CITY)"
//				+ "values(?,?,?,?,?)";
//		PreparedStatement pstmt = null;
//		try {
//			pstmt = conn.prepareStatement(query);
//			pstmt.setString(1, dto.getCustname());
//			pstmt.setString(2, dto.getPhone());
//			pstmt.setString(3, dto.getAddress());
//			pstmt.setString(4, dto.getGrade());
//			pstmt.setString(5, dto.getCity());
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			close(pstmt);
//		}
//		System.out.println(result);
//		return result;
//	}
	public int insert(Connection conn, MemberDto dto){
		int result = 0;
		String query = "INSERT INTO member_tbl_02 VALUES(?,?,?,?,?,?)";
		PreparedStatement pstmt =null;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, dto.getCustno());
			pstmt.setString(2, dto.getCustname());
			pstmt.setString(3, dto.getPhone());
			pstmt.setString(4, dto.getAddress());
			pstmt.setString(5, dto.getGrade());
			pstmt.setString(6, dto.getCity());
			result =pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(conn);
		}
		
		
		System.out.println(result);
		return result;
	}
}
