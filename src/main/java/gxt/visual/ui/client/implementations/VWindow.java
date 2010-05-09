package gxt.visual.ui.client.implementations;

import gxt.visual.ui.client.interfaces.IButton;
import gxt.visual.ui.client.interfaces.IWindow;

import com.extjs.gxt.ui.client.widget.Window;

/**
 * @author eugenp
 */
public class VWindow extends Window implements IWindow{
	
	public VWindow(){
		super();
	}
	
	/** mine */
	public Window getComponent(){
		return this;
	}
	
	//
	@Override
	public void hide( final IButton buttonPressed ){
		this.hide( buttonPressed.getComponent() );
	}
	
}
