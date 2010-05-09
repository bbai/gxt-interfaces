package gxt.visual.ui.client.implementations;

import gxt.visual.ui.client.interfaces.IFlashComponent;

import com.extjs.gxt.ui.client.widget.flash.FlashComponent;

/**
 * @author eugenp
 */
public class VFlashComponent extends FlashComponent implements IFlashComponent{
	
	public VFlashComponent( final String url ){
		super( url );
	}
	
	//
	public FlashComponent getComponent(){
		return this;
	}
	
}
