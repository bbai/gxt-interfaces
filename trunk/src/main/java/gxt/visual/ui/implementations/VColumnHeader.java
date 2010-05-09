package gxt.visual.ui.implementations;

import gxt.visual.interfaces.IColumnHeader;

import com.extjs.gxt.ui.client.widget.BoxComponent;
import com.extjs.gxt.ui.client.widget.grid.ColumnHeader;
import com.extjs.gxt.ui.client.widget.grid.ColumnModel;

/**
 * @author eugenp
 */
public class VColumnHeader extends ColumnHeader implements IColumnHeader{
	
	public VColumnHeader( final BoxComponent container, final ColumnModel cm ){
		super( container, cm );
	}
	
	//
	public ColumnHeader getComponent(){
		return this;
	}
	
}
