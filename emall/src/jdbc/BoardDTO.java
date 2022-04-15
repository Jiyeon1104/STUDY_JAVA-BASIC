package jdbc;

public class BoardDTO {
	private String board_id;	//상품 ID
	private String board_name;	// 상품 이름
	private String board_title;	// 상품 가격
	private String board_content;	// 상품 설명
	private String board_join_date;	// 상품 제조사
	public String getBoard_id() {
		return board_id;
	}
	public String getBoard_name() {
		return board_name;
	}
	public String getBoard_title() {
		return board_title;
	}
	public String getBoard_content() {
		return board_content;
	}
	public String getBoard_join_date() {
		return board_join_date;
	}

	public BoardDTO(String board_id, String board_name, String board_title, String board_content,
			String board_join_date) {
		super();
		this.board_id = board_id;
		this.board_name = board_name;
		this.board_title = board_title;
		this.board_content = board_content;
		this.board_join_date = board_join_date;
	}


	
	
}
