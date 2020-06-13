import com.phone.OS;
import com.phone.OSFactory;

public class FactoryMain {

	public static void main(String[] args) {
		OS obj = OSFactory.getInstance("open");
		obj.specification();
		

	}

}
