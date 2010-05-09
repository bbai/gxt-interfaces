package gxt.visual.ui.implementations;

import gxt.visual.interfaces.IWidget;

import com.google.gwt.user.client.ui.Widget;

/**
 * @author eugenp
 */
public class VWidget extends Widget implements IWidget{
	
	public VWidget(){
		super();
	}
	
	/** mine */
	public Widget getComponent(){
		return this;
	}

}
