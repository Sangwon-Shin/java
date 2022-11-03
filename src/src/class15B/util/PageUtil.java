// w3school pagination 참고

package class15B.util;

public class PageUtil {
	private int nowPage;		// 현재 페이지 번호
	private int totalPage;		// 총 페이지 수
	private int totalCount;		// 총 게시글 수
	private int pageRow;		// 한 페이지에 보여질 게시글 수
	private int pageGroup;		// 이동 가능한 페이지 수
	private int startPage;		// 현 페이지 그룹에서 가장 작은 페이지 번호
	private int endPage;		// 현 페이지 그룹에서 가장 큰 페이지 번호
	private int startRno;		// 현 페이지에 있는 게시글 중 가장 작은 rownum
	private int endRno;			// 현 페이지에 있는 게시글 중 가장 큰 rownum
	
	public PageUtil() {
		
	}

	public PageUtil(int nowPage, int totalCount) {
		this(nowPage, totalCount, 3, 3);
	}
	
	public PageUtil(int totalCount, int pageRow, int pageGroup) {
		this(1, totalCount, pageRow, pageGroup);
	}
	
	public PageUtil(int nowPage, int totalCount, int pageRow, int pageGroup) {
		this.nowPage = nowPage;
		this.totalCount = totalCount;
		this.pageRow = pageRow;
		this.pageGroup = pageGroup;
		setTotalPage();
		setRno();
		setPage();
	}
	
	public void setTotalPage() {
		totalPage = totalCount == 0 ? 1 : 
			(totalCount % pageRow == 0) ? (totalCount / pageRow) :
				(totalCount / pageRow + 1);
	}
	
	public void setRno() {
		startRno = (nowPage - 1) * pageRow + 1;
		endRno = (nowPage * pageRow > totalCount) ? (totalCount) :
					(nowPage * pageRow);
	}
	
	public void setPage() {
		// 시작 페이지(1,2,3 페이지는 1페이지가 시작페이지, 4,5,6 페이지는 4페이지)
		int tmpGroup = (nowPage - 1) / pageGroup;
		// 현재 페이지 그룹의 시작 페이지 번호 계산
		startPage = tmpGroup * pageGroup + 1;
		endPage = startPage + pageGroup -1 > totalPage ? totalPage:
						startPage + pageGroup -1;
	}
	
	public int getNowPage() {
		return nowPage;
	}

	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getPageRow() {
		return pageRow;
	}

	public void setPageRow(int pageRow) {
		this.pageRow = pageRow;
	}

	public int getPageGroup() {
		return pageGroup;
	}

	public void setPageGroup(int pageGroup) {
		this.pageGroup = pageGroup;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public int getStartRno() {
		return startRno;
	}

	public void setStartRno(int startRno) {
		this.startRno = startRno;
	}

	public int getEndRno() {
		return endRno;
	}

	public void setEndRno(int endRno) {
		this.endRno = endRno;
	}

	

}
