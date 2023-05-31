import java.util.Stack;

public class TheMaze

{

    private int[][] maze;
    private int startRow;
    private int startCol;
    private int endRow;
    private int endCol;
    private boolean[][] visited;
    private int[][] solution;

    public TheMaze(int[][] maze, int startRow, int startCol, int endRow, int endCol)
    {
        this.maze = maze;
        this.startRow = startRow;
        this.startCol = startCol;
        this.endRow = endRow;
        this.endCol = endCol;
        this.visited = new boolean[maze.length][maze[0].length];
        this.solution = new int[maze.length][maze[0].length];
    }

    public void solve()
    {
        Stack<Integer> rowStack = new Stack<>();
        Stack<Integer> colStack = new Stack<>();

        rowStack.push(startRow);
        colStack.push(startCol);

        while (!rowStack.isEmpty() && !colStack.isEmpty())
        {
            int row = rowStack.pop();
            int col = colStack.pop();

            if (row == endRow && col == endCol) {
                System.out.println("Solutia exista.");
                System.out.println("Solutie: ");
                printSolution();
                return;
            }

            if (isValid(row, col) && !visited[row][col])
            {
                visited[row][col] = true;

                solution[row][col] = 1;

                rowStack.push(row - 1);
                colStack.push(col);

                rowStack.push(row + 1);
                colStack.push(col);

                rowStack.push(row);
                colStack.push(col - 1);

                rowStack.push(row);
                colStack.push(col + 1);
            }
        }

    }

    private boolean isValid(int row, int col)
    {
        return row >= 0 && col >= 0 && row < maze.length && col < maze[0].length && maze[row][col] == 0;
    }

    private void printSolution()
    {
        for (int i = 0; i < solution.length; i++)
        {
            for (int j = 0; j < solution[0].length; j++)
            {
                System.out.print(solution[i][j] + " ");
            }
            System.out.println();
        }
    }
}


