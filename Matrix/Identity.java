class identity {
    public static void main(String[] args) {
       int[][] numbers = {
           {1, 0, 0},
           {0, 1, 0},
           {0, 0, 1}
       };
        int rows = numbers.length;    
        int cols = numbers[0].length; 
        int count = 0;
            
        //Checks whether given matrix is a square matrix or not    
        if(rows != cols){    
            System.out.println("Matrix should be a square matrix");    
        }    
        else{
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < cols; j++){
                    if(i == j && numbers[i][j] != 1){
                        count++;
                    }
                    if(i != j && numbers[i][j] != 0){
                        count++;
                    }
                }
            }
        }
        if(count == 0){
             System.out.println("Given matrix is an identity matrix"); 
        }else{
            System.out.println("Given matrix is not an identity matrix"); 
        }
     
      
    }
}
