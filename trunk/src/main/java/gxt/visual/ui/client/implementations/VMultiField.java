package gxt.visual.ui.client.implementations;

import gxt.visual.ui.client.interfaces.IMultiField;

import com.extjs.gxt.ui.client.widget.form.MultiField;

/**
 * @author eugenp
 */
public class VMultiField< D > extends MultiField< D > implements IMultiField< D >{
	
	public VMultiField(){
		super();
	}
	
	//
	public MultiField< D > getComponent(){
		return this;
	}

}
