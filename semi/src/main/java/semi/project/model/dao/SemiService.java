package semi.project.model.dao;


import static semi.project.common.JdbcTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import semi.project.model.dto.MemberDto;


 
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
	public MemberDto selectOne(int custNo) {
		MemberDto result = null;
		Connection conn = getConnection();
		result = dao.selectOne(conn, custNo);
		close(conn);
		return result;
	}
	public int update(MemberDto dto){
		int result = -1;
		Connection conn = getConnection();
		result = dao.update(conn, dto);
		close(conn);
		return result;
	}
	
}
