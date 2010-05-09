package gxt.visual.ui.client.implementations;

import gxt.visual.ui.client.interfaces.IFillToolItem;

import com.extjs.gxt.ui.client.widget.toolbar.FillToolItem;

/**
 * @author eugenp
 */
public class VFillToolItem extends FillToolItem implements IFillToolItem{
	
	public VFillToolItem(){
		super();
	}
	
	//
	public FillToolItem getComponent(){
		return this;
	}
	
}
