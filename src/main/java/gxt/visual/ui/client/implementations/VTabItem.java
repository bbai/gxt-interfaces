package gxt.visual.ui.client.implementations;

import gxt.visual.ui.client.interfaces.ITabItem;

import com.extjs.gxt.ui.client.widget.TabItem;

/**
 * @author eugenp
 */
public class VTabItem extends TabItem implements ITabItem{
	
	public VTabItem(){
		super();
	}
	public VTabItem( final String text ){
		super( text );
	}
	
	//
	public TabItem getComponent(){
		return this;
	}

}
