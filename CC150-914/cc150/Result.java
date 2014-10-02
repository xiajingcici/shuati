package cc150;

public class Result {
	public int hits=0;
	public int pseudoHits=0;
	public Result(int a, int b) {
		this.hits= a;
		this.pseudoHits= b;
	}
	@Override
	public String toString() {
		return "Result [hits=" + hits + ", pseudoHits=" + pseudoHits + "]";
	}
	
}
