package gxt.visual.ui.client.implementations;

import gxt.visual.ui.client.interfaces.IAdapterMenuItem;

import com.extjs.gxt.ui.client.widget.menu.AdapterMenuItem;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author eugenp
 */
public class VAdapterMenuItem extends AdapterMenuItem implements IAdapterMenuItem{
	
	public VAdapterMenuItem( final Widget widgetToSet ){
		super( widgetToSet );
	}
	
	/** mine */
	public AdapterMenuItem getComponent(){
		return this;
	}
	
}
