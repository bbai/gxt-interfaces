package gxt.client.visual.implementations;

import gxt.client.visual.interfaces.ILabelField;

import com.extjs.gxt.ui.client.widget.form.LabelField;

/**
 * @author eugenp
 */
public class VLabelField extends LabelField implements ILabelField{
	
	public VLabelField(){
		super();
	}
	public VLabelField( final String text ){
		super( text );
	}
	
	//
	public LabelField getComponent(){
		return this;
	}
	
}
