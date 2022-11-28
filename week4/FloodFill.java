// https://leetcode.com/problems/flood-fill/

package week4;

import java.util.ArrayList;
import java.util.List;

class FloodFill {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int targetColor = image[sr][sc];
        List<int[]> positList = new ArrayList<int[]>();
        visitor(image, sr, sc, color, targetColor, positList);

        for ( int i = 0; i < positList.size(); i++ ) {
            image[positList.get(i)[0]][positList.get(i)[1]] = color;
        }
        return image;
        
    }

    public void visitor(int[][] image, int sr, int sc, int color, int target, List l) {
        image[sr][sc] = color;
        int[] pos = {sr , sc};

        if (sc + 1 < image[sr].length && image[sr][sc + 1] == target) {
            pos[0] = sr;
            pos[1] = sc + 1;
            l.add(pos);
            visitor(image, sr, sc + 1, color, target, l);
        }
        if (sc - 1 >= 0 && image[sr][sc - 1] == target) {
            pos[0] = sr;
            pos[1] = sc - 1;
            l.add(pos);
            visitor(image, sr, sc - 1, color, target, l);
        }
        if (sr + 1 < image.length && image[sr + 1][sc] == target) {
            pos[0] = sr + 1;
            pos[1] = sc;
            l.add(pos);
            visitor(image, sr + 1, sc, color, target, l);
        }
        if (sr - 1 >= 0 && image[sr - 1][sc] == target) {
            pos[0] = sr - 1;
            pos[1] = sc;
            l.add(pos);
            visitor(image, sr - 1, sc, color, target, l);
        }
    }
}
