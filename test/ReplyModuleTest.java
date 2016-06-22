

import com.Module.ReplyModule;
import junit.framework.TestCase;

public class ReplyModuleTest extends TestCase {

	public void testReply() {
		// ԭ�����޷���ֵ ���Բ���
	}

	public void testGetUserID() {
		String n = ReplyModule.getUserID("lantian");
		assertEquals("5", n);
	}

}
