package gxt.visual.ui.implementations;

import gxt.visual.interfaces.IIconButton;

import com.extjs.gxt.ui.client.widget.button.IconButton;

/**
 * @author eugenp
 */
public class VIconButton extends IconButton implements IIconButton{
	
	public VIconButton( final String style){
		super( style );
	}

	//
	public IconButton getComponent(){
		return this;
	}
	
}
