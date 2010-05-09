package gxt.visual.ui.implementations;

import gxt.visual.interfaces.IFieldSet;

import com.extjs.gxt.ui.client.widget.form.FieldSet;

/**
 * @author eugenp
 */
public class VFieldSet extends FieldSet implements IFieldSet{
	
	public VFieldSet(){
		super();
	}
	
	//
	public FieldSet getComponent(){
		return this;
	}
	
}
