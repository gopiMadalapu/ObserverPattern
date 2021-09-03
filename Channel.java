package MyPackage;
import java.util.ArrayList;
import java.util.List;
public class Channel implements Subject {

	private List<User> us=new ArrayList<>(); 
	String title;
	
	@Override
	public void user(User uss)
	{
		us.add(uss);
	}
	@Override
	public void unuser(Observer uss)
	{
		us.remove(uss);
	}
	@Override
	public void notifyUser()
	{
		for(Observer uss : us)
		{
			uss.update();
		}
	}
	@Override
	public void upload(String title)
	{
		this.title=title;
		notifyUser();
	}
}
