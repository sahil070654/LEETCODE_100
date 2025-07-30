class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
    List<Integer> res = new ArrayList<>();
    if (arr == null || arr.length == 0) return res;

    int sRow = 0, sCol = 0;
    int eRow = arr.length - 1, eCol = arr[0].length - 1;

    while (sRow <= eRow && sCol <= eCol) {
        //TOP
        for (int i = sCol; i <= eCol; i++) {
            res.add(arr[sRow][i]);
        }
        sRow++;

        //RIGHT
        for (int i = sRow; i <= eRow; i++) {
            res.add(arr[i][eCol]);
        }
        eCol--;

        //BOTTOM
        if (sRow <= eRow) {
            for (int i = eCol; i >= sCol; i--) {
                res.add(arr[eRow][i]);
            }
            eRow--;
        }

        //LEFT
        if (sCol <= eCol) {
            for (int i = eRow; i >= sRow; i--) {
                res.add(arr[i][sCol]);
            }
            sCol++;
        }
    }

    return res;
}

}
