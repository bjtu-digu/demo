package test.Module;

import com.Module.ReplyModule;
import junit.framework.TestCase;

public class ReplyModuleTest extends TestCase {

	public void testReply() {
		// 原函数无返回值 忽略测试
	}

	public void testGetUserID() {
		String n = ReplyModule.getUserID("lantian");
		assertEquals("5", n);
	}

}
