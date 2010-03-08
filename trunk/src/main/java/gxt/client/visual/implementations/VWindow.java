package gxt.client.visual.implementations;

import gxt.client.visual.interfaces.IButton;
import gxt.client.visual.interfaces.IWindow;

import com.extjs.gxt.ui.client.widget.Window;

/**
 * @author eugenp
 */
public class VWindow extends Window implements IWindow{
	
	public VWindow(){
		super();
	}
	
	// added
	public Window getComponent(){
		return this;
	}
	@Override
	public void hide( final IButton buttonPressed ){
		this.hide( buttonPressed.getComponent() );
	}
	
}
