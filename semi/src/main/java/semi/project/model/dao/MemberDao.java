package semi.project.model.dao;
 
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import semi.project.model.dto.MemberDto;

import static semi.project.common.JdbcTemplate.*;

public class MemberDao {
	public int insert(Connection conn, MemberDto dto){
		int result = 0;
		String query = "INSERT INTO member_tbl_02 VALUES(member_seq.nextval,?,?,?,?,?)";
		PreparedStatement pstmt =null;
		try {
			pstmt = conn.prepareStatement(query);
			//pstmt.setInt(1, dto.getCustno());
			pstmt.setString(1, dto.getCustname());
			pstmt.setString(2, dto.getPhone());
			pstmt.setString(3, dto.getAddress());
			pstmt.setString(4, dto.getGrade());
			pstmt.setString(5, dto.getCity());
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

	public List<MemberDto> MoneyList(){
		List<MemberDto> result = null;
//		String query = "select a.custno, a.custname, a.grade, sum(b.price) total"
//				+ "from member_tbl_02 a join money_tbl_02 b on a.custno=b.custno "
//				+ "group by(a.custno, a.custname, a.grade) "
//				+ "order by total desc" ;
		String query = "select a.custno, a.custname, case when a.grade = 'A' then 'VIP' when a.grade = 'B' then '일반' when a.grade = 'C' then '직원' end as grade, sum(b.price) total "
				+ "from member_tbl_02 a join money_tbl_02 b on a.custno=b.custno "
				+ "group by(a.custno, a.custname, a.grade) "
				+ "order by total desc ";
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
				//dto.setPhone(rs.getString("phone"));
				//dto.setAddress(rs.getNString("address"));
				dto.setGrade(rs.getString("grade"));
				dto.setPrice(rs.getInt("total"));
				
//				String grade = rs.getString("grade");
//				
//				if (grade.equals("A")) {
//					grade = "VIP";
//				}else if (grade.equals("B")) {
//					grade = "일반";
//				}else if (grade.equals("C")) {
//					grade = "직원";
//				}

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

//	public MemberDto selectOne(Connection conn){
//		MemberDto result = null;
//		String query = "select DEPARTMENT_NO, DEPARTMENT_NAME, CATEGORY, OPEN_YN, CAPACITY from tb_Department"
//					+ " where DEPARTMENT_NO = ?";
//		PreparedStatement pstmt = null;
//		ResultSet rs = null; 
//		try {
//			pstmt = conn.prepareStatement(query);
//			pstmt.setString(1, departmentNo);
//			rs = pstmt.executeQuery();   
//			if(rs.next()) {
//				result = new DepartmentDto(rs.getString("DEPARTMENT_NO"), 
//						rs.getString("DEPARTMENT_NAME"), 
//						rs.getString("CATEGORY"), 
//						rs.getString("OPEN_YN"), 
//						rs.getInt("CAPACITY"));
//			}					
//		}catch (Exception e) {
//			e.printStackTrace();
//		}finally {
//			close(rs);
//			close(pstmt);
//		}
//		System.out.println("[Dept Dao selectOne] return:"+result);
//		return result;
//	}
	
}
