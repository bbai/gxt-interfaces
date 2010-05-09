package gxt.visual.ui.implementations;

import gxt.visual.interfaces.IMenuBarItem;

import com.extjs.gxt.ui.client.widget.menu.Menu;
import com.extjs.gxt.ui.client.widget.menu.MenuBarItem;

/**
 * @author eugenp
 */
public class VMenuBarItem extends MenuBarItem implements IMenuBarItem{
	
	public VMenuBarItem( final String text, final Menu menu ){
		super( text, menu );
	}
	
	//
	public MenuBarItem getComponent(){
		return this;
	}
	
}
