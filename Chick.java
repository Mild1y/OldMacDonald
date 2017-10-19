class Chick implements Animal
{     
     private String myType;
     private String mySound;
     private String myAltSound;
     public Chick(String type, String altSound, String sound)
     {
     	myType = type;
     	mySound = sound;
     	myAltSound = altSound;
     }
     public Chick()
     {
     	myType = "Patriot Project member";
     	mySound = "I'm just a conservative!";
     	myAltSound = "Oh dear god not the BAT!!!";
     }
     public String getSound()
     {
     	if (Math.random() > 0.5) 
     	{
     		return mySound;
     	}
     	else 
     	{
     		return myAltSound;	
     	}
     }
     /*public String getAltSound()
     {
     	return myAltSound;
     } */
     public String getType()
     {
     	return myType;
     }
}