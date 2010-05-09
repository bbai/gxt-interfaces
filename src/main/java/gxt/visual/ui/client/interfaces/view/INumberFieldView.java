package gxt.visual.ui.client.interfaces.view;

import com.extjs.gxt.ui.client.widget.form.NumberPropertyEditor;
import com.extjs.gxt.ui.client.widget.form.NumberField.NumberFieldMessages;
import com.google.gwt.i18n.client.NumberFormat;

/**
 * @author eugenp
 */
public interface INumberFieldView extends ITextFieldView< Number >{
	
	/**
	 * Returns true of decimal values are allowed.
	 * @return the allow decimal state
	 */
	boolean getAllowDecimals();
	
	/**
	 * Returns true if negative values are allowed.
	 * @return the allow negative value state
	 */
	boolean getAllowNegative();
	
	/**
	 * Returns the base characters.
	 * @return the base characters
	 */
	String getBaseChars();
	
	/**
	 * Returns the field's number format.
	 * @return the number format
	 */
	NumberFormat getFormat();
	
	/**
	 * Returns the fields max value.
	 * @return the max value
	 */
	Number getMaxValue();
	
	NumberFieldMessages getMessages();
	
	/**
	 * Returns the field's minimum value.
	 * @return the min value
	 */
	Number getMinValue();
	
	NumberPropertyEditor getPropertyEditor();
	
	/**
	 * Returns the number property editor number type.
	 * @see NumberPropertyEditor#setType(Class)
	 * @return the number type
	 */
	Class< ? > getPropertyEditorType();
	
	/**
	 * Sets whether decimal value are allowed (defaults to true).
	 * @param allowDecimals true to allow negative values
	 */
	void setAllowDecimals( boolean allowDecimals );
	
	/**
	 * Sets whether negative value are allowed.
	 * @param allowNegative true to allow negative values
	 */
	void setAllowNegative( boolean allowNegative );
	
	/**
	 * Sets the base set of characters to evaluate as valid numbers (defaults to '0123456789').
	 * @param baseChars the base character
	 */
	void setBaseChars( String baseChars );
	
	/**
	 * Sets the cell's number formatter.
	 * @param format the format
	 */
	void setFormat( NumberFormat format );
	
	/**
	 * Sets the field's max allowable value.
	 * @param maxValue the max value
	 */
	void setMaxValue( Number maxValue );
	
	/**
	 * Sets the field's minimum allowed value.
	 * @param minValue the min value
	 */
	void setMinValue( Number minValue );
	
	/**
	 * Specifies the number type used when converting a String to a Number instance (defaults to Double).
	 * @param type the number type (Short, Integer, Long, Float, Double).
	 */
	void setPropertyEditorType( Class< ? > type );
	
}
