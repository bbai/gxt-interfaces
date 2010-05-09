package gxt.visual.interfaces.view;

/**
 * @author eugenp
 */
public interface ILabelFieldView extends IFieldView< Object >{
	
	/**
	 * Returns the field's text.
	 * @return the text
	 */
	String getText();
	
	Object getValue();
	
	boolean isDirty();
	
	boolean isValid( boolean silent );
	
	void markInvalid( String msg );
	
	/**
	 * Sets the lable's text.
	 * @param text the text as HTML
	 */
	void setText( String text );
	
	void setValue( Object value );
	
	boolean validate( boolean silent );

}
