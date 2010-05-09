package gxt.visual.ui.implementations;

import gxt.visual.interfaces.IButton;
import gxt.visual.interfaces.IWindow;

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
