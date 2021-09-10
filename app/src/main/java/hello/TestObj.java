package hello;

public class TestObj {
	private String memberID = "";
	private int timer = 0;
	private int xp = 0;

	public String getMemberID() {
		return memberID;
	}

	public int getXp() {
		return xp;
	}

	public int getTimer() {
		return timer;
	}

	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}

	public void setTimer(int timer) {
		this.timer = timer;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}
}