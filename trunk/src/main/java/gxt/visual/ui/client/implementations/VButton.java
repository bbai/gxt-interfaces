package gxt.visual.ui.client.implementations;

import gxt.visual.ui.client.interfaces.IButton;

import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.google.gwt.user.client.ui.AbstractImagePrototype;

/**
 * @author eugenp
 */
public class VButton extends Button implements IButton{
	
	public VButton(){
		super();
	}
	public VButton( final String textToUse ){
		super( textToUse );
	}
	public VButton( final String textToUse, final AbstractImagePrototype iconToUse ){
		super( textToUse, iconToUse );
	}
	public VButton( final String textToUse, final AbstractImagePrototype iconToUse, final SelectionListener< ButtonEvent > listener ){
		super( textToUse, iconToUse, listener );
	}
	public VButton( final String textToUse, final SelectionListener< ButtonEvent > listener ){
		super( textToUse, listener );
	}
	
	//
	public Button getComponent(){
		return this;
	}
	
}
