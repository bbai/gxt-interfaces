package gxt.client.visual.interfaces.view;

import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.event.KeyListener;
import com.extjs.gxt.ui.client.widget.form.PropertyEditor;
import com.extjs.gxt.ui.client.widget.form.Field.FieldImages;
import com.extjs.gxt.ui.client.widget.form.Field.FieldMessages;

/**
 * @author eugenp
 */
public interface IFieldView< D > extends IBoxComponentView{

	/**
	 * Adds a CSS style name to the input element of this field.
	 * @param style the style name
	 */
	void addInputStyleName( String style );
	
	/**
	 * Adds a key listener.
	 * @param listener the key listener
	 */
	void addKeyListener( KeyListener listener );
	
	/**
	 * Clears the value from the field.
	 */
	void clear();
	
	/**
	 * Clear any invalid styles / messages for this field.
	 */
	void clearInvalid();
	
	void focus();
	
	/**
	 * Forces the field to be invalid using the given error message. When using this feature, {@link #clearInvalid()} must be called to clear the error. Also, no other validation logic will execute.
	 * @param msg the error text
	 */
	void forceInvalid( String msg );
	
	/**
	 * Returns true if the field value is validated on each key press.
	 * @return the auto validate state
	 */
	boolean getAutoValidate();
	
	/**
	 * Returns the field's empty text.
	 * @return the empty text
	 */
	String getEmptyText();
	
	/**
	 * Returns the active error message as string
	 * @return the active error message
	 */
	
	String getErrorMessage();
	
	/**
	 * Returns the field's label.
	 * @return the label
	 */
	String getFieldLabel();
	
	FieldImages getImages();
	
	/**
	 * Returns the field's label separator.
	 * @return the label separator
	 */
	String getLabelSeparator();
	
	/**
	 * Returns the field's label style.
	 * @return the label style
	 */
	String getLabelStyle();
	
	/**
	 * Returns the field's messages.
	 * @return the messages
	 */
	FieldMessages getMessages();
	
	/**
	 * Returns the field's message target.
	 * @return the message target
	 */
	String getMessageTarget();
	
	/**
	 * Returns the name attribute of the field if available.
	 * @return the field name
	 */
	String getName();
	
	/**
	 * Returns the original value of the field, which is the value of the field when it is first rendered.
	 * @return the original value
	 */
	D getOriginalValue();
	
	/**
	 * Returns the field's property editor.
	 * @return the property editor
	 */
	PropertyEditor< D > getPropertyEditor();
	
	/**
	 * Returns the raw data value which may or may not be a valid, defined value. To return a normalized value see {@link #getValue}.
	 * @return the raw value
	 */
	String getRawValue();
	
	/**
	 * Returns true if the value is validate on blur.
	 * @return the validate on blur state
	 */
	boolean getValidateOnBlur();
	
	/**
	 * Returns the field's validation delay in milliseconds.
	 * @return the delay in milliseconds
	 */
	int getValidationDelay();
	
	/**
	 * Returns the typed value of the field.
	 * @return the fields value
	 */
	D getValue();
	
	/**
	 * Returns <code>true</code> if this field is dirty. A field is dirty, if the current value is different than it's original value. The original value is the value of the field when the field is rendered. Disabled and pre-rendered fields are never
	 * dirty.
	 * @return the dirty state
	 */
	boolean isDirty();
	
	/**
	 * Returns true if a change event is fired when {@link #setValue(Object)} is called.
	 * @return true if the change event is fired
	 */
	boolean isFireChangeEventOnSetValue();
	
	/**
	 * Returns true if the label is hidden.
	 * @return the hide label state
	 */
	boolean isHideLabel();
	
	/**
	 * Returns true if the field is inside an editor.
	 * @return true if inside an editor
	 */
	boolean isInEditor();
	
	/**
	 * Returns the read only state.
	 * @return <code>true</code> if read only, otherwise <code>false</code>
	 */
	boolean isReadOnly();
	
	boolean isValid();
	
	/**
	 * Returns whether or not the field value is currently valid.
	 * @param preventMark true for silent validation (no invalid event and field is not marked invalid)
	 * @return <code>true</code> if the value is valid, otherwise <code>false</code>
	 */
	boolean isValid( boolean preventMark );
	
	/**
	 * Marks this field as invalid. Validation will still run if called again, and the error message will be changed or cleared based on validation. To set a error message that will not be cleared until manually cleared see
	 * {@link #forceInvalid(String)}
	 * @param msg the validation message
	 */
	void markInvalid( String msg );
	
	void onComponentEvent( ComponentEvent ce );
	
	/**
	 * Removes a CSS style name from the input element of this field.
	 * @param style the style name
	 */
	void removeInputStyleName( String style );
	
	/**
	 * Removes the key listener.
	 * @param listener the key listener
	 */
	void removeKeyListener( KeyListener listener );
	
