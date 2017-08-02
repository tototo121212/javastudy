class Ex05{
   public static void main(String[] args){
       // 0 0 0 0
       // 0 0 0 0
       // 0 0 0 0
       // 0 0 0 0 
      for(int i=0; i<4; i++){
          for(int j=0;j<4;j++){ 
              System.out.print("0 ");
          }
         System.out.println();
      }

       // 1 0 0 0
       // 0 1 0 0
       // 0 0 1 0
       // 0 0 0 1 

      for(int i=0; i<4; i++){
          for(int j=0;j<4;j++){ 
            if(i==j){
              System.out.print("1 ");             
            }else{
              System.out.print("0 ");
            }
          }
         System.out.println();
      } 

   }
}