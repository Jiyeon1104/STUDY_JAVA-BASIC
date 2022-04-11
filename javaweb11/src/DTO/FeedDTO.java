package DTO;

public class FeedDTO {
	private String id, content, ts;

	public String getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	public String getTs() {
		return ts;
	}

	public FeedDTO(String id, String content, String ts) {
		super();
		this.id = id;
		this.content = content;
		this.ts = ts;
	}
	
	
}
