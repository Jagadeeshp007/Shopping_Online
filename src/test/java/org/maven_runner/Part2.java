package org.maven_runner;

import org.SDP.Project_Object_Manger;
import org.base.Base_Class;
import org.helper.File_Read;

public class Part2 extends Base_Class {

	public static Project_Object_Manger pom; 
	public static void main(String[] args) throws Throwable {

		String browser = File_Read.getFile().getInstance2().getBrowser();
		getBrowser(browser); // driver select
		pom = new Project_Object_Manger(driver); // driver convert


		String url = File_Read.getFile().getInstance2().getUrl();
		getUrl(url);
		sleep(3);

		// women dress select
		mouse(pom.getHome().getWomen(), "move");
		mouse(pom.getHome().getEvening_dress(), "move");
		mouse(pom.getHome().getEvening_dress(), "click");
		sleep(3);

		// dress select
		mouse(pom.getDress().getImg(), "move");
		mouse(pom.getDress().getMore(), "move");
		mouse(pom.getDress().getMore(), "click");
		wait(30);

		// Quntity increase
		inputClear(pom.getCart().getQuntity());
		String quantity = File_Read.getFile().getInstance2().getQuantity();
		inputPass(pom.getCart().getQuntity(), quantity);

		// size change
		String size = File_Read.getFile().getInstance2().getSize();
		dropDown(pom.getCart().getSize(), "value", size);

		// color change
		mouse(pom.getCart().getColor(), "move");
		mouse(pom.getCart().getColor(), "click");
		sleep(3);

		// add to card
		elementClick(pom.getCart().getAdd_card());
		wait(30);

		// proceed to card
		elementClick(pom.getCart().getProceed());
		sleep(3);

		mouse(pom.getSummary().getProceed(), "move");
		takeScreenShot(".\\screenshot\\order.png");
		mouse(pom.getSummary().getProceed(), "click");
		sleep(3);

		// login
		String username = File_Read.getFile().getInstance2().getUsername();
		inputPass(pom.getSign().getUsername(), username);
		String password = File_Read.getFile().getInstance2().getPassword();
		inputPass(pom.getSign().getPassword(), password);

		elementClick(pom.getSign().getLogin_btn());
		sleep(3);

		// conform order
		String textarea = File_Read.getFile().getInstance2().getTextarea();
		inputPass(pom.getAdd().getText(), textarea);
		elementClick(pom.getAdd().getProceed());
		sleep(3);

		// shipping
		mouse(pom.getShip().getCheckbox(), "move");
		mouse(pom.getShip().getCheckbox(), "click");
		elementClick(pom.getShip().getProceed());
		sleep(3);

		// payment proceed
		mouse(pom.getPay().getPayment(), "move");
		mouse(pom.getPay().getPayment(), "click");
		sleep(3);

		// submit
		elementClick(pom.getPay().getSubmit());
		sleep(3);

		scroll("down");
		scroll("up");
		sleep(2);

		takeScreenShot(".\\screenshot\\conform.png");

		sleep(8);
		close();
	}
}