	/**
	 * Resets the current field value to the originally loaded value and clears any validation messages.
	 */
	void reset();
	
	/**
	 * Sets whether the value is validated on each key press (defaults to false).
	 * @param autoValidate true to validate on each key press
	 */
	void setAutoValidate( boolean autoValidate );
	
	/**
	 * Sets the default text to display in an empty field.
	 * @param emptyText the empty text
	 */
	void setEmptyText( String emptyText );
	
	/**
	 * Sets the field's label.
	 * @param fieldLabel the label
	 */
	void setFieldLabel( String fieldLabel );
	
	/**
	 * True to fire a change event when {@link #setValue(Object)} is called (defaults to false).
	 * @param fireChangeEventOnSetValue true to fire a change event
	 */
	void setFireChangeEventOnSetValue( boolean fireChangeEventOnSetValue );
	
	/**
	 * True to completely hide the label element (defaults to false, pre-render).
	 * @param hideLabel true to hide the label
	 */
	void setHideLabel( boolean hideLabel );
	
	// void setImages( FieldImages images ); // new
	
	/**
	 * True to mark this field being in an editor.
	 * @param inEditor true mark this field being in an editor
	 */
	void setInEditor( boolean inEditor );
	
	/**
	 * Sets a style attribute on the input element.
	 * @param attr the attribute
	 * @param value the attribute value
	 */
	void setInputStyleAttribute( String attr, String value );
	
	/**
	 * The standard separator to display after the text of each form label (defaults to the value of {@link FormLayout#setLabelSeparator(String)}, which is a colon ':' by default).
	 * @param labelSeparator the label separator or "" for none
	 */
	void setLabelSeparator( String labelSeparator );
	
	/**
	 * A CSS style specification to apply directly to this field's label. For example, <code>labelStyle: 'font-weight:bold;'</code>
	 * @param labelStyle the label style
	 */
	void setLabelStyle( String labelStyle );
	
	/**
	 * Sets the field's messages.
	 * @param messages the messages
	 */
	// void setMessages( FieldMessages messages ); // new
	
	/**
	 * The location where error text should display. Should be one of the following values (defaults to 'side'): <code><pre>
	 * Value         Description
	 * -----------   ----------------------------------------------------------------------
	 * tooltip       Display a tool tip when the user hovers over the field
	 * title         Display a default browser title attribute popup
	 * side          Add an error icon to the right of the field with a popup on hover
	 * none          Do not display an error message
	 * [element id]  Add the error text directly to the innerHTML of the specified element
	 * </pre></code>
	 * @param messageTarget the message target
	 */
	void setMessageTarget( String messageTarget );
	
	/**
	 * Sets the field's HTML name attribute.
	 * @param name the name
	 */
	void setName( String name );
	
	/**
	 * Updates the original value of the field. The originalValue is the value of the field when it is rendered. This method is useful when a form / field is being reused and the originaValue needs to be reset.
	 * @param originalValue the original value
	 */
	void setOriginalValue( D originalValue );
	
	/**
	 * Sets the field's property editor which is used to translate typed values to string, and string values back to typed values.
	 * @param propertyEditor the property editor
	 */
	void setPropertyEditor( PropertyEditor< D > propertyEditor );
	
	/**
	 * Sets the underlying DOM field's value directly, bypassing validation. To set the value with validation see {@link #setValue}.
	 * @param value the raw value
	 */
	void setRawValue( String value );
	
	/**
	 * Sets the field's read only state.
	 * @param readOnly the read only state
	 */
	void setReadOnly( boolean readOnly );
	
	/**
	 * Sets the tab index.
	 * @param index the tab index value
	 */
	void setTabIndex( int index );
	
	/**
	 * Sets whether the field should validate when it loses focus (defaults to true).
	 * @param validateOnBlur true to validate on blur, otherwise false
	 */
	void setValidateOnBlur( boolean validateOnBlur );
	
	/**
	 * Sets length of time in milliseconds after user input begins until validation is initiated (defaults to 250).
	 * @param validationDelay the delay in milliseconds
	 */
	void setValidationDelay( int validationDelay );
	
	/**
	 * Sets a data value into the field and validates it. If the field is rendered, To set the value directly without validation see {@link #setRawValue}.
	 * @param value the value to set
	 */
	void setValue( D value );
	
	/**
	 * Updates the original value of the field. This method is useful when a form / field is being reused and the originaValue needs to be reset.
	 * @param value the new original value
	 */
	void updateOriginalValue( D value );
	
	/**
	 * Validates the field value.
	 * @return <code>true</code> if valid, otherwise <code>false</code>
	 */
	boolean validate();
	
	/**
	 * Validates the field value.
	 * @param preventMark true to not mark the field valid and fire invalid event when invalid
	 * @return <code>true</code> if valid, otherwise <code>false</code>
	 */
	boolean validate( boolean preventMark );

}
