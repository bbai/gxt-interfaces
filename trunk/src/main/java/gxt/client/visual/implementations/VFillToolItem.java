package gxt.client.visual.implementations;

import gxt.client.visual.interfaces.IFillToolItem;

import com.extjs.gxt.ui.client.widget.toolbar.FillToolItem;

/**
 * @author eugenp
 */
public final class VFillToolItem extends FillToolItem implements IFillToolItem{
	
	public VFillToolItem(){
		super();
	}
	
	//
	public FillToolItem getComponent(){
		return this;
	}
	
}
