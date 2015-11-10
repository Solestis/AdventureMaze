package adventuremaze;

public class Main {

	public Main() {
		Maze maze = new Maze(10, 10);
		maze.display();
		maze.printMazeInts();
	}

	public static void main(String[] args) {
		new Main();
	}

}
