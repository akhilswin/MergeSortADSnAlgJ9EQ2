package yaksha;

public class Array {

	private int arr[];
	private int beg;
	private int mid;
	private int end;

	public Array(int[] arr, int beg, int mid, int end) {
		super();
		this.arr = arr;
		this.beg = beg;
		this.mid = mid;
		this.end = end;
	}

	public Array(int[] arr, int beg, int end) {
		super();
		this.arr = arr;
		this.beg = beg;
		this.end = end;
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public int getBeg() {
		return beg;
	}

	public void setBeg(int beg) {
		this.beg = beg;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}
}
