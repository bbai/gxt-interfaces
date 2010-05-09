package gxt.visual.ui.implementations;

import gxt.visual.interfaces.IFillToolItem;

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
