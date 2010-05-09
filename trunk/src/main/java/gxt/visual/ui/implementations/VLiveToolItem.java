package gxt.visual.ui.implementations;

import gxt.visual.interfaces.ILiveToolItem;

import com.extjs.gxt.ui.client.widget.toolbar.LiveToolItem;

/**
 * @author eugenp
 */
public class VLiveToolItem extends LiveToolItem implements ILiveToolItem{
	
	public VLiveToolItem(){
		super();
	}
	
	//
	public LiveToolItem getComponent(){
		return this;
	}
	
}
