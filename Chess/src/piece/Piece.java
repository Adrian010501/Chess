package piece;

public abstract class Piece {
	
	private int x, y; //Current x & y
	private int nx, ny; //Next x & y
	private boolean color; // 0 is black, 1 is white
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public boolean getColor () {
		return color;
	}

	abstract public boolean move();
	
	private void getMove () {
		System.out.println("Where would you like to move?");
		
		//TODO: accept input and store into nx and ny
		
	}
	
}
