package gxt.visual.interfaces.view;

import com.extjs.gxt.ui.client.widget.form.Validator;
import com.extjs.gxt.ui.client.widget.form.TextField.TextFieldMessages;

/**
 * @author eugenp
 */
public interface ITextFieldView< D > extends IFieldView< D >{
	
	/**
	 * Returns the field's allow blank state.
	 * @return true if blank values are allowed
	 */
	boolean getAllowBlank();
	
	/**
	 * Returns the cursor position.
	 * @return the cursor position
	 */
	int getCursorPos();
	
	/**
	 * Returns the field's max length.
	 * @return the max length
	 */
	int getMaxLength();
	
	TextFieldMessages getMessages();
	
	/**
	 * Returns the minimum length.
	 * @return the min length
	 */
	int getMinLength();
	
	/**
	 * Returns the field's regex value.
	 * @return the regex value
	 */
	String getRegex();
	
	/**
	 * Returns the selected text.
	 * @return the selected text
	 */
	String getSelectedText();
	
	/**
	 * Returns the length of the current selection.
	 * @return the selection length
	 */
	int getSelectionLength();
	
	/**
	 * Returns the select of focus state.
	 * @return true if select on focus is enabled
	 */
	boolean getSelectOnFocus();
	
	/**
	 * Returns the field's validator instance.
	 * @return the validator
	 */
	Validator getValidator();
	
	/**
	 * Returns true if the field is a password field.
	 * @return that password state
	 */
	boolean isPassword();
	
	/**
	 * Selects text in the field.
	 * @param start the index where the selection should start.
	 * @param length the number of characters to be selected
	 */
	void select( int start, int length );
	
	/**
	 * Selects all the text.
	 */
	void selectAll();
	
	/**
	 * Sets whether a field is valid when its value length = 0 (default to true).
	 * @param allowBlank true to allow blanks, false otherwise
	 */
	void setAllowBlank( boolean allowBlank );
	
	/**
	 * Sets the cursor position.
	 * @param pos the position
	 */
	void setCursorPos( int pos );
	
	void setEmptyText( String emptyText );
	
	/**
	 * Sets the maximum input field length.
	 * @param maxLength the max length
	 */
	void setMaxLength( int maxLength );
	
	/**
	 * Minimum input field length required (defaults to 0).
	 * @param minLength the minimum length
	 */
	void setMinLength( int minLength );
	
	/**
	 * True to create the text field as a password input (defaults to false, pre-render).
	 * @param password the password state
	 */
	void setPassword( boolean password );
	
	/**
	 * Sets regular expression to be tested against the field value during validation. If available, this regex will be evaluated only after the basic validators all return true. If the test fails, the field will be marked invalid using the regex
	 * error message.
	 * @param regex the regex expression
	 */
	void setRegex( String regex );
	
	/**
	 * Selects the range.
	 * @param pos the position
	 * @param length the range length
	 */
	void setSelectionRange( int pos, int length );
	
	/**
	 * True to automatically select any existing field text when the field receives input focus (defaults to false).
	 * @param selectOnFocus true to focus
	 */
	void setSelectOnFocus( boolean selectOnFocus );
	
	/**
	 * Sets the validator instance to be called during field validation. It will be called only after the basic validators all return true, and will be passed the current field value and expected to return <code>null</code> if the value is valid or a
	 * string error message if invalid. Default value is <code>null</code>.
	 * @param validator the validator
	 */
	void setValidator( Validator validator );

	void setValue( D value );

}
