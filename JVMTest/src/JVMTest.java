import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class JVMTest {

	public static void main(String[] args) {
		Random random = new Random();
		List<String> list = new ArrayList<String>();
		String str = "就撒解放东路卡进度顺利看见>";
		while (true) {
			str += random.nextInt(99999999)+random.nextInt(99999999);
			list.add(str);
		}
	}

}
