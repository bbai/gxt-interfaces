package gxt.client.visual.implementations;

import gxt.client.visual.interfaces.IItem;

import com.extjs.gxt.ui.client.widget.menu.Item;

/**
 * @author eugenp
 */
public class VItem extends Item implements IItem{
	
	public VItem(){
		super();
	}

	//
	public Item getComponent(){
		return this;
	}
	
}
