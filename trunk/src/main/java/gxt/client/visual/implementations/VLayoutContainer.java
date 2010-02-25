package gxt.client.visual.implementations;

import gxt.client.visual.interfaces.ILayoutContainer;

import com.extjs.gxt.ui.client.widget.LayoutContainer;

/**
 * @author eugenp
 */
public class VLayoutContainer extends LayoutContainer implements ILayoutContainer{
	
	public VLayoutContainer(){
		super();
	}
	
	//
	public LayoutContainer getComponent(){
		return this;
	}
	
}
