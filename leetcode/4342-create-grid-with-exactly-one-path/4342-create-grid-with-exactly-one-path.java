import java.util.Arrays;

class Solution {
    public String[] createGrid(int m, int n) {
        String[] grid = new String[m];
        
        // Strategy: Create a single path by going all the way right across the top row,
        // then going all the way down the last column. Fill everything else with '#'.
        
        for (int i = 0; i < m; i++) {
            char[] row = new char[n];
            // Fill the entire row with obstacles initially
            Arrays.fill(row, '#');
            
            if (i == 0) {
                // For the first row, make all cells free '.'
                Arrays.fill(row, '.');
            } else if (i == m - 1) {
                // For the last row, also make all cells free '.' (or just the last column)
                // Actually, making the whole last row free '.' guarantees a valid L-shaped path:
                // (0,0) -> (0, n-1) -> (m-1, n-1)
                Arrays.fill(row, '.');
            } else {
                // For intermediate rows, only the last column needs to be open to connect the top row down
                row[n - 1] = '.';
            }
            
            grid[i] = new String(row);
        }
        
       
        
        for (int i = 0; i < m; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == n - 1) {
                    sb.append('.');
                } else {
                    sb.append('#');
                }
            }
            grid[i] = sb.toString();
        }
        
        return grid;
    }
}