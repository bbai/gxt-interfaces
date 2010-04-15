package gxt.client.visual.implementations;

import gxt.client.visual.interfaces.IFlashComponent;

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
