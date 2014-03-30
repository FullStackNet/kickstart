package platform.webservice.ui.layout;

import platform.webservice.ui.html.BaseHTMLComponent;

public abstract class BaseLayout {
	public static int LAYOUT_SINGLE_CENTER = 1;
	public static int LAYOUT_SINGLE_COLUMN = 2;
	public static int LAYOUT_TWO_COLUMN = 3;
	public static int LAYOUT_THREE_COLUMN = 4;
	
	
	public abstract BaseHTMLComponent getLayout();
}
