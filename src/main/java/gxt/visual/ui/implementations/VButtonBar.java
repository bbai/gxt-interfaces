package gxt.visual.ui.implementations;

import gxt.visual.interfaces.IButtonBar;

import com.extjs.gxt.ui.client.widget.button.ButtonBar;

/**
 * @author eugenp
 */
public class VButtonBar extends ButtonBar implements IButtonBar{
	
	public VButtonBar(){
		super();
	}

	//
	public ButtonBar getComponent(){
		return this;
	}

}
