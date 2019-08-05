package cn.yuchong.entity;

public class test {
	
	private String Tname;
	private String Ttxt;
	
	public String getTname() {
		return Tname;
	}
	public void setTname(String tname) {
		Tname = tname;
	}
	public String getTtxt() {
		return Ttxt;
	}
	public void setTtxt(String ttxt) {
		Ttxt = ttxt;
	}
	@Override
	public String toString() {
		return "test [Tname=" + Tname + ", Ttxt=" + Ttxt + "]";
	}
	
}
