package gxt.visual.ui.implementations;

import gxt.visual.interfaces.IField;

import com.extjs.gxt.ui.client.widget.form.Field;

/**
 * @author eugenp
 */
public class VField< D > extends Field< D > implements IField< D >{
	
	public VField(){
		super();
	}
	
	/** mine */
	public Field< D > getComponent(){
		return this;
	}
	
}
