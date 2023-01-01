public class SubMatrix {
    SubMatrix(){
        int a[][]={
            {1,3,4},
            {2,3,4},
            {3,4,5}
        };
        int b[][]={
            {1,5,8},
            {10,5,6},
            {9,7,1}
        };
        int c[][] = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j] = a[i][j]-b[i][j];
                System.out.print(c[i][j]+"    ");
            }
            System.out.println();
        }
    }
}
