package day14_221031;
/*
 	VO(DTO, Data Transfer Object)
 		1. 변수는 private 으로 같은 클래스에서만 접근 가능하도록 한다.(은닉화)
 		2. 외부에서 변수에 접근하는 것은 함수를 통해서 하기로 한다.
 */
import java.util.Date;
import java.sql.Time;
import java.util.*;
import java.text.*;

public class Member {
	private int mno, ano, rno;
	private String name, id, pw, mail, tel, birth, sdate, oriname, savename;
	private Date joinDate;
	private Time joinTime;
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getSdate() {
		return sdate;
	}
	// overloading
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	public void setSdate() {
		SimpleDateFormat form1 = new SimpleDateFormat("yyyy/MM/dd"); // java.text.*
		SimpleDateFormat form2 = new SimpleDateFormat("HH:MI:ss"); // java.text.*
		sdate = form1.format(joinDate) + form2.format(joinTime);
	}
	public String getOriname() {
		return oriname;
	}
	public void setOriname(String oriname) {
		this.oriname = oriname;
	}
	public String getSavename() {
		return savename;
	}
	public void setSavename(String savename) {
		this.savename = savename;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public Time getJoinTime() {
		return joinTime;
	}
	public void setJoinTime(Time joinTime) {
		this.joinTime = joinTime;
	}
	@Override
	public String toString() {
		return "Member [mno=" + mno + ", ano=" + ano + ", rno=" + rno + ", name=" + name + ", id=" + id + ", pw=" + pw
				+ ", mail=" + mail + ", tel=" + tel + ", birth=" + birth + ", sdate=" + sdate + ", oriname=" + oriname
				+ ", savename=" + savename + ", joinDate=" + joinDate + ", joinTime=" + joinTime + "]";
	}
	// ↓ toString() 함수에 오버로드하는 함수
	public String toString(Member m) {
		return "Member [mno=" + m.mno +", ano=" + m.ano +", rno=" + m.rno +", name=" + m.name +", id=" + m.id +", pw=" + m.pw
				+", mail=" + m.mail +", tel=" + m.tel +", birth=" + m.birth +", sdate=" + m.sdate +", oriname=" + m.oriname
				+", savename=" + m.savename +", joinDate=" + m.joinDate +", joinTime=" + m.joinTime +"]";
	}
}
