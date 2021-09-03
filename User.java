package MyPackage;

public class User implements Observer {
	
	private String name;
	private Channel channel=new Channel();
	
	public User(String name) {
		super();
		this.name = name;
	}
	@Override
	public void update()
	{
		System.out.println("  Hello " + name  + " New File  Uploaded" + channel.title);
	}
	@Override
	public void userChannel(Channel ch)
	{
		channel =ch;
	}

}
