class NestedForEach {
    public static void main(String[] args) {
        int[][][] array = { {{1, 2},{3, 4}}, {{5,6},{7,8}} };               //3D Array

        for (int[][] row : array) {
            for (int[] cell : row) {
                System.out.print("(" + cell[0] + "," + cell[1] + ") ");
            }
            System.out.println();
        }
    }
}
