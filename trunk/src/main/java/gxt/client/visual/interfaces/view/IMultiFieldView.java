package gxt.client.visual.interfaces.view;

import java.util.List;

import com.extjs.gxt.ui.client.Style.Orientation;
import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.widget.form.Field;
import com.extjs.gxt.ui.client.widget.form.Validator;
import com.google.gwt.user.client.Event;

/**
 * @author eugenp
 */
public interface IMultiFieldView< D > extends IFieldView< D >{
	
	/**
	 * Adds a field (pre-render).
	 * @param field the field to add
	 */
	void add( Field< ? > field );
	
	/**
	 * Returns the field at the index.
	 * @param index the index
	 * @return the field
	 */
	Field< ? > get( int index );
	
	/**
	 * Returns all the child field's.
	 * @return the fields
	 */
	List< Field< ? >> getAll();
	
	/**
	 * Returns the fields orientation.
	 * @return the orientation
	 */
	Orientation getOrientation();
	
	/**
	 * Returns the field's spacing.
	 * @return the spacing
	 */
	int getSpacing();
	
	/**
	 * Returns the field's validator.
	 * @return the validator
	 */
	Validator getValidator();
	
	/**
	 * Returns true if child fields are being resized.
	 * @return the resize field state
	 */
	boolean isResizeFields();
	
	boolean isValid( boolean silent );
	
	void onBrowserEvent( Event event );
	
	void onComponentEvent( ComponentEvent ce );
	
	void reset();
	
	/**
	 * Sets the fields orientation (defaults to horizontal).
	 * @param orientation the orientation
	 */
	void setOrientation( Orientation orientation );
	
	void setReadOnly( boolean readOnly );
	
	/**
	 * True to resize the child fields to fit available space (defaults to false).
	 * @param resizeFields true to resize children
	 */
	void setResizeFields( boolean resizeFields );
	
	/**
	 * Sets the amount of spacing between fields. Spacing is applied to the right of each field for horizontal orientation and applied to the bottom of each field for vertical orientation (defaults to 0, pre-render).
	 * @param spacing the spacing in pixels
	 */
	void setSpacing( int spacing );
	
	/**
	 * Sets the field's validator.
	 * @param validator the validator
	 */
	void setValidator( Validator validator );
	
}
