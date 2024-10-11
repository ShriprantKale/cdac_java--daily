package entity;

public class Customer {
	private int cid;
	private String cname;
	private long contactno;
	private String add;

	public Customer(int cid, String cname1, long contactno, String add) {
		super();
		this.cid = cid;
		this.cname = cname1;
		this.contactno = contactno;
		this.add = add;
	}

	public int getCid() { 
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public long getContactno() {
		return contactno;
	}

	public void setContactno(long contactno) {
		this.contactno = contactno;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", contactno=" + contactno + ", add=" + add + "]";
	}

}
