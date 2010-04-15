package gxt.client.visual.implementations;

import gxt.client.visual.interfaces.IHeaderMenuItem;

import com.extjs.gxt.ui.client.widget.menu.HeaderMenuItem;

/**
 * @author eugenp
 */
public class VHeaderMenuItem extends HeaderMenuItem implements IHeaderMenuItem{
	
	public VHeaderMenuItem(){
		super();
	}
	public VHeaderMenuItem( final String text ){
		super( text );
	}
	
	//
	public HeaderMenuItem getComponent(){
		return this;
	}
	
}
