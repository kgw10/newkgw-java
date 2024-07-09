package java0709_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BoardDAO {
	private Connection conn;	// 데이터 베이스 접속 정보 저장
	private Statement st;	// SQL 명령어 전달과 결과 받기
	private PreparedStatement pt;	// SQL 명령어 전달과 결과 받기
	private ResultSet rs;	// 데이터 조회 결과 저장
	
	public BoardDAO() {
		DriverLoad();	// 데이터베이스 드라이버 로드
		Connect();	// 데이터 베이스 접속
	}
	
	// test_board 테이블의 데이터 가져와서 Board 클래스 객체로 저장하기
	public Board[] findByAll() {
		Board[] list = new Board[7];	// Board 클래스 객체 7개 저장하기 위한 배열
		
		String sql = "select * from test_board";	// sql 질의문, 쿼리문
		
		// select 사용시 - executeQuery 메서드, insert, update, delete 사용시 - executeUpdate 메서드
		try {
			st = conn.createStatement();	// statement 생성
			st.executeQuery(sql);
			int i = 0;	// 배열의 인덱스
			
			while(rs.next() ) {
				list[i] = new Board(rs.getInt("board_id"), rs.getString("title"), rs.getString("writer"), rs.getString("content"), rs.getInt("hit"));
			}
			
		}catch(Exception e) {
			System.out.println(" 데이터 가져오기 실패");
		}
		
		return list;
	}
	
	
	
	
	private void DriverLoad() {	// 드라이버 로드
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			System.out.println("드라이버 접속 실패");
		}
	}
	private void Connect() {	// 데이터 베이스 접속
		String username = "kgw";
		String password = "1234";
		String url = "jdbc:mysql://localhoost:3306/kgw";
		
		try {
			conn = DriverManager.getConnection(url,username,password);
			
		}catch(Exception e) {
			System.out.println("접속 실패");
		}
	}
}


/*
	Connection, Statement 또는 PreparedStatement, ResulSet 참조 변수 필요
	

	1. 데이터 베이스와 연결하기 위한 드라이버 로드
		(mysql 5버전 이후 - com.mysql.cj.jdbc.Driver
		5버전 이하 - com.mysql.jdbc.Driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	2. 데이터 베이스에 접속 하기
	   데이터 베이스 계정명, 비밀번호, 주소
	   conn = DriverManager.getConnection( 주소, 계정명, 비밀 번호 );
	   
	   접속을 시도한 결과를 connection의 참조 변수에 저장
	  
	   
	3. conn을 통해서 Statement 도는 PreparedStatement의 객체 생성하여 SQL 명령어 보내기
	
 
 
 */
 