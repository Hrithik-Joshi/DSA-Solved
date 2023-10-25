/**
 * SetMatrixZero
 */
public class SetMatrixZero {

    public static void main(String[] args) {
        int[][] matrix={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(matrix);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
    public static void setZeroes(int[][] matrix){
        boolean row_flag=false;
        boolean col_flag=false;
        int r=matrix.length;
        int c=matrix[0].length;

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==0 && matrix[i][j]==0){
                    row_flag=true;
                }
                if(j==0 && matrix[i][j]==0){
                    col_flag=true;
                }
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(row_flag==true){
            for(int j=0;j<c;j++){
                matrix[0][j]=0;
            }
        }
        if(col_flag==true){
            for(int i=0;i<r;i++){
                matrix[i][0]=0;
            }
        }
    }
}

// OutPut 
// 0000
// 0450
// 0310