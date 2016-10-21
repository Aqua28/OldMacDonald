class Chick implements Animal     
     
{     
    private String myType;     
     private String mySound;      
     public Chick(String type, String sound2, String sound1)     {         
         myType = type;      
   
         if(Math.random()>.5){
         mySound = sound1;
         }  
         else{
         mySound =  sound2;            
            }  
     }
         

	
     public Chick()     {         
         
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
}


