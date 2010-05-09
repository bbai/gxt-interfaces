package gxt.visual.ui.client.interfaces.view;

import com.extjs.gxt.ui.client.core.El;
import com.extjs.gxt.ui.client.widget.form.Field;
import com.google.gwt.user.client.Element;

/**
 * @author eugenp
 */
public interface IEditorView extends IBoxComponentView{
	
	/**
	 * Cancels the editing process and hides the editor without persisting any changes. The field value will be reverted to the original starting value.
	 */
	void cancelEdit();
	
	/**
	 * Ends the editing process, persists the changed value to the underlying field, and hides the editor.
	 */
	void completeEdit();
	
	/**
	 * Returns the editor's alignment.
	 * @return the alignment
	 */
	String getAlignment();
	
	/**
	 * Returns the editor's field.
	 * @return the field
	 */
	Field getField();
	
	/**
	 * Returns the data value of the editor.
	 * @return the value
	 */
	Object getValue();
	
	/**
	 * Returns true if blurs are allowed.
	 * @return the allow blur state
	 */
	boolean isAllowBlur();
	
	/**
	 * Returns true if cancel on escape is enabled.
	 * @return the cancel on escape state
	 */
	boolean isCancelOnEsc();
	
	boolean isCancelOnInvalid();
	
	/**
	 * Returns true if complete on enter is enabled.
	 * @return the complete on enter state
	 */
	boolean isCompleteOnEnter();
	
	/**
	 * Returns true if the editor is constrained to the viewport.
	 * @return the constrain state
	 */
	boolean isConstrain();
	
	/**
	 * Returns true of the editor reverts the value to the start value on invalid.
	 * @return the revert invalid state
	 */
	boolean isRevertInvalid();
	
	/**
	 * Returns true if key presses are being swallowed.
	 * @return the swallow key state
	 */
	boolean isSwallowKeys();
	
	/**
	 * Returns true if the inner HTML of the bound element is updated when the update is complete.
	 * @return the update element state
	 */
	boolean isUpdateEl();
	
	/**
	 * Called after the editor completes an edit.
	 * @param value the value from the editor
	 * @return the updated value
	 */
	Object postProcessValue( Object value );
	
	/**
	 * Called before the editor sets the value on the wrapped field.
	 * @param value the editor value
	 * @return the updated value
	 */
	Object preProcessValue( Object value );
	
	/**
	 * Realigns the editor to the bound field based on the current alignment config value.
	 */
	void realign();
	
	/**
	 * The position to align to (see {@link El#alignTo} for more details, defaults to "c-c?").
	 * @param alignment the alignment
	 */
	void setAlignment( String alignment );
	
	/**
	 * Sets whether editing should be cancelled when the field is blurred (defaults to false).
	 * @param allowBlur true to allow blur
	 */
	void setAllowBlur( boolean allowBlur );
	
	/**
	 * True to cancel the edit when the escape key is pressed (defaults to false).
	 * @param cancelOnEsc true to cancel on escape
	 */
	void setCancelOnEsc( boolean cancelOnEsc );
	
	void setCancelOnInvalid( boolean cancelOnInvalid );
	
	/**
	 * True to complete the edit when the enter key is pressed (defaults to false).
	 * @param completeOnEnter true to complete on enter
	 */
	void setCompleteOnEnter( boolean completeOnEnter );
	
	/**
	 * True to constrain the editor to the viewport.
	 * @param constrain true to constrain
	 */
	void setConstrain( boolean constrain );
	
	/**
	 * True to revert to start value on invalid value (defaults to true).
	 * @param revertInvalid true to revert
	 */
	void setRevertInvalid( boolean revertInvalid );
	
	/**
	 * Handle the keypress events so they don't propagate (defaults to true).
	 * @param swallowKeys true to swallow key press events.
	 */
	void setSwallowKeys( boolean swallowKeys );
	
	/**
	 * True to update the innerHTML of the bound element when the update completes (defaults to false).
	 * @param updateEl true to update the inner HTML
	 */
	void setUpdateEl( boolean updateEl );
	
	/**
	 * Sets the data value of the editor
	 * @param value any valid value supported by the underlying field
	 */
	void setValue( Object value );
	
	/**
	 * Starts the editing process and shows the editor.
	 * @param el the element to edit
	 */
	void startEdit( Element el, Object value );
	
}
