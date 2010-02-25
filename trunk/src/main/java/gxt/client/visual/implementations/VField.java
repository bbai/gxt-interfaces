package gxt.client.visual.implementations;

import gxt.client.visual.interfaces.IField;

import com.extjs.gxt.ui.client.widget.form.Field;

/**
 * @author eugenp
 */
public final class VField< D > extends Field< D > implements IField< D >{
	
	public VField(){
		super();
	}
	
	//
	public Field< D > getComponent(){
		return this;
	}
	
}
