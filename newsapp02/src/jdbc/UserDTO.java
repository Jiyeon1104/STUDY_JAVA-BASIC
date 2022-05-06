package jdbc;

public class UserDTO {

	private String uid;
	private String upw;
	private String unm;
	
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUpw() {
		return upw;
	}
	public void setUpw(String upw) {
		this.upw = upw;
	}
	public String getUnm() {
		return unm;
	}
	public void setUnm(String unm) {
		this.unm = unm;
	}
	
	
	public UserDTO(String uid, String upw, String unm) {
		super();
		this.uid = uid;
		this.upw = upw;
		this.unm = unm;
	}
	
	
	
	
	
}
