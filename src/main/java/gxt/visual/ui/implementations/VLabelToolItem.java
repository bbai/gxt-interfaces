package gxt.visual.ui.implementations;

import gxt.visual.interfaces.ILabelToolItem;

import com.extjs.gxt.ui.client.widget.toolbar.LabelToolItem;

/**
 * @author eugenp
 */
public class VLabelToolItem extends LabelToolItem implements ILabelToolItem{
	
	public VLabelToolItem(){
		super();
	}
	public VLabelToolItem( final String label ){
		super( label );
	}
	
	//
	public LabelToolItem getComponent(){
		return this;
	}
	
}
