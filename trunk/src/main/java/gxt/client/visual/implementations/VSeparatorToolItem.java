package gxt.client.visual.implementations;

import gxt.client.visual.interfaces.ISeparatorToolItem;

import com.extjs.gxt.ui.client.widget.toolbar.SeparatorToolItem;

/**
 * @author eugenp
 */
public class VSeparatorToolItem extends SeparatorToolItem implements ISeparatorToolItem{
	
	public VSeparatorToolItem(){
		super();
	}
	
	//
	public SeparatorToolItem getComponent(){
		return this;
	}
	
}
