
	public void setup() {     
    Cow c = new Cow("cow", "moo");   
    System.out.println(c.getType() + " goes " + c.getSound());   
    Pig p = new Pig("pig", "moo");
    System.out.println(p.getType() + " goes " + p.getSound());
    Chick v = new Chick("chick", "cheep");
    System.out.println(v.getType() + " goes " + v.getSound());
}

