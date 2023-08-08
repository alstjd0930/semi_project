package semi.project.DAO;


import static semi.project.common.JdbcTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import semi.project.DTO.MemberDto;


 
public class SemiService {
	
	private MemberDao dao = new MemberDao();
	
//	public List<MemberDto> MemberList(MemberDto dto) {
//		List<MemberDto> result = null;
//		Connection conn = getConnection();
//		result = dao.MemberList(conn,dto);
//		close(conn);
//		return result;
//	}
	public int insert(MemberDto dto) {
		int result =0;
		Connection conn = getConnection();
		result=dao.insert(conn, dto);
		close(conn);
		
		return result;
	}
	
	
	
}
