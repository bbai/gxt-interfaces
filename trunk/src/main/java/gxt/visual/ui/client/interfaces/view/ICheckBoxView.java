package gxt.visual.ui.client.interfaces.view;

/**
 * @author eugenp
 */
public interface ICheckBoxView extends IFieldView< Boolean >{
	
	void clearInvalid();
	
	String getBoxLabel();
	
	String getRawValue();
	
	Boolean getValue();
	
	/**
	 * Returns the value property of the input element
	 */
	String getValueAttribute();
	
	void markInvalid( String msg );
	
	/**
	 * The text that appears beside the checkbox (defaults to null).
	 * @param boxLabel the box label
	 */
	void setBoxLabel( String boxLabel );
	
	void setRawValue( String value );
	
	void setValue( Boolean value );
	
	/**
	 * Sets a new value attribute to the input element
	 * @param valueAttribute the value attribute to set
	 */
	void setValueAttribute( String valueAttribute );

}
