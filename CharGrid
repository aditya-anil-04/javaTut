import java.util.Iterator;

public class CharGrid implements Cloneable, Iterable<String> {

	private char[][] grid;

	public CharGrid(int rows, int cols) {
		
		grid = new char[rows][cols];
		
	}

	public void set(int row, int col, char c) {
		
		grid[row][col] = c;
		
	}

	public char get(int row, int col) {
		
		return grid[row][col];
		
	}

	@Override
	public CharGrid clone() {
		
		try {
			
			CharGrid copy = (CharGrid) super.clone();
			copy.grid = new char[this.grid.length][this.grid[0].length];
			
			for (int i = 0; i < this.grid.length; i++) {
				
				System.arraycopy(this.grid[i], 0, copy.grid[i], 0, this.grid[i].length);
				
			}
			
			return copy;
			
		} catch (CloneNotSupportedException e) {
			
			throw new AssertionError();
			
		}
		
	}

	@Override
	public Iterator<String> iterator() {
		
		return new Iterator<String>() {
			
			private int currentCol = 0;

			@Override
			public boolean hasNext() {
				
				return currentCol < grid[0].length;
				
			}

			@Override
			public String next() {
				
				StringBuilder columnString = new StringBuilder();
				
				for (int i = 0; i < grid.length; i++) {
					
					columnString.append(grid[i][currentCol]);
					
				}
				
				currentCol++;
				return columnString.toString();
				
			}
			
		};
		
	}

}
