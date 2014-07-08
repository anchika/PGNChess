public class ChessBoard {
	private String[] squares;

	ChessBoard() {
		squares = new String[65];
		int index;
		for (int row = 0; row < 8; row++) {
			for (int col = 0; col < 8; col++) {
				index = row * 8 + col;
				squares[index] = Character.toString((char) (row + 65))
						+ Integer.toString(col + 1);
			}
		}
	}
	

	public void display() {
		for (int row = 0; row < 64; row++) {
			System.out.println(squares[row]);

		}
	}
	
	public static void main(String[] args) {
		ChessBoard board=new ChessBoard();
		board.display();
	}
}
