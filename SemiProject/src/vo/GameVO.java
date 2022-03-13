package vo;

public class GameVO {
	
	private int num;
	private String id;
	private int score;
	
	
	GameVO() {
		
	}
	
	
	public GameVO(int num, String id, int score) {
		super();
		this.num = num;
		this.id = id;
		this.score = score;
	}
	
	
	public GameVO(String id, int score) {
		super();
		this.id = id;
		this.score = score;
	}
	
	
	public int getNum() {
		return num;
	}

	
	public void setNum(int num) {
		this.num = num;
	}

	
	public String getId() {
		return id;
	}

	
	public void setId(String id) {
		this.id = id;
	}

	
	public int getScore() {
		return score;
	}

	
	public void setScore(int score) {
		this.score = score;
	}

}
