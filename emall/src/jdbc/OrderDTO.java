package jdbc;

public class OrderDTO {

	private String oid;
	private String opid;
	private String ouid;
	private String opname; 
	private String oprice; 
	private String ostatus;
	private String odate;
	private String ograde;
	private String ocomm;
	
	
	public void setOid(String oid) {
		this.oid = oid;
	}
	public void setOpid(String opid) {
		this.opid = opid;
	}
	public void setOuid(String ouid) {
		this.ouid = ouid;
	}
	public void setOpname(String opname) {
		this.opname = opname;
	}
	public void setOprice(String oprice) {
		this.oprice = oprice;
	}
	public void setOstatus(String ostatus) {
		this.ostatus = ostatus;
	}
	public void setOdate(String odate) {
		this.odate = odate;
	}
	public void setOgrade(String ograde) {
		this.ograde = ograde;
	}
	public void setOcomm(String ocomm) {
		this.ocomm = ocomm;
	}
	
	
	public String getOid() {
		return oid;
	}
	public String getOpid() {
		return opid;
	}
	public String getOuid() {
		return ouid;
	}
	public String getOpname() {
		return opname;
	}
	public String getOprice() {
		return oprice;
	}
	public String getOstatus() {
		return ostatus;
	}
	public String getOdate() {
		return odate;
	}
	public String getOgrade() {
		return ograde;
	}
	public String getOcomm() {
		return ocomm;
	}
	public OrderDTO(String oid, String opid, String ouid, String opname, String oprice, String ostatus, String odate,
			String ograde, String ocomm) {
		super();
		this.oid = oid;
		this.opid = opid;
		this.ouid = ouid;
		this.opname = opname;
		this.oprice = oprice;
		this.ostatus = ostatus;
		this.odate = odate;
		this.ograde = ograde;
		this.ocomm = ocomm;
	}

	public OrderDTO() {
		
	}
	
	
}