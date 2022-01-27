package Filehandling;

public class MyMain {
	
		public static void main(String[] args) {
				
				// Create "main" folder if not present in current folder structure
				Myoperations.createMainFolderIfNotPresent("main");
				
				Menu.printWelcomeScreen("shoper", "shahid");
				
				MyOptions.handleWelcomeScreenInput();
			}

}
