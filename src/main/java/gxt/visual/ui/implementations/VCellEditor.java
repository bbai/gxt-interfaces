package gxt.visual.ui.implementations;

import gxt.visual.interfaces.ICellEditor;

import com.extjs.gxt.ui.client.widget.form.Field;
import com.extjs.gxt.ui.client.widget.grid.CellEditor;

/**
 * @author eugenp
 */
public class VCellEditor extends CellEditor implements ICellEditor{
	
	public VCellEditor( final Field< ? extends Object > field ){
		super( field );
	}
	
	//
	@Override
	public CellEditor getComponent(){
		return this;
	}
	
}
