package operation;

import java.util.Objects;

public class CustomerDemo {

	private int cid;
	private String cname;
	private long contactno;
	private String add;
	public CustomerDemo(int cid, String cname, long contactno, String add) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.contactno = contactno;
		this.add = add;
	}

	public int hashCode() {
		return Objects.hash(add, cid, cname, contactno);
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof CustomerDemo)) {
			return false;
		}
		CustomerDemo other = (CustomerDemo) obj;
		return Objects.equals(add, other.add) && cid == other.cid && Objects.equals(cname, other.cname)
				&& contactno == other.contactno;
	}

	@Override
	public String toString() {
		return "CustomerDemo [cid=" + cid + ", cname=" + cname + ", contactno=" + contactno + ", add=" + add + "]";
	}
	
	
	}


