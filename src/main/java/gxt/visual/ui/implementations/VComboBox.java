package gxt.visual.ui.implementations;

import gxt.visual.interfaces.IComboBox;

import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.widget.form.ComboBox;

/**
 * @author eugenp
 */
public class VComboBox< D extends ModelData > extends ComboBox< D > implements IComboBox< D >{
	
	public VComboBox(){
		super();
	}
	
	//
	public ComboBox< D > getComponent(){
		return this;
	}
	
}
