
public abstract class ChessPiece {
	
	 char color;
	 int position;
	 boolean isCaptured;
	
	 abstract void move();
	 abstract void capture();

}
