package gxt.visual.ui.client.implementations;

import gxt.visual.ui.client.interfaces.ISimpleComboBox;

import com.extjs.gxt.ui.client.widget.form.SimpleComboBox;

/**
 * @author eugenp
 */
public class VSimpleComboBox< T > extends SimpleComboBox< T > implements ISimpleComboBox< T >{
	
	public VSimpleComboBox(){
		super();
	}
	
	//
	public SimpleComboBox< T > getComponent(){
		return this;
	}
	
}
