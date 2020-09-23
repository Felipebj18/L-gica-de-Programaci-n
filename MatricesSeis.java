public class MatricesSeis {
    public static void main(String[] args){

        int matriz[][];
        matriz=new int[27][60];
        /*Imprimir la matriz agregando cero a la izquierda de tal forma que
        la matriz al imprimirse se vea ordenada en sus filas y columnas
        
        Leer e imprimir una matriz de 100x100

        Imprimir una bandera con códigos de color
        */

        System.out.println();
        for(int i =0; i<matriz.length;i++)//Recorre las filas
        {
            for(int j=0;j<20;j++)
            {
                matriz[i][j]= 1;
                
            }
            System.out.print(" ");
            

            for(int j=20;j<40;j++)
            {
                matriz[i][j]=2;
                
            }
            System.out.print(" ");            

            for(int j=40;j<matriz[0].length;j++)
            {
                matriz[i][j]=3;
                
            }

               
            
            
        }

        for(int i=0; i<matriz.length;i++)
        {
            for(int j= 0;j<matriz[0].length;j++)
            {
                if(matriz[i][j]==1)
                {
                    System.out.print(ConsoleColors.GREEN+"1");
                }

                if(matriz[i][j]==2)
                {
                    System.out.print(ConsoleColors.WHITE+"2");
                }	

                if(matriz[i][j]==3)
                {
                    System.out.print(ConsoleColors.RED+"3");
                }


            }
            System.out.println();	
            

    
        }	
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*matriz[0][0]= 2;
        matriz[0][1]= 3;
        matriz[0][2]= 5;
        matriz[0][3]= 7;
        matriz[0][4]= 8;
        matriz[1][0]= 11;
        matriz[1][1]= 23;
        matriz[1][2]= 82;
        matriz[1][3]= 3;
        matriz[1][4]= 5;
        matriz[2][0]= 6;
        matriz[2][1]= 21;
        matriz[2][2]= 41;
        matriz[2][3]= 6;
        matriz[2][4]= 2;
        */

        
    
    }
    
}
