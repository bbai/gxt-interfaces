package gxt.client.visual.implementations;

import gxt.client.visual.interfaces.IMenu;
import com.extjs.gxt.ui.client.widget.menu.Menu;

/**
 * @author eugenp
 */
public class VMenu extends Menu implements IMenu{
	
	public VMenu(){
		super();
	}
	
	/** mine */
	public Menu getComponent(){
		return this;
	}
	
}
