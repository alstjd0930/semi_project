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
				dto.setJoindate(rs.getDate("joindate"));
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
}
