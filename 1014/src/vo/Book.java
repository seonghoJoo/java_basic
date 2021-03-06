package vo;

import java.sql.Date;

public class Book {
	private int no, pageNum;
	private String title, author;
	private Date publicationDate;
	public Book() {
		
	}
	public Book(int no,String title) {
		this.no = no;
		this.title = title;
	}
	public Book(int no, String title,String author,int pageNum, Date publicationDate) {
		this.no = no;
		this.title = title;
		this.author = author;
		this.pageNum = pageNum;
		this.publicationDate = publicationDate;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}
	
}
