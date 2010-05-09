package gxt.visual.ui.implementations;

import gxt.visual.interfaces.IHiddenField;

import com.extjs.gxt.ui.client.widget.form.HiddenField;

/**
 * @author eugenp
 */
public class VHiddenField< D > extends HiddenField< D > implements IHiddenField< D >{
	
	public VHiddenField(){
		super();
	}
	
	//
	public HiddenField< D > getComponent(){
		return this;
	}
	
}
