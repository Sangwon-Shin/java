package day15_221101;
import java.sql.Date;
public class Board {
	private int bno, wcount, cate, upno;
	private String[] cates = {"HTML", "데이터베이스", "자바"};
	private String title, body, writer;
	private Date wdate;
	public Board() {
		
	}
	public Board(int bno, int wcount, int cate,
			String title, String body, String writer,
			Date wdate) {
		setBno(bno);
		setWcount(wcount);
		setCate(cate);
		setTitle(title);
		setBody(body);
		setWriter(writer);
		setWdate(wdate);
	}
	public void toPrint() {
		System.out.printf("글번호: %d\n작성자: %s\n글제목: %s\n작성일: %s\n클릭수: %d\n"
				+"글분류: %s\n글내용:\n%s\n\n", getBno(),getWriter(),getTitle(),getWdate(),getWcount(),cates[getCate()],getBody());
	}
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public int getWcount() {
		return wcount;
	}
	public void setWcount(int wcount) {
		this.wcount = wcount;
	}
	public int getCate() {
		return cate;
	}
	public void setCate(int cate) {
		this.cate = cate;
	}
	public int getUpno() {
		return upno;
	}
	public void setUpno(int upno) {
		this.upno = upno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getWdate() {
		return wdate;
	}
	public void setWdate(Date wdate) {
		this.wdate = wdate;
	}

}
