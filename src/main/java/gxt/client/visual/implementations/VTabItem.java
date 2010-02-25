package gxt.client.visual.implementations;

import gxt.client.visual.interfaces.ITabItem;

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
