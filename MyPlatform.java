package MyPackage;

public class MyPlatform {
	
	public static void main(String[] args)
	{
		Channel vg=new Channel();
		User u1=new User("Vinay");
		User u2=new User("mary");
		User u3=new User("john");
		User u4=new User("kelvin");
		User u5=new User("jenny");
		
		vg.user(u1);
		vg.user(u2);
		vg.user(u3);
		vg.user(u4);
		vg.user(u5);
		
		vg.unuser(u1);
		
		u1.userChannel(vg);
		u2.userChannel(vg);
		u3.userChannel(vg);
		u4.userChannel(vg);
		u5.userChannel(vg);
		
		vg.upload("  : Welcome DESIGN PATTRENS");
		
		
		
	}

}
