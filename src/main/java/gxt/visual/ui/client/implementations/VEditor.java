package gxt.visual.ui.client.implementations;

import gxt.visual.ui.client.interfaces.IEditor;

import com.extjs.gxt.ui.client.widget.Editor;
import com.extjs.gxt.ui.client.widget.form.Field;

/**
 * @author eugenp
 */
public class VEditor extends Editor implements IEditor{

	public VEditor( final Field field ){
		super( field );
	}

	//
	public Editor getComponent(){
		return this;
	}
	
}
