package kr.co.ch08.vo;

public class UserVO {

	// 이걸 form의 이름과 정확히 맞춰줘야 계산함
	private String custid;
	private String name;
	private String address;
	private String phone;
	
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
