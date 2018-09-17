public class Matrix {
    private int row,col;
    private int[][] mat;

    public Matrix() {}

    public Matrix(int row,int col) {
        this.row = row;
        this.col = col;
        mat = new int[row][col];
    }

    public void setRow(int row) { this.row = row;}
    public void setCol(int col) { this.col = col;}

    public int getRow() { return this.row; }
    public int getCol() { return this.col; }

    public int getElement(int i,int j) {
        return this.mat[i][j];
    }
    public void setElement(int i,int j,int val) {
        mat[i][j] = val;
    }

    public void setMat(int[][] a,int row,int col) {
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) this.mat[i][j] = a[i][j];
        }
    }

    public Matrix add(Matrix a,Matrix b) {
        Matrix c = new Matrix(a.row,a.col);
        if(a.col!=b.row || a.row!=b.col) return null;
        for(int i=0;i<a.row;i++) {
            for(int j=0;j<a.col;j++) {
//                System.out.println(a.getElement(i,j)+b.getElement(i,j));
//                setElement(i,j,a.getElement(i,j)+b.getElement(i,j));
                c.mat[i][j] = a.getElement(i,j)+b.getElement(i,j);
            }
        }
        return c;
    }
}
