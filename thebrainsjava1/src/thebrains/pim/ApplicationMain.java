package thebrains.pim;

import thebrains.pim.controller.MemberController;


public class ApplicationMain {

	public static void main(String[] args) {
		new MemberController().dispatch();
		

	}

}
