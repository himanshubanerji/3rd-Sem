

interface Series {
	int GetNext();
	void reset();
	void setStart(int a);
}

class ByTwos {

	int start;

	public void setStart(int start) {
		this.start = start;
	}

	public int GetNext() {
		start += 2;
		return start;
	}

	public void reset() {
		start = 
	}

}