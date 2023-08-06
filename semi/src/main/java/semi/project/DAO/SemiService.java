package semi.project.DAO;

import static semi.project.common.JdbcTemplate.*;

import java.sql.Connection;

import semi.project.DTO.MemberDto;


 
public class SemiService {
	
	private MemberDao dao = new MemberDao();
	
	public int insertMember(MemberDto dto) {
		int result = 0;
		Connection conn = getConnection();
		result = dao.insertMember(conn, dto);
		close(conn);
		return result;
	}
}
