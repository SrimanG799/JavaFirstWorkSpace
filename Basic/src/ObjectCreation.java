import java.lang.reflect.Constructor;

public class ObjectCreation {
	String name;
	int id;
	/**
	 * @param name
	 * @param id
	 */
	public ObjectCreation(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public static void main(String[] args) {
		ObjectCreation o1=new ObjectCreation("sriman", 1);
		try {
			ObjectCreation o2=ObjectCreation.class.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
	}
	
	
	
	

}
