package gxt.visual.ui.client.interfaces.view;

import java.util.List;

import com.extjs.gxt.ui.client.core.El;
import com.extjs.gxt.ui.client.widget.form.Field;
import com.extjs.gxt.ui.client.widget.form.FormPanel.Encoding;
import com.extjs.gxt.ui.client.widget.form.FormPanel.LabelAlign;
import com.extjs.gxt.ui.client.widget.form.FormPanel.Method;

public interface IFormPanelView extends IContentPanelView{
	
	/**
	 * Clears all values from all fields.
	 */
	void clear();
	
	/**
	 * Resets all field values.
	 */
	void reset();
	
	/**
	 * Returns the form's action.
	 * @return the action url
	 */
	String getAction();
	
	/**
	 * Returns the encoding.
	 * @return the encoding
	 */
	Encoding getEncoding();
	
	/**
	 * Returns all of the panel's child fields. Fields in nested containers are included in the returned list.
	 * @return the fields
	 */
	List< Field< ? >> getFields();
	
	/**
	 * Returns the field width.
	 * @return the field width
	 */
	int getFieldWidth();
	
	/**
	 * Returns true if labels are being hidden.
	 * @return the hide label state
	 */
	boolean getHideLabels();
	
	/**
	 * Returns the label alignment.
	 * @return the label alignment
	 */
	LabelAlign getLabelAlign();
	
	/**
	 * Returns the label separator.
	 * @return the label separator
	 */
	String getLabelSeparator();
	
	/**
	 * Returns the default width.
	 * @return the label width
	 */
	int getLabelWidth();
	
	El getLayoutTarget();
	
	/**
	 * Returns the form's method. Only applies when using standard HTML form submits.
	 * @return the method the method
	 */
	Method getMethod();
	
	/**
	 * Returns the panel's padding.
	 * @return the padding
	 */
	int getPadding();
	
	/**
	 * Gets the form's "target".
	 * @return the form's target.
	 */
	String getTarget();
	
	/**
	 * Returns true if any of the form's fields are dirty.
	 * @return true for dirty
	 */
	boolean isDirty();
	
	/**
	 * Returns true if the form is invalid.
	 * @return true if all fields are valid
	 */
	boolean isValid();
	
	/**
	 * Returns the form's valid state by querying all child fields.
	 * @param preventMark true for silent validation (no invalid event and field is not marked invalid)
	 * @return true if all fields are valid
	 */
	boolean isValid( boolean preventMark );
	
	/**
	 * Sets the action of the form.
	 * @param url the action
	 */
	void setAction( String url );
	
	/**
	 * Sets the encoding used for submitting this form.
	 * @param encoding the encoding
	 */
	void setEncoding( Encoding encoding );
	
	/**
	 * Sets the default field width (defaults to 210).
	 * @param fieldWidth the field width
	 */
	void setFieldWidth( int fieldWidth );
	
	/**
	 * True to hide field labels by default (defaults to false).
	 * @param hideLabels true to hide labels
	 */
	void setHideLabels( boolean hideLabels );
	
	/**
	 * Sets the label alignment.
	 * @param align the alignment
	 */
	void setLabelAlign( LabelAlign align );
	
	/**
	 * Sets the label separator (defaults to ':').
	 * @param labelSeparator the label separator
	 */
	void setLabelSeparator( String labelSeparator );
	
	/**
	 * Sets the default label width.
	 * @param labelWidth the label width
	 */
	void setLabelWidth( int labelWidth );
	
	/**
	 * Specifies if the form will be submitted using an HTTP Post or Get request (defaults to GET).
	 * @param method the method
	 */
	void setMethod( Method method );
	
	/**
	 * Sets the padding to be applied to the FormPanel body (defaults to 10).
	 * @param padding the padding
	 */
	void setPadding( int padding );
	
	/**
	 * Sets all of the panel's fields read only state.
	 * @param readOnly true for read only
	 */
	void setReadOnly( boolean readOnly );
	
	/**
	 * Submits the form.
	 */
	void submit();
	
}
