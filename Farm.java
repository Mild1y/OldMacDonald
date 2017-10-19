class Farm
{     
   private Animal[] aBunchOfAnimals = new Animal[3];
   public Farm()
   {
   	aBunchOfAnimals[0] = new NamedCow();
   	aBunchOfAnimals[1] = new Chick();
   	aBunchOfAnimals[2] = new Pig();
   }
   public void animalSounds()
   {
   	for (int nI = 0; nI < aBunchOfAnimals.length; nI++)
   	{
   		System.out.println("The " + aBunchOfAnimals[nI].getType() + " goes " + aBunchOfAnimals[nI].getSound());
   	}
   	System.out.println("The Antifa Thug is known as " + ((NamedCow)aBunchOfAnimals[0]).getName() + ", but you can call him Dave");
   }
}
