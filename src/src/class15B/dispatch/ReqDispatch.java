package class15B.dispatch;
import java.util.HashMap;
import class15B.controller.MainController;
public class ReqDispatch {
	HashMap<String, MainController> map;
	public void init() {
		map = new HashMap<String, MainController>();
		map.put("/login", new Login());
		
	}
}
