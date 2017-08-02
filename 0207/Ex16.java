class Ex16{
     public static void main(String[] args){
          int su[] = {10,5,10,3,4,5,9,10,1,2,3,9};
          int res = 0 ;
            for(int i=0; i < su.length-1; i++){
                  for(int j=i+1; j < su.length; j++){
                      if(su[i] == su[j]) {
                         res = 1;
                      }
                  }
             }
       if(res == 1 ) {
           System.out.print("중복값이 존재함");
       }else{
           System.out.print("중복값이 존재하지 않음");
       }
      
     }
}