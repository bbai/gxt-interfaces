package gxt.client.visual.implementations;

import gxt.client.visual.interfaces.ISeparatorMenuItem;
import com.extjs.gxt.ui.client.widget.menu.SeparatorMenuItem;

/**
 * @author eugenp
 */
public class VSeparatorMenuItem extends SeparatorMenuItem implements ISeparatorMenuItem{
	
	public VSeparatorMenuItem(){
		super();
	}
	
	//
	public SeparatorMenuItem getComponent(){
		return this;
	}
	
}
