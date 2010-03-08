package gxt.client.visual.implementations;

import gxt.client.visual.interfaces.IButton;
import gxt.client.visual.interfaces.IDialog;

import com.extjs.gxt.ui.client.widget.Dialog;

/**
 * @author eugenp
 */
public class VDialog extends Dialog implements IDialog{
	
	public VDialog(){
		super();
	}

	//
	public Dialog getComponent(){
		return this;
	}
	@Override
	public void hide( final IButton buttonPressed ){
		this.hide( buttonPressed.getComponent() );
	}
	
}
