package gxt.client.visual.implementations;

import gxt.client.visual.interfaces.IEditor;
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
