package gxt.visual.ui.implementations;

import gxt.visual.interfaces.IToolButton;

import com.extjs.gxt.ui.client.event.IconButtonEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.widget.button.ToolButton;

/**
 * @author eugenp
 */
public class VToolButton extends ToolButton implements IToolButton{
	
	public VToolButton( final String style ){
		super( style );
	}
	public VToolButton( final String style, final SelectionListener< IconButtonEvent > listener ){
		super( style, listener );
	}

	//
	@Override
	public ToolButton getComponent(){
		return this;
	}
	
}
