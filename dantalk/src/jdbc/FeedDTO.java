package jdbc;

public class FeedDTO {
	private String id;
	private String content;
	private String ts;
	private String images;

	public String getId() {
		return id;
	}
	public String getContent() {
		return content;
	}
	public String getTs() {
		return ts;
	}
	public String getImages() {
		return images;
	}
	
	public FeedDTO(String id, String content, String ts, String images) {
		super();
		this.id = id;
		this.content = content;
		this.ts = ts;
		this.images = images;
	}
}
