package gxt.visual.interfaces.view;

/**
 * @author eugenp
 */
public interface IHiddenFieldView< D > extends IFieldView< D >{
	
	void clearInvalid();
	
	void markInvalid( String msg );
	
	boolean validate( boolean silent );
	
}
