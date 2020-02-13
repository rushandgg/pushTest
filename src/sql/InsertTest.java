package sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertTest {

	public static void main(String[] args) {
		
//		테이블에 저장할 데이터를 받는다.
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 : ");
		String name = scanner.nextLine();
		System.out.println("비밀번호 : ");
		String password = scanner.nextLine();
		System.out.println("메모");
		String memo = scanner.nextLine();
		
//		데이터베이스 작업에 사용할 객체를 선언한다.
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		
		try {
//			데이터베이스에 연결한다.
			conn = Dbutil.getMySQLConnection();
			
//			Statement를 사용해서 입력받은 데이터를 테이블에 저장한다.
//			sql 명령을 만든다. => 문자열은 반드시 작은따옴표로 묶어야 한다. => sql 명령에 ";"을 찍으면 에러가 발생된다.
//			String sql = "insert into memo (name, password, memo) values ('" + name + "', '" + password + "', '" + memo + "')";
			String sql = String.format("insert into memo (name, password, memo) values ('%s', '%s', '%s')",	name, password, memo);
			System.out.println(sql);
//			sql 명령 실행을 준비한다.
//			executeQuery() : 테이블에 저장한 데이터가 변경되지 않는 sql 명령을 실행한다. => select
//			executeUpdate() : 테이블에 저장한 데이터가 변경되는 sql 명령을 실행한다. => insert, delete, update
			stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("저장 완료!!!");
	}
}
