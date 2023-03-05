// https://leetcode.com/problems/flood-fill/

package week4;

class FloodFill {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int targetColor = image[sr][sc];
        
        if(targetColor == color) {
            return image;
        }
        visitor(image, sr, sc, color, targetColor);
        
        return image;
    }

    public void visitor(int[][] image, int sr, int sc, int color, int target) {
        image[sr][sc] = color;
        if (sc + 1 < image[sr].length && image[sr][sc + 1] == target) {
            visitor(image, sr, sc + 1, color, target);
        }
        if (sc - 1 >= 0 && image[sr][sc - 1] == target) {
            visitor(image, sr, sc - 1, color, target);
        }
        if (sr + 1 < image.length && image[sr + 1][sc] == target) {
            visitor(image, sr + 1, sc, color, target);
        }
        if (sr - 1 >= 0 && image[sr - 1][sc] == target) {
            visitor(image, sr - 1, sc, color, target);
        }
    }
}
