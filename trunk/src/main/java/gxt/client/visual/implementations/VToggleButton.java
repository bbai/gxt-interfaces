package gxt.client.visual.implementations;

import gxt.client.visual.interfaces.IToggleButton;

import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.widget.button.ToggleButton;
import com.google.gwt.user.client.ui.AbstractImagePrototype;

/**
 * @author eugenp
 */
public class VToggleButton extends ToggleButton implements IToggleButton{
	
	public VToggleButton(){
		super();
	}
	public VToggleButton( final String textToUse ){
		super( textToUse );
	}
	public VToggleButton( final String textToUse, final AbstractImagePrototype iconToUse ){
		super( textToUse, iconToUse );
	}
	public VToggleButton( final String textToUse, final SelectionListener< ButtonEvent > listener ){
		super( textToUse, listener );
	}
	
	//
	public ToggleButton getComponent(){
		return this;
	}
	
}
