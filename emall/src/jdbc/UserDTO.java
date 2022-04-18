package jdbc;

public class UserDTO {
   private String uid; //상품 아이디
   private String upw;   //상품이름
   private String uname; //상품가격
   private String ugender;   //상품설명
   private String ubirth;   //상품제조사
   private String uemail;   //상품분류
   private String uphone;   //신상품 중고품 재고품
   private String uaddr;
   private String uregiday;
   
   
   
   public void setUid(String uid) {
	this.uid = uid;
}
public void setUpw(String upw) {
	this.upw = upw;
}
public void setUname(String uname) {
	this.uname = uname;
}
public void setUgender(String ugender) {
	this.ugender = ugender;
}
public void setUbirth(String ubirth) {
	this.ubirth = ubirth;
}
public void setUemail(String uemail) {
	this.uemail = uemail;
}
public void setUphone(String uphone) {
	this.uphone = uphone;
}
public void setUaddr(String uaddr) {
	this.uaddr = uaddr;
}
public void setUregiday(String uregiday) {
	this.uregiday = uregiday;
}
public String getUid() {
      return uid;
   }
   public String getUpw() {
      return upw;
   }
   public String getUname() {
      return uname;
   }
   public String getUgender() {
      return ugender;
   }
   public String getUbirth() {
      return ubirth;
   }
   public String getUemail() {
      return uemail;
   }
   public String getUphone() {
      return uphone;
   }
   public String getUaddr() {
      return uaddr;
   }
   public String getUregiday() {
      return uregiday;
   }
   public UserDTO(String uid, String upw, String uname, String ugender, String ubirth, String uemail, String uphone,
         String uaddr, String uregiday) {
      super();
      this.uid = uid;
      this.upw = upw;
      this.uname = uname;
      this.ugender = ugender;
      this.ubirth = ubirth;
      this.uemail = uemail;
      this.uphone = uphone;
      this.uaddr = uaddr;
      this.uregiday = uregiday;
   }
public UserDTO() {
	
}

}