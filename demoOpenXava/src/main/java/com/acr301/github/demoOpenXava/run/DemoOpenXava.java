package com.acr301.github.demoOpenXava.run;

import org.openxava.util.*;

public class DemoOpenXava {

	public static void main(String[] args) throws Exception {
		DBServer.start("demoOpenXava-db"); // To use your own database comment this line and configure src/main/webapp/META-INF/context.xml
		AppServer.run("demoOpenXava"); // Use AppServer.run("") to run in root context
	}

}
