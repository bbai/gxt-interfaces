package gxt.visual.ui.client.implementations;

import gxt.visual.ui.client.interfaces.ICheckMenuItem;

import com.extjs.gxt.ui.client.widget.menu.CheckMenuItem;

/**
 * @author eugenp
 */
public class VCheckMenuItem extends CheckMenuItem implements ICheckMenuItem{
	
	public VCheckMenuItem(){
		super();
	}
	public VCheckMenuItem( final String textToSet ){
		super( textToSet );
	}
	
	//
	@Override
	public CheckMenuItem getComponent(){
		return this;
	}
	
}
