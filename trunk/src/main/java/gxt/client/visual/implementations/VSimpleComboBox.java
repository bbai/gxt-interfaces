package gxt.client.visual.implementations;

import gxt.client.visual.interfaces.ISimpleComboBox;

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
