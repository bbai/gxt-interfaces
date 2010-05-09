package gxt.visual.ui.client.interfaces.view;

import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.widget.form.Field;
import com.extjs.gxt.ui.client.widget.form.ListField;
import com.extjs.gxt.ui.client.widget.form.DualListField.DualListFieldMessages;
import com.extjs.gxt.ui.client.widget.form.DualListField.Mode;

/**
 * @author eugenp
 */
public interface IDualListFieldView< D extends ModelData > extends IMultiFieldView< Field< ? > >{
	
	String getDNDGroup();
	
	/**
	 * Returns the from list field.
	 * @return the field
	 */
	ListField< D > getFromList();
	
	DualListFieldMessages getMessages();
	
	/**
	 * Returns the list field's mode.
	 * @return the mode
	 */
	Mode getMode();
	
	/**
	 * Returns the to list field.
	 * @return the field
	 */
	ListField< D > getToList();
	
	/**
	 * Returns true if drag and drop is enabled.
	 * @return true if drag and drop is enabled
	 */
	boolean isEnableDND();
	
	/**
	 * Sets the drag and drop group name. A group name will be generated if none is specified.
	 * @param group the group name
	 */
	void setDNDGroup( String group );
	
	/**
	 * True to allow selections to be dragged and dropped between lists (defaults to true).
	 * @param enableDND true to enable drag and drop
	 */
	void setEnableDND( boolean enableDND );
	
	/**
	 * Specifies if selections are either inserted or appended when moving between lists.
	 * @param mode the mode
	 */
	void setMode( Mode mode );
	
}
