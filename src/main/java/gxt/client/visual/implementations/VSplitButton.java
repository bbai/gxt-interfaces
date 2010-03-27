package gxt.client.visual.implementations;

import gxt.client.visual.interfaces.ISplitButton;

import com.extjs.gxt.ui.client.widget.button.SplitButton;

/**
 * @author eugenp
 */
public class VSplitButton extends SplitButton implements ISplitButton{
	
	public VSplitButton(){
		super();
	}
	
	//
	public SplitButton getComponent(){
		return this;
	}
	
}
