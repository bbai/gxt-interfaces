package gxt.visual.ui.client.implementations;

import gxt.visual.ui.client.interfaces.IAdapterField;

import com.extjs.gxt.ui.client.widget.form.AdapterField;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author eugenp
 */
public class VAdapterField extends AdapterField implements IAdapterField{
	
	public VAdapterField( final Widget widgetToSet ){
		super( widgetToSet );
	}
	
	/** mine */
	public AdapterField getComponent(){
		return this;
	}
	
}
