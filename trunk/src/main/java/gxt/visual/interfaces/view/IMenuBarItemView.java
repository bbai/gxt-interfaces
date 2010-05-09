package gxt.visual.interfaces.view;

import com.extjs.gxt.ui.client.widget.menu.Menu;

/**
 * @author eugenp
 */
public interface IMenuBarItemView extends IComponentView{
	
	String getText();
	
	void setText( String text );
	
	Menu getMenu();
	
	void setMenu( Menu menu );
	
}
